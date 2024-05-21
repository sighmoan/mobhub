package eu.kendall.simon.mobhub.mobhubv1.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class WebhookPayloadDTO {
    public String zen;
    public String hookName;
    public String hookType;

    @SuppressWarnings("unchecked")
    @JsonProperty("hook")
    public void mapHook(Map<String, Object> hookData) {
        hookName = hookData.get("name").toString();
        hookType = hookData.get("type").toString();
    }
}
