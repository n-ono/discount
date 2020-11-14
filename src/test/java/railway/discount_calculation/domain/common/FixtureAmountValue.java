package railway.discount_calculation.domain.common;

import railway.discount_calculation.domain.common.Amount;

public class FixtureAmountValue {
  public static Amount get(int n) {
    return Amount.from(n);
  }
}
