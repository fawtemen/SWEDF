package Model;

import Observer.Observer;
import Channel.CommunicationChannel;
import Model.User;
import java.util.Date;

public class Notification implements Observer {
    private Date date;
    private String message;
    private User user;
    private CommunicationChannel channel;

    public Notification( User user,String message,CommunicationChannel channel) {
        this.user = user;
        this.message = message;
        this.channel = channel;
    }

    public void deliver() {
        String content = "Update: " + message;
        channel.send(user.getEmail(), content);
    }
    
    @Override
    public void update() {
        deliver(); // Called automatically by subject
    }

    

    
}
