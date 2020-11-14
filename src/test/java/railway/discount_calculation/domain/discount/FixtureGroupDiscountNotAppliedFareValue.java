package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Amount;

public class FixtureGroupDiscountNotAppliedFareValue {
  public static GroupDiscountNotAppliedFare get(int n) {
    return GroupDiscountNotAppliedFare.from(Amount.from(n));
  }
}
