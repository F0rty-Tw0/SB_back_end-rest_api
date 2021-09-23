package back_end.rest_api.Entities.Product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "product_ratings", schema = "swc3_springboot")
public class ProductRating {
    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "customerId", column = @Column(name = "customer_id")),
            @AttributeOverride(name = "productId", column = @Column(name = "product_id")) })
    ProductRatingPK productRatingId;

    @Basic
    @Column(name = "rating", nullable = false)
    private int rating;

    @Basic
    @Column(name = "review", nullable = true, length = -1) // length -1 ???
    private String review;
}
