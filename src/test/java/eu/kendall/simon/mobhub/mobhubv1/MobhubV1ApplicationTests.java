package eu.kendall.simon.mobhub.mobhubv1;

import eu.kendall.simon.mobhub.mobhubv1.controllers.WebhookController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class MobhubV1ApplicationTests {

	MockMvc mockmvc;
	byte[] sampleGhResponse;
	@Autowired
	WebhookController webhookController;

	@BeforeEach
	void setup() {
		this.mockmvc = MockMvcBuilders.standaloneSetup(webhookController)
				.alwaysExpect(status().isOk())
				.build();

		try {
			sampleGhResponse = MobhubV1Application.class
					.getClassLoader()
					.getResourceAsStream("static/sample-gh-response.json")
					.readAllBytes();
		} catch(Exception e) {
			fail();
		}
	}

	@Test
	void contextLoads() {
	}

	@Test
	void controllerResponds() throws Exception {
		this.mockmvc.perform(post("/push")
				.header("Content-Type", "application/json")
				.content(sampleGhResponse)
		);
	}

}
