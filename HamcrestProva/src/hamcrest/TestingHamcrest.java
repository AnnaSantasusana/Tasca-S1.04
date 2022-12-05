package hamcrest;

import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.TypeSafeDiagnosingMatcher;
import org.junit.jupiter.api.Test;

class TestingHamcrest {
	
	public static Matcher<String> length(Matcher<? super Integer> matcher){
		return new FeatureMatcher<String, Integer>(matcher,
				"a String of length that", "length"){
			@Override
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};
	}
	
	@Test
	public void lengthTest() {
		MatcherAssert.assertThat("The String doesn't match with the expected length", "Mordor", length(is(8)));

	}
}
