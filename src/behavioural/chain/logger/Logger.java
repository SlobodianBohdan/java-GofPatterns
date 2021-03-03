package behavioural.chain.logger;

public abstract class Logger {
    protected int level;
    protected Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
