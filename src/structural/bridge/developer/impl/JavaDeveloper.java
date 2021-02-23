package structural.bridge.developer.impl;

import structural.bridge.developer.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer write code.");
    }
}
