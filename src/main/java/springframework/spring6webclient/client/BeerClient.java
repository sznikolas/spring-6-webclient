package springframework.spring6webclient.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springframework.spring6webclient.model.BeerDTO;

import java.util.Map;

public interface BaerClient {

    Flux<String> listBeer();

    Flux<Map> listBeerMap();

    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDTO> listBeerDtos();

    Mono<BeerDTO> getBeerById(String id);

    Flux<BeerDTO> getBeerByBeerStyle(String beerStyle);

    Mono<BeerDTO> createBeer(BeerDTO beerDTO);

    Mono<BeerDTO> updateBeer(BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(BeerDTO beerDTO);

    Mono<Void> deleteBeer(BeerDTO beerDTO);
}
