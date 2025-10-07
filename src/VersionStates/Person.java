package VersionStates;

public class Person {
    private int hunger;
    private int fatigue;
    private String name;
    private String currentState;
    private State working;
    private State eating;
    private State sleeping;

    public Person(String newName){
        this.name = newName;
        this.working = new Working();
        this.eating = new Eating();
        this.sleeping = new Sleeping();
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

    public void doAction(){
        System.out.printf("\n%s\nFome: %d | Cansaço: %d\n", name, hunger, fatigue);
        if(fatigue > 50) {
            if(fatigue > 0) {
                if (currentState != "VersionStates.Sleeping") {
                    sleeping.enter();
                    currentState = "VersionStates.Sleeping";
                }
                else
                    sleeping.execute(this);
            }
            else{
                fatigue = 0;
                sleeping.leave();
            }

        }
        else if(hunger > 10) {
            if(hunger > 0) {
                if (currentState != "VersionStates.Eating") {
                    eating.enter();
                    currentState = "VersionStates.Eating";
                }
                else
                    eating.execute(this);
            }
            else{
                hunger = 0;
                eating.leave();
            }
        }
        else{
            if(currentState != "VersionStates.Working") {
                working.enter();
                currentState = "VersionStates.Working";
            }
            working.execute(this);
        }
    }
}
