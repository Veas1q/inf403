package org.example.Classes;

public class Man extends People{
    private int countPullUps;
    private String favoriteFish;
    private String favoriteFootballTeam;
    private String favoriteCar;

    public Man(String place, String nameSomething, String name, String middleName, String lastName, int height, long number, int countPullUps, String favoriteFish, String favoriteFootballTeam, String favoriteCar) {
        super(place, nameSomething, name, middleName, lastName, height, number);
        this.countPullUps = countPullUps;
        this.favoriteFish = favoriteFish;
        this.favoriteFootballTeam = favoriteFootballTeam;
        this.favoriteCar = favoriteCar;
    }

    public void setCountPullUps(int countPullUps) {
        this.countPullUps = countPullUps;
    }

    public void setFavoriteFish(String favoriteFish) {
        this.favoriteFish = favoriteFish;
    }

    public void setFavoriteFootballTeam(String favoriteFootballTeam) {
        this.favoriteFootballTeam = favoriteFootballTeam;
    }

    public void setFavoriteCar(String favoriteCar) {
        this.favoriteCar = favoriteCar;
    }

    public int getCountPullUps() {
        return countPullUps;
    }

    public String getFavoriteFish() {
        return favoriteFish;
    }

    public String getFavoriteFootballTeam() {
        return favoriteFootballTeam;
    }

    public String getFavoriteCar() {
        return favoriteCar;
    }

    public static String WhereAm(String place, String nameSomething, String name, String middleName, String lastName, int height, int countPullUps,  String favoriteCar, String favoriteFish, String favoriteFootballTeam, double number ){
        return "Я " + nameSomething + " с " + place + "\n" +
                "меня зовут " + middleName + " " + name + " " + lastName + " мой рост " + height + " а номер телефона " + number + "\n" +
                "Мои любимая рыба  " + favoriteFish + ", моя любимая машина это " + favoriteCar + ", моя любимая футбольная команда это "  + favoriteFootballTeam + "\n." +
                "Мой номер телефона " + number;


    }

    public static String canFishing() {
        return "Иду на рыбалку";
    }

    public static String live() {
        return "Рыбачу";
    }

}
