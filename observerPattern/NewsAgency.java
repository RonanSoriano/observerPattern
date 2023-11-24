package observerPattern;

import java.util.*;

public class NewsAgency implements NewsAgencySubject {
    private List<Subscriber> subscribers = new ArrayList<>();

    // to check if the user is already subscribe.
    @Override
    public void subscribe(Subscriber subscriber) {
        if (!subscriberChecker(subscriber.getName())) {
            subscribers.add(subscriber);
        } else {
            System.out.println(subscriber.getName() + " is already subscribed.");
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String latestNews) {
        System.out.println("---| Breaking News! in " + latestNews + " |---");
        notifySubscribers(latestNews);
    }

    // checker of subscriber's name.
    private boolean subscriberChecker(String name) { // checker of subscriber's name.
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}