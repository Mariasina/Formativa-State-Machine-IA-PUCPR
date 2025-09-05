import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Person {
    private int hunger;
    private int fatigue;
    private String name;
    private String currentState;

    public Person(String newName){
        this.name = newName;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public void sleep(){
        System.out.println("Bateu um sono...");
        currentState = "Sleeping";
        fatigue -= 10;
        hunger += 1;
    }
}
