package org.example;

import org.example.Classes.People;
import org.example.Classes.Animal;
import org.example.Classes.Something;
import org.example.Classes.Insects;
import org.example.Classes.Man;
import org.example.Classes.Woman;


public class Main {
    public static void main(String[] args) {
        Man p2 = new Man("Earth","Human", "Artem", "Kuzmin", "Ivanovich", 160, 890033481, 30, "Carp", "Spartak", "BMW");
        Woman P3 = new Woman("Earth", "Human", "Daria", "Morozova", "Vladimirovna", 165, 890033487, 60, "White", "Armani");
        Insects p4 = new Insects("Earth", "Spider", 200 , 6);

        System.out.println(Insects.WhereAm(p4.getPlace(),p4.getNameSomething(),p4.getCountEyes(),p4.getLifeExpectancy()));
        System.out.println(Insects.live());
        System.out.println(Insects.sleep());
        System.out.println();

        System.out.println(Woman.WhereAm(P3.getPlace(), P3.getNameSomething(), P3.getName(),P3.getMiddleName(), P3.getLastName(), P3.getHeight(), P3.getHairLength(), P3.getHairColor(), P3.getFavoriteCosmetic(), P3.getNumber()));
        System.out.println(Woman.live());
        System.out.println(Woman.Cook());
        System.out.println();


        System.out.println(Man.WhereAm(p2.getPlace(), p2.getNameSomething(), p2.getName(), p2.getMiddleName(), p2.getLastName(), p2.getHeight(), p2.getCountPullUps(), p2.getFavoriteCar(), p2.getFavoriteFish(), p2.getFavoriteFootballTeam(), p2.getNumber()));
        System.out.println(Man.canFishing());
        System.out.println(Man.live());
        System.out.println();
    }
}
