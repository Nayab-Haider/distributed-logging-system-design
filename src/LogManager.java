public class LogManager {

    public static AbstractLogger createAbstractLogger() {
        InfoLog infoLog = new InfoLog(1);
        ErrorLog errorLog = new ErrorLog(2);
        DebugLog debugLog = new DebugLog(3);

        infoLog.nextAbstractLogger = errorLog;
        errorLog.nextAbstractLogger = debugLog;
        return infoLog;
    }
}
