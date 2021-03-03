package behavioural.chain;

import behavioural.chain.logger.Impl.DebugLogger;
import behavioural.chain.logger.Impl.ErrorLogger;
import behavioural.chain.logger.Impl.InfoLogger;
import behavioural.chain.logger.Logger;

public class ChainRunner {
    private static Logger getLoggers() {
        Logger errorLogger = new ErrorLogger(Priority.ERROR);
        Logger fileLogger = new DebugLogger(Priority.DEBUG);
        Logger consoleLogger = new InfoLogger(Priority.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args) {
        Logger logger = getLoggers();
        logger.logMessage(Priority.INFO, "This is a diagnostic information.");
        System.out.println();
        logger.logMessage(Priority.DEBUG, "This is an debug information.");
        System.out.println();
        logger.logMessage(Priority.ERROR, "This is an error information.");
    }
}
