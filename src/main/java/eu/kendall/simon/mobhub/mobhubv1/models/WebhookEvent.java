package eu.kendall.simon.mobhub.mobhubv1.models;

public class WebhookEvent {
    WebhookEventType type;
    User user;

    public WebhookEvent(WebhookEventType type, User user) {
        this.type = type;
        this.user = user;
    }

}
