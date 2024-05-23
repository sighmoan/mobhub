package eu.kendall.simon.mobhub.mobhubv1.dtos;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class WebhookPayloadDTOTest {

    @Test
    void shouldReturnWebhookEventOnRequest() {
        // Arrange
        ObjectMapper objMapper = new ObjectMapper();
        WebhookPayloadDTO dto = null;
        byte[] ghResponseJson = null;
        try {
            InputStream str = getClass().getClassLoader()
                    .getResourceAsStream("static/sample-gh-response.json");
            if(str == null) fail("Unable to open stream to gh response");
            ghResponseJson = str.readAllBytes();
        } catch(Exception e) {
            fail("Unable to load sample gh response into byte array.");
        }
        try {
            dto = objMapper.readValue(ghResponseJson, WebhookPayloadDTO.class);
        } catch(Exception e) {
            fail("Unable to turn sample gh response into dto" + e.getMessage());
        }
        // Act
        WebhookEvent event = dto.getEvent();
        // Assert
        assertTrue(event instanceof WebhookEvent);
        assertNotNull(event);
    }

}