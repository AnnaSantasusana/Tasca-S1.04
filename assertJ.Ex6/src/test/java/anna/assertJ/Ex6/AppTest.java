package anna.assertJ.Ex6;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AppTest {
   
	@Test
    public void exceptionTest() {
		//given
		String[] array = {"Car", "Van", "Motorcycle"};
		//when
		Throwable thrown = catchThrowable(() -> System.out.println(array[5]));
	   	//then
    	assertThat(thrown).isInstanceOf(ArrayIndexOutOfBoundsException.class);
       
    }
}
