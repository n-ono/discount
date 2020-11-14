package railway.discount_calculation.domain.utility;

import railway.discount_calculation.domain.common.Numbers;

public class DiscountDomainUtility {
  public static Numbers min(Numbers numbers1, Numbers numbers2) {
    return numbers1.isLessThan(numbers2) ? numbers1 : numbers2;
  }
}
