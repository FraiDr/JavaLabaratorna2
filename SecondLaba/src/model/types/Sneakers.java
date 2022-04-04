package model.types;

import model.Sex;
import model.ShoeInfo;

public class Sneakers extends ShoeInfo {

  private Purpose purpose;
  private boolean isNetting;

  public Sneakers(String model, String brand, Sex sex, String material, String color, int size,
      int priceInUah, boolean haveHeels, boolean isAvailable, boolean correctiveInsole,
      Purpose purpose, boolean isNetting) {
    super(model, brand, sex, material, color, size, priceInUah, haveHeels, isAvailable,
        correctiveInsole);
    this.purpose = purpose;
    this.isNetting = isNetting;

  }

  @Override
  public String toString() {
    return "Sneakers [purpose=" + purpose + ", isNetting=" + isNetting + "," + super.toString()
        + "]";
  }


}
