package railway.discount_calculation.api;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import railway.discount_calculation.api.response.ComplimentaryNumbersCalculationResponse;
import railway.discount_calculation.api.utility.DiscountCalculationApiUtility;
import railway.discount_calculation.domain.discount.ComplimentaryNumbers;
import railway.discount_calculation.service.DiscountCalculationService;

@RestController
@AllArgsConstructor
public class ComplimentaryNumbersCalculationApi {
  @Autowired private final DiscountCalculationService service;

  @RequestMapping(value = "/calculate-complimentary-numbers", method = RequestMethod.GET)
  public ComplimentaryNumbersCalculationResponse calculate(
      @RequestParam(name = "children") int children, @RequestParam(name = "adults") int adults) {
    ComplimentaryNumbers complimentaryNumbers =
        service.calculate(DiscountCalculationApiUtility.getGroup(children, adults));
    return new ComplimentaryNumbersCalculationResponse(
        complimentaryNumbers.getChildren().getNumbers().getValue(),
        complimentaryNumbers.getAdults().getNumbers().getValue());
  }
}
