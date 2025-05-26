package Model;

import Observer.Observer;
import Observer.Subject;
import Model.Website;
import Model.User;
import java.util.ArrayList;
import java.util.List;

public class Subscription implements Subject{
    private int frequency;
    private User user;
    private Website website;
    private List<Observer> observers = new ArrayList<>();

    public Subscription(User user, Website website, int frequency) {
        this.user = user;
        this.website = website;
        this.frequency = frequency;
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
    public void checkWebsite() {
        if (website.checkForUpdates()) {
            notifyObservers(); // notify Notification
        }
    }

    public void cancel() {
        // Cancel logic
    }

    public void modify(int newFrequency) {
        this.frequency = newFrequency;
    }

    

}
