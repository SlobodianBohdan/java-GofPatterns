package creational.factoryMethod.factory.impl;

import creational.factoryMethod.developer.Developer;
import creational.factoryMethod.developer.impl.JavaDeveloper;
import creational.factoryMethod.factory.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
