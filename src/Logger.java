import java.io.Serializable;

public class Logger implements Cloneable, Serializable {
    private static volatile Logger INSTANCE;
    private static volatile AbstractLogger abstractLogger;
    private static volatile LoggerSubject loggerSubject;

    private Logger() {
        if (INSTANCE != null) throw new IllegalStateException("Object already created");
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            synchronized (Logger.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Logger();
                    abstractLogger = LogManager.createAbstractLogger();
                    loggerSubject = LogManager.buildLoggerSubject();
                }
            }
        }
        return INSTANCE;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public Object readResolve() {
        return INSTANCE;
    }

    private void logMessage(int level, String message) {
        abstractLogger.display(level, message, loggerSubject);
    }

    public void info(String message) {
        logMessage(1, message);
    }

    public void error(String message) {
        logMessage(2, message);
    }

    public void debug(String message) {
        logMessage(3, message);
    }

}
