package railway.discount_calculation.domain.discount;

import lombok.*;
import railway.discount_calculation.domain.common.Numbers;

/**
 * 大人の人数
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Adults {
  @Getter private final Numbers numbers;

  public static Adults from(Numbers numbers) {
    return new Adults(numbers);
  }

  public static Adults zero() {
    return new Adults(Numbers.zero());
  }
}
