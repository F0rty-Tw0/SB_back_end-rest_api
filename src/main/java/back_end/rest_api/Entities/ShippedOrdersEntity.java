package back_end.rest_api.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "shipped_orders", schema = "swc3_springboot", catalog = "")
public class ShippedOrdersEntity {
    private Long id;
    private int orderId;
    private Date shippedDate;
    private String customer;
    private String shipper;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "shipped_date")
    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    @Basic
    @Column(name = "customer")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "shipper")
    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShippedOrdersEntity that = (ShippedOrdersEntity) o;

        if (orderId != that.orderId) return false;
        if (shippedDate != null ? !shippedDate.equals(that.shippedDate) : that.shippedDate != null) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        if (shipper != null ? !shipper.equals(that.shipper) : that.shipper != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (shippedDate != null ? shippedDate.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (shipper != null ? shipper.hashCode() : 0);
        return result;
    }
}
