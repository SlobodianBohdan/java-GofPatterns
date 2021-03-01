package structural.flyweight;

import structural.flyweight.developer.Developer;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.JAVA));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.JAVA));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.JAVA));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.PYTHON));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.PYTHON));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.PYTHON));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.RUBY));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.RUBY));
        developers.add(developerFactory.getDeveloperBySpecialty(ProgramingLanguages.RUBY));

        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}
