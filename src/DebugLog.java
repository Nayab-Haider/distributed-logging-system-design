public class DebugLog extends AbstractLogger {

    DebugLog(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("DEBUG:" + message);
    }
}
