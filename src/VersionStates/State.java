package VersionStates;

public interface State {
    void enter();
    void execute(Person person);
    void leave();
}
