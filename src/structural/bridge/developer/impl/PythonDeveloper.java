package structural.bridge.developer.impl;

import structural.bridge.developer.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python Developer write code.");
    }
}
