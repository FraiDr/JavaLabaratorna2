package com.company;

import model.Sex;
import model.ShoeInfo;
import model.types.Bumps;
import model.types.Purpose;
import model.types.Sneakers;
import model.types.WinterShoes;

public class Main {

  public static void main(String[] args) {
    ShoeInfo shoes1 = new WinterShoes("nzx1", "CAT", Sex.male, "leather", "brown", 42, 3500, false,
        true, true, true, true);
    Sneakers trainers = new Sneakers("AirForce", "Nike", Sex.unisex, "leather", "white", 44, 3400,
        false, true, false, Purpose.forSoccer, false);
    Bumps bumps1 = new Bumps("Shaleniese", "Lacoste", Sex.female, "leather", "black", 40, 6000,
        true, false, false, true, "triangle", "bottier");
    System.out.println(shoes1.toString());
    System.out.println(trainers.toString());
    System.out.println(bumps1.toString());
  }

}
