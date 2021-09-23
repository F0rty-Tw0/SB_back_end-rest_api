package back_end.rest_api.Entities;

import javax.persistence.*;

@Entity
@Table(name = "payment_methods", schema = "swc3_springboot", catalog = "")
public class PaymentMethodsEntity {
    private Long id;
    private byte paymentMethodId;
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
    @Column(name = "payment_method_id")
    public byte getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(byte paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
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

        PaymentMethodsEntity that = (PaymentMethodsEntity) o;

        if (paymentMethodId != that.paymentMethodId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) paymentMethodId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
