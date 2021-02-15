package creational.abstractFactory.project;

import creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Java code!");
    }
}
