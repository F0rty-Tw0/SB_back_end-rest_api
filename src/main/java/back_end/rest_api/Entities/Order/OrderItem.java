package back_end.rest_api.Entities.Order;

import com.fasterxml.jackson.annotation.JsonBackReference;

import back_end.rest_api.Entities.Product.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "order_items", schema = "products_shop")
@IdClass(OrderItemPK.class)
public class OrderItem {
    @Id
    @Column(name = "order_id", nullable = false)
    private int orderId;

    @Id
    @Column(name = "product_id", nullable = false)
    private int productId;

    @Basic
    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Basic
    @Column(name = "unit_price", nullable = false, precision = 2)
    private double unitPrice;

    @OneToMany(mappedBy = "orderItems")
    private Collection<OrderItemNote> orderItemNotes;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable = false, insertable = false, updatable = false)
    private Order ordersByOrderId;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", nullable = false, insertable = false, updatable = false)
    private Product product;

    @Transient
    public double getTotalPrice() {
        return getUnitPrice() * getQuantity();
    }
}
