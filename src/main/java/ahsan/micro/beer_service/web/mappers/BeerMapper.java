package ahsan.micro.beer_service.web.mappers;

import ahsan.micro.beer_service.domain.Beer;
import ahsan.micro.beer_service.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
