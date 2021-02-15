package creational.abstractFactory.project;

import creational.abstractFactory.Manager;

public class ProjectPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Manages project!");
    }
}
