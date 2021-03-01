package structural.flyweight.developer.Impl;

import structural.flyweight.developer.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Python code.");
    }
}
