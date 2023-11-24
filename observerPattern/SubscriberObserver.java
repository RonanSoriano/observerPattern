package observerPattern;

import java.util.*;

public interface SubscriberObserver {
    void update(String news);
    void modifyPreference(List<String> preferences);
}
