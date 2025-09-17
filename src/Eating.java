public class Eating implements State{

    @Override
    public void enter() {
        System.out.println("Bateu uma fome...");
    }

    @Override
    public void execute(Person person) {
        System.out.println("Comendo...");
        person.setHunger(person.getHunger() - 5);
    }

    @Override
    public void leave() {
        System.out.println("Ufa! Já estou cheio...");
    }
}
