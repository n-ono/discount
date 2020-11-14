package railway.discount_calculation.domain.common;

import lombok.*;

/**
 * 割合
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Percent {
  @Getter private final int value;

  public static Percent zero() {
    return new Percent(0);
  }

  public static Percent ten() {
    return new Percent(10);
  }

  public static Percent fifteen() {
    return new Percent(15);
  }

  public Percent rest() {
    return new Percent(100 - value);
  }
}
