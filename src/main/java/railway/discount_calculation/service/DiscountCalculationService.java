package railway.discount_calculation.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import railway.discount_calculation.domain.common.DepartureMonthDay;
import railway.discount_calculation.domain.common.Destination;
import railway.discount_calculation.domain.common.TripType;
import railway.discount_calculation.domain.catalogue.CatalogueRepository;
import railway.discount_calculation.domain.discount.*;

@Service
@AllArgsConstructor
public class DiscountCalculationService {
  @Autowired private final CatalogueRepository catalogueRepository;

  public DiscountAppliedFare calculate(
      DiscountNotAppliedFare discountNotAppliedFare,
      TripType tripType,
      Destination destination,
      Group group,
      DepartureMonthDay departureMonthDay) {
    BusinessKilometer businessKilometer = catalogueRepository.findBy(destination);
    return DiscountApplicationDomainService.apply(
        discountNotAppliedFare, tripType, businessKilometer, group, departureMonthDay);
  }

  public DiscountAppliedSuperExpressSurcharge calculate(
      DiscountNotAppliedSuperExpressSurcharge discountNotAppliedSuperExpressSurcharge,
      Group group,
      DepartureMonthDay departureMonthDay) {
    return DiscountApplicationDomainService.apply(
        discountNotAppliedSuperExpressSurcharge, group, departureMonthDay);
  }

  public ComplimentaryNumbers calculate(Group group) {
    return ComplimentaryNumbersCalculationDomainService.calculate(group);
  }
}
