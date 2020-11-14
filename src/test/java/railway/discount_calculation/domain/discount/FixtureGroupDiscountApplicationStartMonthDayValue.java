package railway.discount_calculation.domain.discount;

import java.time.MonthDay;

public class FixtureGroupDiscountApplicationStartMonthDayValue {
  public static GroupDiscountApplicationStartMonthDay get(int month, int dayOfMonth) {
    return GroupDiscountApplicationStartMonthDay.from(MonthDay.of(month, dayOfMonth));
  }
}
