package railway.discount_calculation.domain.catalogue;

import railway.discount_calculation.domain.common.Destination;
import railway.discount_calculation.domain.discount.BusinessKilometer;

public interface CatalogueRepository {
  BusinessKilometer findBy(Destination destination);
}
