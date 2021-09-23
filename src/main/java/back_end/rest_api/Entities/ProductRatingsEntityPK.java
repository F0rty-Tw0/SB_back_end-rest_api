package back_end.rest_api.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ProductRatingsEntityPK implements Serializable {
    private int customerId;
    private int productId;

    @Column(name = "customer_id")
    @Id
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Column(name = "product_id")
    @Id
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

        ProductRatingsEntityPK that = (ProductRatingsEntityPK) o;

        if (customerId != that.customerId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + productId;
        return result;
    }
}
