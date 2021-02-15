package creational.abstractFactory;

public interface TeamFactory {
    Developer getFirstDeveloper();

    Developer getSecondDeveloper();

    Tester getTester();

    Manager getProjectManager();
}
