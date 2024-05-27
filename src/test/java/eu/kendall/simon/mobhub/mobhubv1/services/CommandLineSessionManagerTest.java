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

    @Test
    void managerCanRotate() {
        //Arrange
        mgr.getSession().addParticipant(new User("John", "", "1"));
        mgr.getSession().addParticipant(new User("Joanna", "", "2"));
        mgr.getSession().addParticipant(new User("Earl", "", "3"));
        mgr.getSession().addParticipant(new User("Eamae", "", "4"));


        //Act
        User oldDriver = mgr.getSession().getDriver();
        User oldNavigator = mgr.getSession().getNavigator();
        mgr.rotate();

        //Assert
        assertNotEquals(oldDriver, mgr.getSession().getDriver());
        assertNotEquals(oldNavigator, mgr.getSession().getNavigator());
    }


}