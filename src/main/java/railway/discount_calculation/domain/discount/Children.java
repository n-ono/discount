package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Numbers;

/**
 * 子供の人数
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Children {
  @Getter private final Numbers numbers;

  public static Children from(Numbers numbers) {
    return new Children(numbers);
  }

  public static Children zero() {
    return new Children(Numbers.zero());
  }
}
