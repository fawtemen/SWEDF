public class main {
    public static void main(String[] args) {
        User user = new User(1, "Fateme", "fateme@gmail.com");
        user.register("https://example.com", 10);
        
        Subscription sub = user.getSubscriptions().get(0);
        CommunicationChannel channel = new EmailChannel();

        Notification notification = new Notification(user, "Site update detected!", channel);

        sub.attach(notification);
        sub.checkWebsite();
        }
    }

