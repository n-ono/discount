package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Amount;
import railway.discount_calculation.domain.common.Percent;

/**
 * 団体割引適用前の運賃
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupDiscountNotAppliedFare {
  @Getter private final Amount amount;

  public static GroupDiscountNotAppliedFare from(Amount amount) {
    return new GroupDiscountNotAppliedFare(amount);
  }

  public DiscountAppliedFare applied(Percent percent) {
    return DiscountAppliedFare.from(amount.percentOf(percent.rest()));
  }
}
