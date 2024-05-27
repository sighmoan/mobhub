package eu.kendall.simon.mobhub.mobhubv1.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
@Scope("session")
public class MobSession {
    String activeRepo;
    ArrayList<User> allUsers = new ArrayList<>();
    User currentDriver;
    User currentNavigator;

    public void rotate(User newNavigator) {
        currentDriver = currentNavigator;
        currentNavigator = newNavigator;
    }

    public void addParticipant(User newParticipant) {
        allUsers.add(newParticipant);
    }

    public int countParticipants() {
        return allUsers.size();
    }
}
