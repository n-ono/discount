package railway.discount_calculation.api;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import railway.discount_calculation.api.response.SuperExpressSurchargeDiscountCalculationResponse;
import railway.discount_calculation.api.utility.DiscountCalculationApiUtility;
import railway.discount_calculation.domain.common.Amount;
import railway.discount_calculation.domain.discount.DiscountAppliedSuperExpressSurcharge;
import railway.discount_calculation.domain.discount.DiscountNotAppliedSuperExpressSurcharge;
import railway.discount_calculation.service.DiscountCalculationService;

@RestController
@AllArgsConstructor
public class SuperExpressSurchargeDiscountCalculationApi {
  @Autowired private final DiscountCalculationService service;

  @RequestMapping(value = "/discount-super-express-surcharge", method = RequestMethod.GET)
  public SuperExpressSurchargeDiscountCalculationResponse calculate(
      @RequestParam(name = "super-express-surcharge") int superExpressSurcharge,
      @RequestParam(name = "children") int children,
      @RequestParam(name = "adults") int adults,
      @RequestParam(name = "departure-month-day") String departureMonthDay) {
    DiscountAppliedSuperExpressSurcharge discountAppliedSuperExpressSurcharge =
        service.calculate(
            getDiscountNotAppliedSuperExpressSurcharge(superExpressSurcharge),
            DiscountCalculationApiUtility.getGroup(children, adults),
            DiscountCalculationApiUtility.getDepartureMonthDay(departureMonthDay));
    return new SuperExpressSurchargeDiscountCalculationResponse(
        discountAppliedSuperExpressSurcharge.getAmount().getValue());
  }

  private DiscountNotAppliedSuperExpressSurcharge getDiscountNotAppliedSuperExpressSurcharge(
      int superExpressSurcharge) {
    return DiscountNotAppliedSuperExpressSurcharge.from(Amount.from(superExpressSurcharge));
  }
}
