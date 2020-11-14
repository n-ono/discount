package railway.discount_calculation.domain.discount;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import railway.discount_calculation.domain.common.DepartureMonthDay;

import java.time.MonthDay;

/**
 * 団体割引適用終了月日
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupDiscountApplicationEndMonthDay {
  private final MonthDay value;

  public static GroupDiscountApplicationEndMonthDay from(MonthDay monthDay) {
    return new GroupDiscountApplicationEndMonthDay(monthDay);
  }

  public boolean isBefore(DepartureMonthDay departureMonthDay) {
    return value.isBefore(departureMonthDay.getValue());
  }
}
