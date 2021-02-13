package creational.factoryMethod;

import creational.factoryMethod.developer.Developer;
import creational.factoryMethod.factory.DeveloperFactory;
import creational.factoryMethod.factory.impl.JavaDeveloperFactory;
import creational.factoryMethod.factory.impl.PythonDeveloperFactory;
import creational.factoryMethod.factory.impl.RubyDeveloperFactory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DeveloperFactory javaDeveloperFactory = createdFactory();
        Developer developer =  javaDeveloperFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createdFactory (){
        Scanner scanner = new Scanner(System. in);
        String nameLanguage = scanner.next();
        if (nameLanguage.equals("Java")){
            return new JavaDeveloperFactory();
        }else if (nameLanguage.equals("Python")){
            return new PythonDeveloperFactory();
        }else if (nameLanguage.equals("Ruby")){
            return new RubyDeveloperFactory();
        }else {
            throw new RuntimeException("Not found this Language!");
        }
    }
}
