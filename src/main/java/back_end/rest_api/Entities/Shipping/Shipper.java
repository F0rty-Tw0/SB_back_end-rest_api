package back_end.rest_api.Entities.Shipping;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
@Entity
@Table(name = "shippers", schema = "products_shop")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipper_id", nullable = false)
    private short shipperId;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;

}