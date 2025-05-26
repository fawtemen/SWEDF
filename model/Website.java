package Model;

public class Website {
    private String url;

    public Website(String url) {
        this.url = url;
    }

    public boolean checkForUpdates() {
        // Simulate update check
        return Math.random() > 0.5;
    }

    public String getUrl() {
        return url;
    }
}
