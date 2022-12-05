package testing.n1Ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class ExceptionJUnitTest {
	
	@Test
	public void exceptionTesting() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, new Executable(){

			@Override
			public void execute() throws Throwable {
				ExceptionJUnit.arrayException(2);
		
			}
		});
	}
	
}
