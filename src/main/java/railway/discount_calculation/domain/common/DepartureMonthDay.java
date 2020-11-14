package railway.discount_calculation.domain.common;

import lombok.*;

import java.time.MonthDay;

/**
 * 出発月日
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DepartureMonthDay {
  @Getter private final MonthDay value;

  public static DepartureMonthDay from(MonthDay monthDay) {
    return new DepartureMonthDay(monthDay);
  }
}
