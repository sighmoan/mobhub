package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.MobSession;

public interface SessionManager {

    void rotate();
    MobSession getSession();
}
