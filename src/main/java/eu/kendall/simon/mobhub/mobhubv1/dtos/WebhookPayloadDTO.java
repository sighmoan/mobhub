package eu.kendall.simon.mobhub.mobhubv1.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.kendall.simon.mobhub.mobhubv1.models.User;
import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookPayloadDTO {
    public String zen;
    public String hookName;
    public String hookType;
    public String senderId;
    public String senderName;
    public String senderAvatarUrl;

    @SuppressWarnings("unchecked")
    @JsonProperty("hook")
    public void mapHook(Map<String, Object> hookData) {
        hookName = hookData.get("name").toString();
        hookType = hookData.get("type").toString();
    }

    @JsonProperty("sender")
    public void mapSender(Map<String, Object> userData) {
        senderId = userData.get("id").toString();
        senderName = userData.get("login").toString();
        senderAvatarUrl = userData.get("avatar_url").toString();
    }

    public WebhookEvent getEvent() {
        WebhookEvent event = null;
        User user = new User(senderName, senderAvatarUrl, senderId);
        return event;
    }
}
