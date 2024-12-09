package org.example.Classes;

public class Insects extends Something{
    private int lifeExpectancyDays;
    private int countEyes;

    public Insects() {}

    public Insects (int lifeExpectancy, int countEyes){
        this.lifeExpectancyDays = lifeExpectancy;
        this.countEyes = countEyes;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancyDays = lifeExpectancy;
    }

    public void setCountEyes(int countEyes) {
        this.countEyes = countEyes;
    }

    public int getLifeExpectancy() {
        return lifeExpectancyDays;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public Insects(String place, String name, int lifeExpectancyDays, int countEyes) {
        super(place, name);
        this.lifeExpectancyDays = lifeExpectancyDays;
        this.countEyes = countEyes;
    }

    public static  String WhereAm(String place, String nameSomething, int countEyes, int lifeExpectancyDays){
        return "Я " + nameSomething + " с " + place + "\n" +
                "у меня " + countEyes + " глаз и я живу " + lifeExpectancyDays + " дней";

    }

    public static String live() {
        return "Ищу еду";
    }

    public static String sleep() {
        return "cплю";

    }

}
