package back_end.rest_api.Entities.Invoice;

import org.hibernate.annotations.GenericGenerator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;

@EqualsAndHashCode
@Setter
@Getter
@Entity
@Table(name = "invoices", schema = "products_shop")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "invoice_id", nullable = false)
    private int invoiceId;

    @Basic
    @Column(name = "number", nullable = false, length = 50)
    private String number;

    @Basic
    @Column(name = "invoice_total", nullable = false, precision = 2)
    private double invoiceTotal;

    @Basic
    @Column(name = "payment_total", nullable = false, precision = 2)
    private double paymentTotal;

    @Basic
    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;

    @Basic
    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;

    @Basic
    @Column(name = "payment_date", nullable = true)
    private LocalDate paymentDate;

    @Basic
    @Column(name = "order_id", nullable = false)
    private int orderId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private InvoiceStatus status;
}