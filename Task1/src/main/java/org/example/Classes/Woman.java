package org.example.Classes;

public class Woman extends People {
    private int hairLength;
    private String hairColor;
    private String favoriteCosmetic;

    public Woman(String place, String nameSomething, String name, String middleName, String lastName, int height, long number, int hairLength, String hairColor, String favoriteCosmetic) {
        super(place, nameSomething, name, middleName, lastName, height, number);
        this.hairLength = hairLength;
        this.hairColor = hairColor;
        this.favoriteCosmetic = favoriteCosmetic;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setFavoriteCosmetic(String favoriteCosmetic) {
        this.favoriteCosmetic = favoriteCosmetic;
    }

    public int getHairLength() {
        return hairLength;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getFavoriteCosmetic() {
        return favoriteCosmetic;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "hairLength=" + hairLength +
                ", hairColor='" + hairColor + '\'' +
                ", favoriteCosmetic='" + favoriteCosmetic + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", number=" + number +
                ", place='" + place + '\'' +
                ", nameSomething='" + nameSomething + '\'' +
                '}';
    }
    public static  String WhereAm(String place, String nameSomething, String name, String middleName, String lastName, int height, int hairLength, String hairColor, String favoriteCosmetic, double number ){
        return "Я " + nameSomething + " с " + place + "\n" +
                "меня зовут " + middleName + " " + name + " " + lastName + " мой рост " + height + " а номер телефона " + number + "\n" +
                "Мои волосы " + hairColor + " цвета, а их длина " + hairLength + "\n." +
                "Мой любимы бред косметки " + favoriteCosmetic;


    }

    public static String live() {
        return "Разговариваю";
    }

    public static String Cook(){
        return "Иду готовить";
    }

}
