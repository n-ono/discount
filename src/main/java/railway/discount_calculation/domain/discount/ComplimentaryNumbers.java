package railway.discount_calculation.domain.discount;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * 無料の人数
 */
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class ComplimentaryNumbers {
  @Getter private final Children children;
  @Getter private final Adults adults;
}
