package structural.bridge;

import structural.bridge.developer.impl.JavaDeveloper;
import structural.bridge.developer.impl.PythonDeveloper;
import structural.bridge.developer.impl.RubyDeveloper;
import structural.bridge.program.Program;
import structural.bridge.program.impl.BankSystemProgram;
import structural.bridge.program.impl.StudentSystemProgram;
import structural.bridge.program.impl.WebsiteProgram;

public class Runner {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystemProgram(new JavaDeveloper()),
                new StudentSystemProgram(new PythonDeveloper()),
                new WebsiteProgram(new RubyDeveloper()),
        };

        for(Program program: programs){
            program.developProgram();
            System.out.println("---------------------------");
        }
    }
}
