package com.driver;

public class Main {
  public static void main ( String [] args){
      RWOnly obj = new RWOnly();
     // obj.name = "Acacio";
      // member variable is private
      obj.setName("firstObj");
      System.out.println(obj.getName());

  }
}