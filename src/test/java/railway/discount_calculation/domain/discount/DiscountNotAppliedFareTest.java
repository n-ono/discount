package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import railway.discount_calculation.domain.common.Percent;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountNotAppliedFareTest {
  @Test
  public void applied() {
    GroupDiscountNotAppliedFare actual =
        FixtureDiscountNotAppliedFareValue.get(8090).applied(Percent.ten());

    assertEquals(FixtureGroupDiscountNotAppliedFareValue.get(7280), actual);
  }
}
