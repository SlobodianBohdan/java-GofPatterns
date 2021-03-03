package behavioural.chain.logger.Impl;

import behavioural.chain.logger.Logger;

public class ErrorLogger  extends Logger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error: " + message);
    }
}
