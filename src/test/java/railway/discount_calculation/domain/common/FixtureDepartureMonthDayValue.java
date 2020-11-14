package railway.discount_calculation.domain.common;

import railway.discount_calculation.domain.common.DepartureMonthDay;

import java.time.MonthDay;

public class FixtureDepartureMonthDayValue {
  public static DepartureMonthDay get(int month, int dayOfMonth) {
    return DepartureMonthDay.from(MonthDay.of(month, dayOfMonth));
  }
}
