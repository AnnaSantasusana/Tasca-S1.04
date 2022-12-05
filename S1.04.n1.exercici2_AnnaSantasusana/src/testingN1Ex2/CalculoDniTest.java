package testingN1Ex2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {

	@ParameterizedTest
	@CsvSource({
	    "39397831, G",
	    "39328595, K",
	    "53395180, J",
	    "84738392, A",
	    "78564344, F",
	    "39397832, M",
	    "23765459, N",
	    "44192873, D",
	    "39327148, T",
	    "43566370, T"
	})
	public void test(int dni, char expectedLetter) {
		CalculoDni calculoDni = new CalculoDni();
		
		assertEquals(expectedLetter, calculoDni.calcularDni(dni));
		
	}
}


