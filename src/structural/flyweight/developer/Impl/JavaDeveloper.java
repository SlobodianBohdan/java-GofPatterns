package structural.flyweight.developer.Impl;

import structural.flyweight.developer.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Write Java code.");
    }
}
