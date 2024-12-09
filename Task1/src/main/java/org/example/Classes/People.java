package org.example.Classes;

public class People extends Something{
   protected String name;
   protected String middleName;
   protected String lastName;
  protected  int height;
   protected double number;

   public People() {}

   public People(String place, String nameSomething, String name, String middleName, String lastName, int height, double number) {
      super(place, nameSomething);
      this.name = name;
      this.middleName = middleName;
      this.lastName = lastName;
      this.height = height;
      this.number = number;
   }


   public void setName(String name) {
      this.name = name;
   }

   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public void setNumber(double number) {
      this.number = number;
   }


   public String getName() {
      return name;
   }

   public String getMiddleName() {
      return middleName;
   }

   public String getLastName() {
      return lastName;
   }

   public int getHeight() {
      return height;
   }

   public double getNumber() {
      return number;
   }


}
