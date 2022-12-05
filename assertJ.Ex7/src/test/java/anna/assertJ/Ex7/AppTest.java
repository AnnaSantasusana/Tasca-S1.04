package anna.assertJ.Ex7;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.Test;

public class AppTest {
  
    @Test
    public void emptyOptionalObject() {
        Optional<String> emptyOpt = Optional.empty();
        
        assertThat(emptyOpt).isEmpty();
    }
}
