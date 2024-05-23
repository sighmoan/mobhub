package eu.kendall.simon.mobhub.mobhubv1.models;

public class User {
    String displayName;
    String avatarUrl;
    String userId;

    public User(String displayName, String avatarUrl, String userId) {
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
        this.userId = userId;
    }
}
