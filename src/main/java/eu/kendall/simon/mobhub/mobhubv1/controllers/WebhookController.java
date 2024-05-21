package eu.kendall.simon.mobhub.mobhubv1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @PostMapping("/push")
    @ResponseBody
    public ResponseEntity<String> handlePush(@RequestBody(required = false) Object requestBody) {
        System.out.println("Request received.");

        return ResponseEntity.ok().body("Thanks");
    }
}
