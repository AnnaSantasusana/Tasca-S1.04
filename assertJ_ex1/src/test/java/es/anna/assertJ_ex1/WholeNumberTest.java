package es.anna.assertJ_ex1;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class WholeNumberTest {
    
	@Test
    public void testingTwoEqualObjects() {
        assertThat(App.number1().getNumber()).isEqualTo(App.number2().getNumber());  		
	}
	

	@Test
    public void testingTwoDifferentObjects() {
		App.number1().setNumber(4);
		assertThat(App.number1().getNumber()).isEqualTo(App.number2().getNumber());		
	}
}
