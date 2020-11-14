package railway.discount_calculation.domain.discount;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import railway.discount_calculation.domain.common.DepartureMonthDay;

import java.time.Month;
import java.time.MonthDay;

/**
 * 団体割引 10% 適用期間
 */
@EqualsAndHashCode
@ToString
public class GroupDiscountTenPercentApplicationTerm {
  private static final GroupDiscountApplicationStartMonthDay START_MONTH_DAY =
      GroupDiscountApplicationStartMonthDay.from(MonthDay.of(Month.DECEMBER, 21));
  private static final GroupDiscountApplicationEndMonthDay END_MONTH_DAY =
      GroupDiscountApplicationEndMonthDay.from(MonthDay.of(Month.JANUARY, 10));

  public static boolean include(DepartureMonthDay departureMonthDay) {
    return !(START_MONTH_DAY.isAfter(departureMonthDay)
        && END_MONTH_DAY.isBefore(departureMonthDay));
  }
}
