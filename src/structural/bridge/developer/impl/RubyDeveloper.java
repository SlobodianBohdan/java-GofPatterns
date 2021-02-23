package structural.bridge.developer.impl;

import structural.bridge.developer.Developer;

public class RubyDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Ruby Developer write code.");
    }
}
