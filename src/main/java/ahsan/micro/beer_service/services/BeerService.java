package ahsan.micro.beer_service.services;

import ahsan.micro.beer_service.web.model.BeerDto;


import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
