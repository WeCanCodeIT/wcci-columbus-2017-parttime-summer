package sorting;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Fill in the blanks!
 */
public class _01_ComparableTests extends TestSupport {

	/**
	 * See {@link Class#isAssignableFrom(Class)}.
	 */
	@Test
	public void stringsAreComparable() {

		boolean isComparable = ____.isAssignableFrom(____);

		assertTrue(isComparable);
	}

	/**
	 * A see the Javadoc for {@link Comparable#compareTo} for how you should expect
	 * compareTo to respond.
	 */
	@Test
	public void abcShouldEqualItself() {

		String abc = "abc";

		int result = abc.compareTo(abc);

		assertEquals(_, result);
	}

	@Test
	public void abcShouldComeBeforeDef() {
		String abc = "abc";
		String def = "def";

		int result = abc.compareTo(def);

		assertTrue(___); // compare result to a number
	}

	@Test
	public void defShouldComeAfterAbc() {
		String abc = "abc";
		String def = "def";

		int result = def.compareTo(abc);

		assertTrue(___); // compare result to a number
	}

	/**
	 * See {@link java.util.Collections#sort(java.util.List)}. Remember that this
	 * will modify the list you pass into it.
	 */
	@Test
	public void shouldBeAbleToSortAListOfStrings() {

		List<String> ourList = new ArrayList<>(asList("def", "zyx", "abc"));
		
		Collections.sort(ourList);
		
		assertEquals(asList(___, __, __), ourList);
	}
}
