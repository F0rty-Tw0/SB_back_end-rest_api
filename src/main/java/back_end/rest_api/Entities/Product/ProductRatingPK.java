package back_end.rest_api.Entities.Product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class ProductRatingPK implements Serializable {

    @NotNull
    private int customerId;

    @NotNull
    private int productId;
}
