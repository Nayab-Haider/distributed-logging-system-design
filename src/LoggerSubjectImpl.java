import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerSubjectImpl implements LoggerSubject {
    Map<Integer, List<LoggerObserver>> map = new HashMap<>();


    @Override
    public void addObserver(Integer level, LoggerObserver loggerObserver) {
        List<LoggerObserver> loggerObservers = map.getOrDefault(level, new ArrayList<>());
        loggerObservers.add(loggerObserver);
        map.put(level, loggerObservers);
    }

    @Override
    public void notifyAllObserver(Integer level, String message) {
        map.getOrDefault(level, new ArrayList<>()).stream().forEach(loggerObserver -> loggerObserver.log(message));
    }
}
