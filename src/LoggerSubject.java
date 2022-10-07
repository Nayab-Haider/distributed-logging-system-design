public interface LoggerSubject {
    void addObserver(Integer level, LoggerObserver loggerObserver);

    void notifyAllObserver(Integer level, String message);
}
