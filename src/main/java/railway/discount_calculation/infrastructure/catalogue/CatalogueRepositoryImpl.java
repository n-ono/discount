package railway.discount_calculation.infrastructure.catalogue;

import io.vavr.API;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import railway.discount_calculation.domain.common.Destination;
import railway.discount_calculation.domain.catalogue.CatalogueRepository;
import railway.discount_calculation.domain.discount.BusinessKilometer;
import railway.discount_calculation.infrastructure.catalogue.response.CatalogueResponse;

import java.util.Objects;

import static io.vavr.API.$;

@Repository
@AllArgsConstructor
public class CatalogueRepositoryImpl implements CatalogueRepository {
  public static final String URL =
      "http://catalogue:8080/catalogue/business-kilometer?destination={destination}";

  @Autowired private final RestTemplate restTemplate;

  @Override
  public BusinessKilometer findBy(Destination destination) {
    return BusinessKilometer.from(
        Objects.requireNonNull(
                restTemplate.getForObject(
                    URL, CatalogueResponse.class, getDestination(destination)))
            .getValue());
  }

  private String getDestination(Destination destination) {
    return API.Match(destination)
        .of(
            API.Case($(Destination.SHINOSAKA), "shinosaka"),
            API.Case($(Destination.HIMEJI), "himeji"));
  }
}
