package eu.kendall.simon.mobhub.mobhubv1.controllers;

import eu.kendall.simon.mobhub.mobhubv1.dtos.WebhookPayloadDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @PostMapping(value = "/push", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<String> handlePush(@RequestBody(required = false) WebhookPayloadDTO requestBody) {
        System.out.println("Request received. Zen is "+requestBody.zen);

        return ResponseEntity.ok().body("Thanks");
    }
}
