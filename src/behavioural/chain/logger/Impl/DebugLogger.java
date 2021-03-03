package behavioural.chain.logger.Impl;

import behavioural.chain.logger.Logger;

public class DebugLogger extends Logger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug: " + message);
    }
}
