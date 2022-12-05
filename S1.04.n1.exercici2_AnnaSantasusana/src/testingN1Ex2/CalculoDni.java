package testingN1Ex2;

public class CalculoDni {

	public char calcularDni(int dni) {
		char dniLetter = 'A';
		
		char[] letter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
						'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int restNumber = dni % 23;
		dniLetter = letter[restNumber];
		return dniLetter;
	}
	
	
}
