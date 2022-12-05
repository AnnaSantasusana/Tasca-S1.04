package anna.assertJ.Ex5;

import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;

import org.junit.Test;

public class AppTest {
    
	HashMap<Integer, String> map = new HashMap<>();
	
	public void addElements() {
		map.put(1, "Anna");
		map.put(2, "Elisabet");
		map.put(3, "Teresa");
	}
	
    @Test
    public void shouldAnswerWithTrue() {
    	addElements();
    	assertThat(map).containsKey(2);
    }
}
