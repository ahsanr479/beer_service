package ahsan.micro.beer_service.repositories;

import ahsan.micro.beer_service.domain.Beer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
