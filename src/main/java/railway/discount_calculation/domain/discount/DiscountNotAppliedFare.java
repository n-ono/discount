package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Amount;
import railway.discount_calculation.domain.common.Percent;

/**
 * 割引適用前の運賃
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountNotAppliedFare {
  @Getter private final Amount amount;

  public static DiscountNotAppliedFare from(Amount amount) {
    return new DiscountNotAppliedFare(amount);
  }

  public GroupDiscountNotAppliedFare applied(Percent percent) {
    return GroupDiscountNotAppliedFare.from(amount.percentOf(percent.rest()));
  }
}
