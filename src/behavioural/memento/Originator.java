package behavioural.memento;

public interface Originator {
    VersionProject save();
    void restore(VersionProject memento);
}
