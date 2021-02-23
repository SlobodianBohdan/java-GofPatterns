package structural.bridge.program.impl;

import structural.bridge.developer.Developer;
import structural.bridge.program.Program;

public class BankSystemProgram extends Program {

    public BankSystemProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system is created!");
        developer.writeCode();
    }
}
