public abstract class AbstractLogger {
    int level;
    public AbstractLogger nextAbstractLogger;

    void display(int level, String message) {
        if (this.level <= level) {
            logMessage(message);
        }
        if (nextAbstractLogger != null) {
            nextAbstractLogger.display(level, message);
        }
    }

    protected abstract void logMessage(String message);
}
