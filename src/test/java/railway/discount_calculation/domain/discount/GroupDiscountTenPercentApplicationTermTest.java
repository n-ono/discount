package railway.discount_calculation.domain.discount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import railway.discount_calculation.domain.common.FixtureDepartureMonthDayValue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupDiscountTenPercentApplicationTermTest {
  @ParameterizedTest
  @CsvSource({"12, 21", "12, 22", "1, 9", "1, 10"})
  public void include(int month, int dayOfMonth) {
    assertTrue(
        GroupDiscountTenPercentApplicationTerm.include(
            FixtureDepartureMonthDayValue.get(month, dayOfMonth)));
  }

  @ParameterizedTest
  @CsvSource({"12, 20", "1, 11"})
  public void notInclude(int month, int dayOfMonth) {
    assertFalse(
        GroupDiscountTenPercentApplicationTerm.include(
            FixtureDepartureMonthDayValue.get(month, dayOfMonth)));
  }
}
