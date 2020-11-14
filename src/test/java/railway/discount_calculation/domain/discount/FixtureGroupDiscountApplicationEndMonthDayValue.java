package railway.discount_calculation.domain.discount;

import java.time.MonthDay;

public class FixtureGroupDiscountApplicationEndMonthDayValue {
  public static GroupDiscountApplicationEndMonthDay get(int month, int dayOfMonth) {
    return GroupDiscountApplicationEndMonthDay.from(MonthDay.of(month, dayOfMonth));
  }
}
