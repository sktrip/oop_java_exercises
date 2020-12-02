package com.techreturners.cats;

class DomesticCat extends CatsGeneric {

    
    private String aSetting ="domestic";
    private int height = 23;
    private String sound = "Purrrrrrr";
    
   
   
    public String getSetting() {

         return aSetting;
     }

    public int getAverageHeight() {
         return height;
    }

    public String eat() {

        return sound;

    }

}