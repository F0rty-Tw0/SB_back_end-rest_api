package back_end.rest_api.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products", schema = "swc3_springboot", catalog = "")
public class ProductsEntity {
    private Long id;
    private int productId;
    private String name;
    private int quantityInStock;
    private BigDecimal unitPrice;
    private String imagePath;
    private BigDecimal ratingAverage;
    private Integer ratingsNumber;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "quantity_in_stock")
    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Basic
    @Column(name = "unit_price")
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "image_path")
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "rating_average")
    public BigDecimal getRatingAverage() {
        return ratingAverage;
    }

    public void setRatingAverage(BigDecimal ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    @Basic
    @Column(name = "ratings_number")
    public Integer getRatingsNumber() {
        return ratingsNumber;
    }

    public void setRatingsNumber(Integer ratingsNumber) {
        this.ratingsNumber = ratingsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (productId != that.productId) return false;
        if (quantityInStock != that.quantityInStock) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (imagePath != null ? !imagePath.equals(that.imagePath) : that.imagePath != null) return false;
        if (ratingAverage != null ? !ratingAverage.equals(that.ratingAverage) : that.ratingAverage != null)
            return false;
        if (ratingsNumber != null ? !ratingsNumber.equals(that.ratingsNumber) : that.ratingsNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + quantityInStock;
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (ratingAverage != null ? ratingAverage.hashCode() : 0);
        result = 31 * result + (ratingsNumber != null ? ratingsNumber.hashCode() : 0);
        return result;
    }
}
