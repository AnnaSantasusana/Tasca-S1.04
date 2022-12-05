package anna.assertJ.Ex4;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import org.junit.Test;

public class AppTest {
	
	ArrayList<Object> list = new ArrayList<Object>();

	Object obj1 = new Person("Júlia");
	Object obj2 = new Person("Maria");
	Object obj3 = new Furniture("chair");
	Object obj4 = new Furniture("table");
	Object obj5 = new Furniture("closet");
	
	public void arrayListAdd() {
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
	}
	
	@Test
	public void arrayListOrder() {
		arrayListAdd();
		assertThat(list).containsExactly(obj1, obj2, obj3, obj4);	
	}
	
	@Test
	public void arrayListAnyOrder() {
		arrayListAdd();
		assertThat(list).containsExactlyInAnyOrder(obj4, obj2, obj1, obj3);
	}
	
	@Test
	public void objectAddOnce() {
		arrayListAdd();
		assertThat(list).containsOnlyOnce(obj2);
	}
	
	@Test
	public void arrayListMissElement() {
		arrayListAdd();
		assertThat(list).doesNotContain(obj5);
	}

	
	
	
	
}
