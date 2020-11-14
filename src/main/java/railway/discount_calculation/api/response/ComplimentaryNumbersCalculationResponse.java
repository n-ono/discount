package railway.discount_calculation.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ComplimentaryNumbersCalculationResponse {
  @Getter private final int children;
  @Getter private final int adults;
}
