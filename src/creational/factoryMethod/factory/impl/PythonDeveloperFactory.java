package creational.factoryMethod.factory.impl;

import creational.factoryMethod.developer.Developer;
import creational.factoryMethod.developer.impl.PythonDeveloper;
import creational.factoryMethod.factory.DeveloperFactory;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
