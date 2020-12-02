package com.techreturners.cats;

public class LionCat extends CatsGeneric {

    private int height = 1100;
    private String aSetting = "wild";
    private String soundLion = "Roar!!!!";


    public int getAverageHeight() {
        return height;
    }

    public String eat() {

       return soundLion;

    }

    public String getSetting() {

        return aSetting;
    }

}
