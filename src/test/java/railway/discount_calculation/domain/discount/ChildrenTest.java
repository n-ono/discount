package railway.discount_calculation.domain.discount;

import org.junit.jupiter.api.Test;
import railway.discount_calculation.domain.common.Numbers;

import static org.junit.jupiter.api.Assertions.*;

class ChildrenTest {
  @Test
  public void zero() {
    assertEquals(Children.from(Numbers.from(0)), Children.zero());
  }
}
