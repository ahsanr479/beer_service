package ahsan.micro.beer_service.web.controller;

import ahsan.micro.beer_service.services.BeerService;
import ahsan.micro.beer_service.web.model.BeerDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/beer/")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity getBeerBYID(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity(beerService.getById(beerId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){
        //todo impl
        return new ResponseEntity(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId,@RequestBody @Validated BeerDto beerDto){
        // todo impl
        return new ResponseEntity(beerService.updateBeer(beerId,beerDto),HttpStatus.NO_CONTENT);
    }


}
