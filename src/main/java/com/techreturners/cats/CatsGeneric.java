package com.techreturners.cats;

public abstract class CatsGeneric  implements Cat  {
    private boolean aSleep = false;
    public String sound;
    
    
    public boolean isAsleep() {
        return aSleep;
    }
    public void goToSleep(){
        this.aSleep = true;
    }
   
    public void wakeUp() {
        this.aSleep = false;
    }
    public String eat() {
         return sound;
     }


}
