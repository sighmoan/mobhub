package eu.kendall.simon.mobhub.mobhubv1.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;

import java.util.Map;

public class WebhookPayloadDTO {
    public String zen;
    public String hookName;
    public String hookType;

    public WebhookPayloadDTO(String zen, String hookName, String hookType) {
        this.zen = zen;
        this.hookName = hookName;
        this.hookType = hookType;
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("hook")
    public void mapHook(Map<String, Object> hookData) {
        hookName = hookData.get("name").toString();
        hookType = hookData.get("type").toString();
    }

    public WebhookEvent getEvent() {
        WebhookEvent event = null;
        return event;
    }
}
