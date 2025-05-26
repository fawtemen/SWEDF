public class SMSChannel implements CommunicationChannel {
    @Override
    public void send(String receiver, String message) {
        System.out.println("Sending SMS to " + receiver + ": " + message);
    }
}
