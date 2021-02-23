package structural.bridge.program.impl;

import structural.bridge.developer.Developer;
import structural.bridge.program.Program;

public class WebsiteProgram extends Program {
    public WebsiteProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Website is created!");
        developer.writeCode();
    }
}
