package observerPattern;

import java.util.*;

public class Subscriber implements SubscriberObserver {
    private String name;
    private List<String> preferencesList = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String news) {
        System.out.println("\t" + name + " received breaking news: " + news);
    }

    @Override
    public void modifyPreference(List<String> updatePreference) {
        preferencesList = updatePreference;
        System.out.println("\t" + name + "'s preference updated to: " + preferencesList);
    }
}