package sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class _02_IdentityTests extends TestSupport {
	@Test
	public void twoObjectsThatAreEqualShouldHaveTheSameHashcode() {
		Integer first = new Integer(42);
		Integer second = new Integer(42);
		
		assertTrue(first != second); // not the same object
		
		assertEquals(______, ______);
	}
	
	@Test
	public void listsShouldAllowDuplicateElements() {
		List<Integer> ourList = new ArrayList<>();
		ourList.add(42);
		ourList.add(86);
		ourList.add(42);
		
		assertEquals(__, ourList.size());
	}
	
	@Test
	public void setsShouldEliminateDuplicateElements() {
		Set<Integer> ourSet = new HashSet<>();
		ourSet.add(42);
		ourSet.add(86);
		ourSet.add(42);
		
		assertEquals(__, ourSet.size());
	}
	
	@Test
	public void treeSetsShouldSortTheirElements() {
		SortedSet<String> ourSet = new TreeSet<>();
		ourSet.add("abc");
		ourSet.add("xyz");
		ourSet.add("def");
		
		Iterator<String> elementsItr = ourSet.iterator();
		assertEquals(____, elementsItr.next());
		assertEquals(____, elementsItr.next());
		assertEquals(____, elementsItr.next());
		assertEquals(___, elementsItr.hasNext());
	}
}
