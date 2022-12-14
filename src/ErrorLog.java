public class ErrorLog extends AbstractLogger {
    ErrorLog(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message, LoggerSubject loggerSubject) {
        message = "ERROR:" + message;
        loggerSubject.notifyAllObserver(2, message);
    }
}
