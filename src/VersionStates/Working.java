package VersionStates;

public class Working implements State{
    @Override
    public void enter() {
        System.out.println("Hora de ir para o trabalho!");
    }

    @Override
    public void execute(Person person) {
        System.out.println("Trabalhando...");
        person.setHunger(person.getHunger() + 2);
        person.setFatigue(person.getFatigue() + 5);
    }

    @Override
    public void leave() {

    }
}
