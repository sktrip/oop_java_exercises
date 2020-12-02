package com.techreturners.cats;

public class CheetahCat extends CatsGeneric {

    private String soundCheetah = "Zzzzzzz";
    private String aSetting = "wild";
    private int height;
    
    
    public String eat() {

        return soundCheetah;
 
     }

     public int getAverageHeight() {
        return height;
   }
     public String getSetting() {

        return aSetting;
    }

}
