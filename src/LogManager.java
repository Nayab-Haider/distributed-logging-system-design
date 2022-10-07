public class LogManager {

    public static AbstractLogger createAbstractLogger() {
        InfoLog infoLog = new InfoLog(1);
        ErrorLog errorLog = new ErrorLog(2);
        DebugLog debugLog = new DebugLog(3);

        infoLog.nextAbstractLogger = errorLog;
        errorLog.nextAbstractLogger = debugLog;
        return infoLog;
    }

    public static LoggerSubject buildLoggerSubject() {
        LoggerSubjectImpl loggerSubject = new LoggerSubjectImpl();
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        loggerSubject.addObserver(1, consoleLogger);
        loggerSubject.addObserver(2, consoleLogger);

        loggerSubject.addObserver(1, fileLogger);
        return loggerSubject;
    }
}
