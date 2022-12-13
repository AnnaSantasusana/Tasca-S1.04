package anna.assertJ.Ex3;

import static org.assertj.core.api.Assertions.*;


import org.junit.Test;

public class AppTest {
	
	App array1 = new App(new int[] {2, 4, 6});
	App array2 = new App(new int[] {2, 4, 6});
	
    @Test
    public void compareTwoArrays() {
        
    	assertThat(array1.getNumbers()).isEqualTo(array2.getNumbers());
    }
    
    
}
