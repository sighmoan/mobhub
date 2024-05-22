package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;

public interface RotationManager {
    public void passEvent(WebhookEvent event);
}
