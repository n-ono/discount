package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import railway.discount_calculation.domain.common.Numbers;

import static org.junit.jupiter.api.Assertions.*;

class AdultsTest {
  @Test
  public void zero() {
    assertEquals(Adults.from(Numbers.from(0)), Adults.zero());
  }
}
