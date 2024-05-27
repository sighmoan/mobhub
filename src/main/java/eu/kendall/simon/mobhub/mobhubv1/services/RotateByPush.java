package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.MobSession;
import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class RotateByPush implements EventManager {

    @Autowired
    MobSession currentSession;
    SessionManager sessionManager;

    public RotateByPush(MobSession currentSession, SessionManager sessionManager) {
        this.currentSession = currentSession;
        this.sessionManager = sessionManager;
    }

    @Override
    public void passEvent(WebhookEvent event) {
        rotate();
    }

    private void rotate() {
        sessionManager.rotate();
    }
}
