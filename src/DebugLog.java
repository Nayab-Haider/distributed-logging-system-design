public class DebugLog extends AbstractLogger {

    DebugLog(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message, LoggerSubject loggerSubject) {
        message = "DEBUG:" + message;
        loggerSubject.notifyAllObserver(3, message);
    }
}
