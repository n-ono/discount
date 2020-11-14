package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import railway.discount_calculation.domain.common.Percent;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountNotAppliedSuperExpressSurchargeTest {
  @Test
  public void applied() {
    DiscountAppliedSuperExpressSurcharge actual =
        FixtureDiscountNotAppliedSuperExpressSurchargeValue.get(5810).applied(Percent.fifteen());

    assertEquals(FixtureDiscountAppliedSuperExpressSurchargeValue.get(4930), actual);
  }
}
