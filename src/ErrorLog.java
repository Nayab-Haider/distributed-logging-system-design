public class ErrorLog extends AbstractLogger {
    ErrorLog(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("ERROR:" + message);
    }
}
