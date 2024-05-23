package eu.kendall.simon.mobhub.mobhubv1.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class MobSession {
    String activeRepo;
    User[] allUsers;
    User currentDriver;
    User currentNavigator;

    void rotate() {
        currentDriver = currentNavigator;
        currentNavigator = allUsers[0];
    }
}
