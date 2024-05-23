package eu.kendall.simon.mobhub.mobhubv1.dtos;

import eu.kendall.simon.mobhub.mobhubv1.models.WebhookEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebhookPayloadDTOTest {

    @Test
    void shouldReturnWebhookEventOnRequest() {
        // Arrange
        WebhookPayloadDTO dto = new WebhookPayloadDTO("zen", "hookName", "hookType");
        // Act
        WebhookEvent event = dto.getEvent();
        // Assert
        assertTrue(event instanceof WebhookEvent);
        assertNotNull(event);
    }

}