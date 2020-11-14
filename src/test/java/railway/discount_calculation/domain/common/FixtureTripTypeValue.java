package railway.discount_calculation.domain.common;

import railway.discount_calculation.domain.common.TripType;

public class FixtureTripTypeValue {
  public static TripType get(String s) {
    return s.equals("one-way") ? TripType.ONE_WAY : TripType.ROUND;
  }
}
