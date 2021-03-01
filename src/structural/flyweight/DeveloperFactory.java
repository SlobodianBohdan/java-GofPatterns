package structural.flyweight;


import structural.flyweight.developer.Developer;
import structural.flyweight.developer.Impl.JavaDeveloper;
import structural.flyweight.developer.Impl.PythonDeveloper;
import structural.flyweight.developer.Impl.RubyDeveloper;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<ProgramingLanguages, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(ProgramingLanguages programingLanguages) {
        Developer developer = developers.get(programingLanguages);

        if (developer == null) {
            switch (programingLanguages) {
                case JAVA:
                    System.out.println("Selected Java developer.");
                    developer = new JavaDeveloper();
                    break;
                case PYTHON:
                    System.out.println("Selected Python developer.");
                    developer = new PythonDeveloper();
                    break;
                case RUBY:
                    System.out.println("Selected Ruby developer.");
                    developer = new RubyDeveloper();
                    break;
            }
            developers.put(programingLanguages, developer);
        }
        return developer;
    }
}
