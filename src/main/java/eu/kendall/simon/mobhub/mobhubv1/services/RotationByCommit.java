package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;
import org.springframework.stereotype.Component;

@Component
public class RotationByCommit implements EventManager {

    public void passEvent(WebhookEvent event) {
        return;
    }


}
