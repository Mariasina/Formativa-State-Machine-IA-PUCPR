public class Sleeping implements State{
    @Override
    public void enter() {
        System.out.println("Bateu um sono...");
    }

    @Override
    public void execute(Person person) {
        System.out.println("Dormindo...");
        person.setFatigue(person.getFatigue() - 10);
        person.setHunger(person.getHunger() + 1);
    }

    @Override
    public void leave() {

    }
}
