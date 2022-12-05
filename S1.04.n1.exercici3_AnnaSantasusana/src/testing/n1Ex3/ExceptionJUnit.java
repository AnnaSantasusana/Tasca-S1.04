package testing.n1Ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionJUnit {

	public static String arrayException(int index) throws IndexOutOfBoundsException {
		String name = "";
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Pep"));

		if (index < names.size()) {
			name = names.get(index);
		} else {
			throw new IndexOutOfBoundsException("Array index out of bounds");
		}
		
		return name;
	}
}
