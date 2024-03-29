package railway.discount_calculation.domain.discount;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import railway.discount_calculation.domain.common.Numbers;

/**
 * 団体
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Group {
  private final Children children;
  private final Adults adults;

  public boolean meetGroupDiscountAppliedCondition() {
    return isGreaterThanOrEqual(Numbers.from(8));
  }

  public boolean isGreaterThanOrEqual(Numbers other) {
    return total().isGreaterThanOrEqual(other);
  }

  public boolean isLessThanOrEqual(Numbers other) {
    return total().isLessThanOrEqual(other);
  }

  public Numbers getChildren() {
    return children.getNumbers();
  }

  public Numbers getAdults() {
    return adults.getNumbers();
  }

  public Numbers total() {
    return children.getNumbers().plus(adults.getNumbers());
  }
}
