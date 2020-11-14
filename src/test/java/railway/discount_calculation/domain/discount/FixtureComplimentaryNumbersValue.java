package railway.discount_calculation.domain.discount;

import railway.discount_calculation.domain.common.Numbers;

public class FixtureComplimentaryNumbersValue {
  public static ComplimentaryNumbers get(int children, int adults) {
    return new ComplimentaryNumbers(
        Children.from(Numbers.from(children)), Adults.from(Numbers.from(adults)));
  }
}
