package eu.kendall.simon.mobhub.mobhubv1.controllers;

import eu.kendall.simon.mobhub.mobhubv1.dtos.WebhookPayloadDTO;
import eu.kendall.simon.mobhub.mobhubv1.services.EventManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    private EventManager eventManager;

    public WebhookController(@Autowired EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @PostMapping(value = "/push", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<String> handlePush(@RequestBody(required = false) WebhookPayloadDTO requestBody) {
        System.out.println("Request received. Zen is "+requestBody.zen);

        return ResponseEntity.ok().body("Thanks");
    }
}
