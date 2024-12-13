package org.example;

import java.util.Arrays;

public class Teacher extends Person{
    private String[] disciplines;




    public Teacher(String lastName, String firstName, String middleName, int age, String[] disciplines) {
        super(lastName, firstName, middleName, age);
        this.disciplines = disciplines;
    }

    public String[] getDisciplines() {
        return disciplines;
    }



    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "disciplines=" + Arrays.toString(disciplines) +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age;
    }
}
