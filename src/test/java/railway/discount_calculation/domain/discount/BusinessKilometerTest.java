package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BusinessKilometerTest {
  @ParameterizedTest
  @CsvSource({"601, 600", "601, 601"})
  public void isGreaterThanOrEqual(int src1, int src2) {
    assertTrue(BusinessKilometer.from(src1).isGreaterThanOrEqual(BusinessKilometer.from(src2)));
  }

  @Test
  public void isNotGreaterThanOrEqual() {
    assertFalse(BusinessKilometer.from(601).isGreaterThanOrEqual(BusinessKilometer.from(602)));
  }
}
