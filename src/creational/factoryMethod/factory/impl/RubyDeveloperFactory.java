package creational.factoryMethod.factory.impl;

import creational.factoryMethod.developer.Developer;
import creational.factoryMethod.developer.impl.RubyDeveloper;
import creational.factoryMethod.factory.DeveloperFactory;

public class RubyDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new RubyDeveloper();
    }
}
