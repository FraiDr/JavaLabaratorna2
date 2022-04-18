package model;


public abstract class ShoeInfo {
  protected String model;
  private String brand;
  private Sex sex;
  private String material;
  private String color;
  private Integer size;
  private Integer priceInUah;
  private Boolean haveHeels;
  private Boolean isAvailable;
  private Boolean correctiveInsole;

  public ShoeInfo(String model, String brand, Sex sex, String material, String color, Integer size,
      Integer priceInUah, Boolean haveHeels, Boolean isAvailable, Boolean correctiveInsole) {
    super();
    this.model = model;
    this.brand = brand;
    this.sex = sex;
    this.material = material;
    this.color = color;
    this.size = size;
    this.priceInUah = priceInUah;
    this.haveHeels = haveHeels;
    this.isAvailable = isAvailable;
    this.correctiveInsole = correctiveInsole;
  }

  @Override
  public String toString() {
    return "model=" + model + ", brand=" + brand + ", sex=" + sex + ", material=" + material
        + ", color=" + color + ", size=" + size + ", priceInUah=" + priceInUah + ", haveHeels="
        + haveHeels + ", isAvailable=" + isAvailable + ", correctiveInsole=" + correctiveInsole;
  }



}
