package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.MobSession;
import eu.kendall.simon.mobhub.mobhubv1.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineSessionManagerTest {
    CommandLineSessionManager mgr;

    @BeforeEach
    void setup() {
        MobSession session = new MobSession();
        mgr = new CommandLineSessionManager(session);
    }

    @Test
    void managerShouldAddPeople() {
        //Arrange
        User simon = new User("Simon", "", "1");
        //Act
        mgr.getSession().addParticipant(simon);
        //Assert
        assertEquals(1, mgr.getSession().countParticipants());
    }


}