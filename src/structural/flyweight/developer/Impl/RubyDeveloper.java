package structural.flyweight.developer.Impl;

import structural.flyweight.developer.Developer;

public class RubyDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Ruby code.");
    }
}
