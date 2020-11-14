package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Amount;

/**
 * 割引を適用した特急料金
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountAppliedSuperExpressSurcharge {
  @Getter private final Amount amount;

  public static DiscountAppliedSuperExpressSurcharge from(Amount amount) {
    return new DiscountAppliedSuperExpressSurcharge(amount);
  }
}
