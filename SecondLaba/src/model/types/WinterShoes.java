package model.types;

import model.Sex;
import model.ShoeInfo;

public class WinterShoes extends ShoeInfo {
  private Boolean isWaterResistant;
  private Boolean isFur;

  public WinterShoes(String model, String brand, Sex sex, String material, String color, int size,
      int priceInUah, boolean haveHeels, boolean isAvailable, boolean correctiveInsole,
      boolean isWaterResistant, boolean isFur) {
    super(model, brand, sex, material, color, size, priceInUah, haveHeels, isAvailable,
        correctiveInsole);
    this.isWaterResistant = isWaterResistant;
    this.isFur = isFur;
  }

  @Override
  public String toString() {
    return "WinterShoes [isWaterResistant=" + isWaterResistant + ", isFur=" + isFur + ","
        + super.toString() + "]";
  }



}
