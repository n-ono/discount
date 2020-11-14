package railway.discount_calculation.domain.discount;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import railway.discount_calculation.domain.common.DepartureMonthDay;

import java.time.MonthDay;

/**
 * 団体割引適用開始月日
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupDiscountApplicationStartMonthDay {
  private final MonthDay value;

  public static GroupDiscountApplicationStartMonthDay from(MonthDay monthDay) {
    return new GroupDiscountApplicationStartMonthDay(monthDay);
  }

  public boolean isAfter(DepartureMonthDay departureMonthDay) {
    return value.isAfter(departureMonthDay.getValue());
  }
}
