package railway.discount_calculation.api;

import io.vavr.API;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import railway.discount_calculation.api.response.FareDiscountCalculationResponse;
import railway.discount_calculation.api.utility.DiscountCalculationApiUtility;
import railway.discount_calculation.domain.common.Amount;
import railway.discount_calculation.domain.common.Destination;
import railway.discount_calculation.domain.common.TripType;
import railway.discount_calculation.domain.catalogue.CatalogueRepository;
import railway.discount_calculation.domain.discount.DiscountAppliedFare;
import railway.discount_calculation.domain.discount.DiscountNotAppliedFare;
import railway.discount_calculation.service.DiscountCalculationService;

import static io.vavr.API.$;
import static io.vavr.API.Match;

@RestController
@AllArgsConstructor
public class FareDiscountCalculationApi {
  @Autowired private final DiscountCalculationService service;
  @Autowired private final CatalogueRepository catalogueRepository;

  @RequestMapping(value = "/discount-fare", method = RequestMethod.GET)
  public FareDiscountCalculationResponse calculate(
      @RequestParam(name = "fare") int fare,
      @RequestParam(name = "trip-type") String tripType,
      @RequestParam(name = "destination") String destination,
      @RequestParam(name = "children") int children,
      @RequestParam(name = "adults") int adults,
      @RequestParam(name = "departure-month-day") String departureMonthDay) {
    DiscountAppliedFare discountAppliedFare =
        service.calculate(
            getDiscountNotAppliedFare(fare),
            getTripType(tripType),
            getDestination(destination),
            DiscountCalculationApiUtility.getGroup(children, adults),
            DiscountCalculationApiUtility.getDepartureMonthDay(departureMonthDay));
    return new FareDiscountCalculationResponse(discountAppliedFare.getAmount().getValue());
  }

  private DiscountNotAppliedFare getDiscountNotAppliedFare(int fare) {
    return DiscountNotAppliedFare.from(Amount.from(fare));
  }

  private TripType getTripType(String tripType) {
    return Match(tripType)
        .of(API.Case($("one-way"), TripType.ONE_WAY), API.Case($("round"), TripType.ROUND));
  }

  private Destination getDestination(String destination) {
    return Match(destination)
        .of(
            API.Case($("shinosaka"), Destination.SHINOSAKA),
            API.Case($("himeji"), Destination.HIMEJI));
  }
}
