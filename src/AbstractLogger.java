public abstract class AbstractLogger {
    int level;
    public AbstractLogger nextAbstractLogger;

    void display(int level, String message, LoggerSubject loggerSubject) {
        if (this.level <= level) {
            logMessage(message, loggerSubject);
        }
        if (nextAbstractLogger != null) {
            nextAbstractLogger.display(level, message, loggerSubject);
        }
    }

    protected abstract void logMessage(String message, LoggerSubject loggerSubject);
}
