package org.example;

public class Student extends Person{
    private Person name;
    private String groupName;
    private int rating;



    public void setName(Person name) {
        this.name = name;
    }

    public Student(Person name, String groupName, int rating) {
        this.name = name;
        this.groupName = groupName;
        this.rating = rating;
    }

    public Student(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Person getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getRating() {
        return rating;
    }



}
