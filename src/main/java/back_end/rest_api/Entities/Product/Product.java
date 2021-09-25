package back_end.rest_api.Entities.Product;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
@Entity
@Table(name = "products", schema = "products_shop")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private int productId;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Basic
    @Column(name = "quantity_in_stock", nullable = false)
    private int quantityInStock;

    @Basic
    @Column(name = "unit_price", nullable = false, precision = 2)
    private double unitPrice;

    // TODO add image_path, rating_average, ratings_number

    @Basic
    @Column(name = "image_path", nullable = true, length = 255)
    private String imagePath;

    @Basic
    @Column(name = "rating_average", nullable = true, precision = 6)
    private double ratingAverage;

    @Basic
    @Column(name = "ratings_number", nullable = true)
    private int ratingsNumber;

    @Transient
    public void updateRating(int rating, int ratingDifference, String action) {
        if (ratingsNumber == 0) {
            setRatingAverage(rating);
            setRatingsNumber(ratingsNumber + 1);
            return;
        }

        switch (action) {
            case "new":
                setRatingAverage(((ratingAverage * ratingsNumber) + rating) / (ratingsNumber + 1));
                setRatingsNumber(ratingsNumber + 1);
                break;
            case "update":
                setRatingAverage(((ratingAverage * ratingsNumber) + ratingDifference) / ratingsNumber);
                // We do not increment the ratingsNumber because it was an update of existing
                // rating.
                break;
            case "delete":
                if (ratingsNumber == 1) {
                    setRatingAverage(0);
                    setRatingsNumber(0);
                } else {
                    setRatingAverage(((ratingAverage * ratingsNumber) - ratingDifference) / (ratingsNumber - 1));
                    setRatingsNumber(ratingsNumber - 1);
                }
                break;
            default:
                // code block
        }
    }
}
