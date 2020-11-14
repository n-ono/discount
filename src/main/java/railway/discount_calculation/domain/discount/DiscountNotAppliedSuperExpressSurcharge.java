package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Amount;
import railway.discount_calculation.domain.common.Percent;

/**
 * 割引を適用する前の特急料金
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountNotAppliedSuperExpressSurcharge {
  @Getter private final Amount amount;

  public static DiscountNotAppliedSuperExpressSurcharge from(Amount amount) {
    return new DiscountNotAppliedSuperExpressSurcharge(amount);
  }

  public DiscountAppliedSuperExpressSurcharge applied(Percent percent) {
    return DiscountAppliedSuperExpressSurcharge.from(amount.percentOf(percent.rest()));
  }
}
