package back_end.rest_api.Entities.Payment;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode
@Setter
@Getter
@Entity
@Table(name = "payments", schema = "products_shop")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", nullable = false)
    private int paymentId;

    @Basic
    @Column(name = "invoice_id", nullable = false)
    private int invoiceId;

    @Basic
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Basic
    @Column(name = "amount", nullable = false, precision = 2)
    private long amount;

    @Basic
    @Column(name = "payment_method", nullable = false)
    private byte paymentMethod;

    @Basic
    @Column(name = "customer_id", nullable = false)
    private int customerId;

}