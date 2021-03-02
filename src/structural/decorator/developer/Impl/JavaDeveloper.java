package structural.decorator.developer.Impl;

import structural.decorator.developer.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Java developer write code. \n";
    }
}
