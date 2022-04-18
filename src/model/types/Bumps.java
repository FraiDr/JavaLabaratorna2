package model.types;

import model.Sex;
import model.ShoeInfo;

public class Bumps extends ShoeInfo {


  private Boolean isLacquered;
  private String typeOfToeCap;
  private String typeOfHeels;

  public Bumps(String model, String brand, Sex sex, String material, String color, Integer size,
      Integer priceInUah, Boolean haveHeels, Boolean isAvailable, Boolean correctiveInsole,
      Boolean isLacquered, String typeOfToeCap, String typeOfHeels) {
    super(model, brand, sex, material, color, size, priceInUah, haveHeels, isAvailable,
        correctiveInsole);
    this.isLacquered = isLacquered;
    this.typeOfToeCap = typeOfToeCap;
    this.typeOfHeels = typeOfHeels;
  }

  @Override
  public String toString() {
    return "Bumps [isLacquered=" + isLacquered + ", typeOfToeCap=" + typeOfToeCap + ", typeOfHeels="
        + typeOfHeels + "," + super.toString() + "]";
  }



}
