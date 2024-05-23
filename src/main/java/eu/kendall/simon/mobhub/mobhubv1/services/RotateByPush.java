package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.MobSession;
import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class RotateByPush implements EventManager {

    @Autowired
    MobSession currentSession;

    @Override
    public void passEvent(WebhookEvent event) {
        rotate();
    }

    private void rotate() {

    }
}
