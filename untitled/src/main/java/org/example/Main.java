package org.example;

public class Main {
    public static void main(String[] args) {
        Teacher person = new Teacher("Alekseevich","Isaev","Aleksander",18, new String[]{"math","rus"}); //"Alekseevich","Isaev","Aleksander",18
        System.out.println(person);
        Student person1 = new Student("Pasha","Nikolaev","Popovich", 12);
        System.out.println(person1);
    }
}
