package org.example.Classes;

public class Something {
    protected String place;
    protected String nameSomething;
    public Something() {
    }

    public Something(String place, String nameSomething) {
        this.place = place;
        this.nameSomething = nameSomething;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNameSomething() {
        return nameSomething;
    }

    public void setNameSomething(String nameSomething) {
        this.nameSomething = nameSomething;
    }

    public static String live() {
        return "АМ-АМ-АМ-АМ(КУШАЮ)";
    }


}
