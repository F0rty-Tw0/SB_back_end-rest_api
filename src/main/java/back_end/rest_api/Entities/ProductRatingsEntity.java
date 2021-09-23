package back_end.rest_api.Entities;

import javax.persistence.*;

@Entity
@Table(name = "product_ratings", schema = "swc3_springboot", catalog = "")
@IdClass(ProductRatingsEntityPK.class)
public class ProductRatingsEntity {
    private Long id;
    private Object rating;
    private String review;
    private int customerId;
    private int productId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rating")
    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "review")
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Id
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
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

        ProductRatingsEntity that = (ProductRatingsEntity) o;

        if (customerId != that.customerId) return false;
        if (productId != that.productId) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (review != null ? !review.equals(that.review) : that.review != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rating != null ? rating.hashCode() : 0;
        result = 31 * result + (review != null ? review.hashCode() : 0);
        result = 31 * result + customerId;
        result = 31 * result + productId;
        return result;
    }
}
