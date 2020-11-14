package railway.discount_calculation.api.utility;

import railway.discount_calculation.domain.common.Numbers;
import railway.discount_calculation.domain.discount.Adults;
import railway.discount_calculation.domain.discount.Children;
import railway.discount_calculation.domain.common.DepartureMonthDay;
import railway.discount_calculation.domain.discount.Group;

import java.time.MonthDay;

public class DiscountCalculationApiUtility {
  public static Group getGroup(int children, int adults) {
    return new Group(Children.from(Numbers.from(children)), Adults.from(Numbers.from(adults)));
  }

  public static DepartureMonthDay getDepartureMonthDay(String departureMonthDay) {
    final int month = Integer.parseInt(departureMonthDay.substring(0, 2));
    final int dayOfMonth = Integer.parseInt(departureMonthDay.substring(2, 4));
    return DepartureMonthDay.from(MonthDay.of(month, dayOfMonth));
  }
}
