package railway.discount_calculation.domain.common;

import railway.discount_calculation.domain.common.Numbers;

public class FixtureNumbersValue {
  public static Numbers get(int n) {
    return Numbers.from(n);
  }
}
