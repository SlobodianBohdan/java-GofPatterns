package creational.abstractFactory.project;

import creational.abstractFactory.Developer;

public class JavaScriptDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write JavaScript code!");
    }
}
