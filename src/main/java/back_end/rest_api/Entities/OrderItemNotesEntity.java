package back_end.rest_api.Entities;

import javax.persistence.*;

@Entity
@Table(name = "order_item_notes", schema = "swc3_springboot", catalog = "")
public class OrderItemNotesEntity {
    private Long id;
    private int noteId;
    private String note;
    private int orderId;
    private int productId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "note_id")
    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemNotesEntity that = (OrderItemNotesEntity) o;

        if (noteId != that.noteId) return false;
        if (orderId != that.orderId) return false;
        if (productId != that.productId) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + orderId;
        result = 31 * result + productId;
        return result;
    }
}
