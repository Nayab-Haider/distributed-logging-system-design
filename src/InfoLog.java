public class InfoLog extends AbstractLogger {

    InfoLog(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message, LoggerSubject loggerSubject) {
        message = "INFO:" + message;
        loggerSubject.notifyAllObserver(1, message);
    }
}
