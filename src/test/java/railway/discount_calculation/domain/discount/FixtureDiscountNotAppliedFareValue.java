package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Amount;

public class FixtureDiscountNotAppliedFareValue {
  public static DiscountNotAppliedFare get(int n) {
    return DiscountNotAppliedFare.from(Amount.from(n));
  }
}
