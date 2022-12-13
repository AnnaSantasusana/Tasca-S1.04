package testingN1Ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	App app;
	
	@BeforeEach
	public void instance() {
		app = new App();
	}
	
	@Test
	public void listNumberPositions() {
		assertEquals(12, app.arrayList().size());
	}
	
	@Test
	public void listNotNull() {
		assertNotNull(app.arrayList());
	}

	@Test
	public void listPositionAugust() {
		assertEquals(app.arrayList().indexOf("August"), 7);
	}

		
	
}
