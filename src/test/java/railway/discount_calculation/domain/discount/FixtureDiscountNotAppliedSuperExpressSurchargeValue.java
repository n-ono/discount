package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Amount;

public class FixtureDiscountNotAppliedSuperExpressSurchargeValue {
  public static DiscountNotAppliedSuperExpressSurcharge get(int n) {
    return DiscountNotAppliedSuperExpressSurcharge.from(Amount.from(n));
  }
}
