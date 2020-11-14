package railway.discount_calculation.domain.utility;

import org.junit.jupiter.api.Test;
import railway.discount_calculation.domain.common.FixtureNumbersValue;
import railway.discount_calculation.domain.common.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountDomainUtilityTest {
  @Test
  public void min() {
    Numbers numbers1 = FixtureNumbersValue.get(30);
    Numbers numbers2 = FixtureNumbersValue.get(20);

    assertEquals(Numbers.from(20), DiscountDomainUtility.min(numbers1, numbers2));
  }
}
