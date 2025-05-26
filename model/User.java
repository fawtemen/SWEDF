import java.util.ArrayList;
import java.util.List;


public class User{
    private int userid;
    private String name;
    private String email;
    private List<Subscription> subscriptions = new ArrayList<>();

    public User(int userid, String name, String email){
        this.userid=userid;
        this.name=name;
        this.email=email;

    }
    public void manageSubscriptions() {
        // Manage logic
    }

    public void register(String url, int frequency) {
        Website website = new Website(url);
        Subscription subscription = new Subscription(this, website, frequency);
        subscriptions.add(subscription);
    }
    public void updateProfile() {
        // Update user profile logic
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public String getEmail() {
        return email;
    }
}
