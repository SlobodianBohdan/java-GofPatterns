package behavioural.chain.logger.Impl;

import behavioural.chain.logger.Logger;

public class InfoLogger extends Logger{
    public InfoLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Info: " + message);
    }
}
