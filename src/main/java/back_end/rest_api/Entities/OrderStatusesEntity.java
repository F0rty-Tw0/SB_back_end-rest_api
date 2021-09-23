package back_end.rest_api.Entities;

import javax.persistence.*;

@Entity
@Table(name = "order_statuses", schema = "swc3_springboot", catalog = "")
public class OrderStatusesEntity {
    private Long id;
    private byte orderStatusId;
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
    @Column(name = "order_status_id")
    public byte getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(byte orderStatusId) {
        this.orderStatusId = orderStatusId;
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

        OrderStatusesEntity that = (OrderStatusesEntity) o;

        if (orderStatusId != that.orderStatusId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) orderStatusId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
