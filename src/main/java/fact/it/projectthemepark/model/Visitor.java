package fact.it.projectthemepark.model;

import java.util.ArrayList;

//Waluyono Tri r1012723
public class Visitor extends Person {
    private int yearOfBirth;
    private String themeParkCode;
    private ArrayList<String> wishList = new ArrayList<>();

    public Visitor(String firstName, String surName) {

        super(firstName, surName);
        this.themeParkCode = "undefined";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getThemeParkCode() {
        return themeParkCode;
    }

    public ArrayList<String> getWishList() {
        return wishList;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setThemeParkCode(String themeParkCode) {
        this.themeParkCode = themeParkCode;
    }


    public boolean addToWishList(String attractionName) {
        if (wishList.size() < 5 && !wishList.contains(attractionName) ) {
            wishList.add(attractionName);
            return true;
        } return false;
    }

    public int getNumberOfWishes() {
        return wishList.size();
    }


    @Override
    public String toString() {
        return "Visitor " + super.toString() + " with theme park code " + themeParkCode;
    }


}
