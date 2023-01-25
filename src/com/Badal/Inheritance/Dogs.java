package com.Badal.Inheritance;

public class Dogs extends Animal{
   private String barking;
   public Dogs(){
       super();
   }
    public Dogs(String barking) {
        this.barking = barking;
    }

    public Dogs(String walk, String eat, String cuddle, String barking) {
        super(walk, eat, cuddle);
        this.barking = barking;
        setWalk(walk);
        setEat(eat);
        setCuddle(cuddle);
    }

    public String getBarking() {
        return barking;
    }

    public void setBarking(String barking) {
        this.barking = barking;
    }

    @Override
    public String toString() {
        return "Dogs[barking=" + barking +", walk= " + getWalk() + ", Eat= " + getEat() +", Cuddle= " + getCuddle() +"]";
    }
}
