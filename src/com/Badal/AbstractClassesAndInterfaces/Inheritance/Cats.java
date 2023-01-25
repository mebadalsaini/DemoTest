package com.Badal.AbstractClassesAndInterfaces.Inheritance;

public class Cats extends Animal {
    private String meow;
    public Cats(){
        super();
    }
    public Cats(String meow){
        this.meow = meow;
    }
    public Cats(String walk, String eat, String cuddle, String meow){
        super(walk, eat, cuddle);
        this.meow = meow;
        setWalk(walk);
        setEat(eat);
        setCuddle(cuddle);
    }
    public String getMeow(){
        return meow;
    }
    public void setMeow(String meow){
        this.meow = meow;
    }

    @Override
    public String toString() {
        return "Cats[barking=" + meow +", walk= " + getWalk() + ", Eat= " + getEat() +", Cuddle= " + getCuddle() +", Message= " + animalDescription()+ "]";

    }
    public String animalDescription(){
        return "Find boxes to fit in";
    }
}
