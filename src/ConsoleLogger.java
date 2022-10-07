public class ConsoleLogger implements LoggerObserver {
    @Override
    public void log(String message) {
        System.out.println("CONSOLE:" + message);
    }
}
