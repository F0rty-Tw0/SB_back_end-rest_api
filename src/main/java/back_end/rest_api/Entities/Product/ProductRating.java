package back_end.rest_api.Entities.Product;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "product_ratings", schema = "products_shop")
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
