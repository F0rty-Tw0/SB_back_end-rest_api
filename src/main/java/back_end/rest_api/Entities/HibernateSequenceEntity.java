package back_end.rest_api.Entities;

import javax.persistence.*;

@Entity
@Table(name = "hibernate_sequence", schema = "swc3_springboot", catalog = "")
public class HibernateSequenceEntity {
    private Long id;
    private Long nextVal;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "next_val")
    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HibernateSequenceEntity that = (HibernateSequenceEntity) o;

        if (nextVal != null ? !nextVal.equals(that.nextVal) : that.nextVal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return nextVal != null ? nextVal.hashCode() : 0;
    }
}
