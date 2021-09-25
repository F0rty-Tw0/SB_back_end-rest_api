package back_end.rest_api.Entities.Order;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@EqualsAndHashCode
@Setter
@Getter
@Entity
@Table(name = "orders", schema = "products_shop")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private int orderId;

    @Basic
    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Basic
    // @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Basic
    @Column(name = "status", nullable = false)
    private byte status;

    @Basic
    @Column(name = "comments", nullable = true, length = 2000)
    private String comments;

    @Basic
    @Column(name = "shipped_date", nullable = true)
    private LocalDate shippedDate;

    @Basic
    @Column(name = "shipper_id", nullable = true)
    private Short shipperId;

    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<OrderItem> orderItems;

    // Hibernate will ignore this fields
    @Transient
    public Double getTotalOrderPrice() {
        double sum = 0;
        for (OrderItem orderItem : getOrderItems()) {
            sum += orderItem.getTotalPrice();
        }
        return sum;
    }

    @Transient
    public int getProductsNumber() {
        int sum = 0;
        for (OrderItem orderItem : getOrderItems()) {
            sum += orderItem.getQuantity();
        }
        return sum;
    }
}
