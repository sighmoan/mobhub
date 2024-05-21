package eu.kendall.simon.mobhub.mobhubv1;

import eu.kendall.simon.mobhub.mobhubv1.controllers.WebhookController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class MobhubV1ApplicationTests {

	MockMvc mockmvc;

	@BeforeEach
	void setup() {
		this.mockmvc = MockMvcBuilders.standaloneSetup(new WebhookController())
				.alwaysExpect(status().isOk())
				.build();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void controllerResponds() throws Exception {
		this.mockmvc.perform(post("/push"));
	}

}
