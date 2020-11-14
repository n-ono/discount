package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Amount;

public class FixtureDiscountAppliedSuperExpressSurchargeValue {
  public static DiscountAppliedSuperExpressSurcharge get(int n) {
    return DiscountAppliedSuperExpressSurcharge.from(Amount.from(n));
  }
}
