package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import railway.discount_calculation.domain.common.FixtureDepartureMonthDayValue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupDiscountApplicationEndMonthDayTest {
  @Test
  public void isBefore() {
    assertTrue(
        FixtureGroupDiscountApplicationEndMonthDayValue.get(9, 3)
            .isBefore(FixtureDepartureMonthDayValue.get(9, 4)));
  }

  @ParameterizedTest
  @CsvSource({"9, 4, 9, 3", "9, 4, 9, 4"})
  public void isNotBefore(int month, int dayOfMonth, int expectedMonth, int expectedDayOfMonth) {
    assertFalse(
        FixtureGroupDiscountApplicationEndMonthDayValue.get(month, dayOfMonth)
            .isBefore(FixtureDepartureMonthDayValue.get(expectedMonth, expectedDayOfMonth)));
  }
}
