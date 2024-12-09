package org.example.Classes;

public class Animal extends  Something{
    private String woolOrFeathers;
    private String carnivoreOrHerbivore;

    public Animal(String woolOrFeathers, String carnivoreOrHerbivore) {
        this.woolOrFeathers = woolOrFeathers;
        this.carnivoreOrHerbivore = carnivoreOrHerbivore;
    }

    public void setWoolOrFeathers(String woolOrFeathers) {
        this.woolOrFeathers = woolOrFeathers;
    }

    public void setCarnivoreOrHerbivore(String carnivoreOrHerbivore) {
        this.carnivoreOrHerbivore = carnivoreOrHerbivore;
    }

    public String getWoolOrFeathers() {
        return woolOrFeathers;
    }

    public String getCarnivoreOrHerbivore() {
        return carnivoreOrHerbivore;
    }



}
