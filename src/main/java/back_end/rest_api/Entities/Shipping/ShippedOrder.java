package back_end.rest_api.Entities.Shipping;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mapping a view

@EqualsAndHashCode
@Setter
@Getter
@Entity
@Immutable // so that we cannot change data through this class
@Table(name = "shipped_orders", schema = "products_shop") // @Table but it is a view
public class ShippedOrder {

    @Basic
    @Column(name = "order_id", nullable = false)
    @Id
    private int orderId;

    @Basic
    @Column(name = "shipped_date")
    private Date shippedDate;

    @Basic
    @Column(name = "customer", length = 101)
    private String customer;

    @Basic
    @Column(name = "shipper", nullable = false, length = 50)
    private String shipper;
}
