package creational.abstractFactory.project;

import creational.abstractFactory.Developer;
import creational.abstractFactory.Manager;
import creational.abstractFactory.TeamFactory;
import creational.abstractFactory.Tester;

public class ProjectTeamFactory implements TeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaScriptDeveloper();
    }

    @Override
    public Tester getTester() {
        return new JavaTester();
    }

    @Override
    public Manager getProjectManager() {
        return new ProjectPM();
    }
}
