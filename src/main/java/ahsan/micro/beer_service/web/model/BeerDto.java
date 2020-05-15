package ahsan.micro.beer_service.web.model;

import lombok.*;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {

    @Null
    private UUID id;

    @Null
    private  Integer version;

    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastModifiedDate;
    @NotBlank
    @Size(min = 3, max = 100)
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private Long upc;

    @Positive
    @NotNull
    private BigDecimal price;

    @Positive
    private Integer quantityOnHand;

}
