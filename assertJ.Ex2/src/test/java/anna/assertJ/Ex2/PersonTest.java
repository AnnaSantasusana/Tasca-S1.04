package anna.assertJ.Ex2;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class PersonTest {
   
	Person name1 = new Person("Anna");
	Person name2 = new Person("Anna");
	
    @Test
    public void notSameReference() {
		assertThat(name1).isEqualTo(name2);
    }
   
    @Test
    public void sameReference(){
    	name1 = name2;
        assertThat(name1).isEqualTo(name2);
    }
    
}
