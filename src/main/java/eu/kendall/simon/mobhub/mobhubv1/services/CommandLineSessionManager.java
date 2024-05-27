package eu.kendall.simon.mobhub.mobhubv1.services;

import eu.kendall.simon.mobhub.mobhubv1.models.MobSession;
import org.springframework.stereotype.Service;

@Service
public class CommandLineSessionManager implements SessionManager {
    private MobSession session;

    private void setupSession() {

    }

    void printOptions() {

    }

    void captureSelection() {

    }

    void processInput() {

    }

    public void loop() {
        while(true) {
            if(session == null) {
                setupSession();
            }
            printOptions();
            var input = captureSelection();
            processInput(input);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the command line mob manager.");
        System.out.println("Are you ready to set up your mob session?");

    }
}
