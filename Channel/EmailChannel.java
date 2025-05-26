public class EmailChannel implements CommunicationChannel {
    @Override
    public void send(String receiver, String message) {
        System.out.println("Sending Email to " + receiver + ": " + message);
    }
}
