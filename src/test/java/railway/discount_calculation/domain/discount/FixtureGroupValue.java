package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Numbers;

public class FixtureGroupValue {
  public static Group get(int children, int adults) {
    return new Group(Children.from(Numbers.from(children)), Adults.from(Numbers.from(adults)));
  }
}
