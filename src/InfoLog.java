public class InfoLog extends AbstractLogger {

    InfoLog(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("INFO:" + message);
    }
}
