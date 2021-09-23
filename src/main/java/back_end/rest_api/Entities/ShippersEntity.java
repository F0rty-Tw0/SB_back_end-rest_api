package back_end.rest_api.Entities;

import javax.persistence.*;

@Entity
@Table(name = "shippers", schema = "swc3_springboot", catalog = "")
public class ShippersEntity {
    private Long id;
    private short shipperId;
    private String name;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "shipper_id")
    public short getShipperId() {
        return shipperId;
    }

    public void setShipperId(short shipperId) {
        this.shipperId = shipperId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShippersEntity that = (ShippersEntity) o;

        if (shipperId != that.shipperId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) shipperId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
