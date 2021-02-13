package creational.factoryMethod.developer.impl;

import creational.factoryMethod.developer.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write code on Python!");
    }
}
