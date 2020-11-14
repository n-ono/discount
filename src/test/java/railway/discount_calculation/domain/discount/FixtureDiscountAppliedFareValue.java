package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Amount;

public class FixtureDiscountAppliedFareValue {
  public static DiscountAppliedFare get(int n) {
    return DiscountAppliedFare.from(Amount.from(n));
  }
}
