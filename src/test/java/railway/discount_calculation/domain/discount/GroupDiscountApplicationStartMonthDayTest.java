package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import railway.discount_calculation.domain.common.FixtureDepartureMonthDayValue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupDiscountApplicationStartMonthDayTest {
  @Test
  public void isAfter() {
    assertTrue(
        FixtureGroupDiscountApplicationStartMonthDayValue.get(9, 4)
            .isAfter(FixtureDepartureMonthDayValue.get(9, 3)));
  }

  @ParameterizedTest
  @CsvSource({"9, 3, 9, 4", "9, 4, 9, 4"})
  public void isNotAfter(int month, int dayOfMonth, int expectedMonth, int expectedDayOfMonth) {
    assertFalse(
        FixtureGroupDiscountApplicationStartMonthDayValue.get(month, dayOfMonth)
            .isAfter(FixtureDepartureMonthDayValue.get(expectedMonth, expectedDayOfMonth)));
  }
}
