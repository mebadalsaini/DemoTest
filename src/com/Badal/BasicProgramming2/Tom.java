package com.Badal.BasicProgramming2;

public class Tom {
    private Boolean isDrinking;
    private Boolean isHittingJerry;
    private Boolean isOnAdventure;

    public Tom(){
        isDrinking = true;
        isHittingJerry = true;
        isOnAdventure = false;
    }
    public Tom(Boolean isDrinking, Boolean isHittingJerry, Boolean isOnAdventure){
        this.isDrinking = isDrinking;
        this.isHittingJerry = isHittingJerry;
        this.isOnAdventure = isOnAdventure;
    }
    public Boolean getDrinking(){
        return isDrinking;
    }
    public void setDrinking(Boolean drinking){
        this.isDrinking = drinking;
    }

    public Boolean getHittingJerry(){
        return isHittingJerry;
    }
    public void setHittingJerry(Boolean hitting){
        this.isHittingJerry = hitting;
    }
    public Boolean geOnAdventure(){
        return isOnAdventure;
    }
    public void setOnAdventure(Boolean adventure){
        this.isOnAdventure = adventure;
    }
    public String toString(){
        return "Tom [isDrinking = "  + isDrinking + ", isHittingJerry = " + isHittingJerry + ", isOnAdventure = " + isOnAdventure + "]";
    }
}
