package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Amount;

/**
 * 割引適用済み運賃
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountAppliedFare {
  @Getter private final Amount amount;

  public static DiscountAppliedFare from(Amount amount) {
    return new DiscountAppliedFare(amount);
  }
}
