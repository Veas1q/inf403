package org.example;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected int age;

    public Person() {}

    public Person(String lastName, String firstName, String middleName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  lastName + " " + firstName + " " + middleName + " " + " " + age;

    }
}

