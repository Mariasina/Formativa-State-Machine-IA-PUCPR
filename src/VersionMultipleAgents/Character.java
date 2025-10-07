package VersionMultipleAgents;

public class Character {
    private int hunger = 0;
    private int fatigue = 0;
    private String name;

    public Character(String name){
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void addHunger(int hunger) {
        this.hunger += hunger;
        this.hunger = Math.max(this.hunger, 0);
    }

    public int getFatigue() {
        return fatigue;
    }

    public void addFatigue(int fatigue) {
        this.fatigue += fatigue;
        this.fatigue = Math.max(this.fatigue, 0);
    }

}
