package structural.bridge.program.impl;

import structural.bridge.developer.Developer;
import structural.bridge.program.Program;

public class StudentSystemProgram extends Program {


    public StudentSystemProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Student system is created!");
        developer.writeCode();
    }
}
