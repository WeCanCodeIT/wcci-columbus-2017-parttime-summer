package sorting;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * For these tests, we are going to create our own Employee class and implement
 * the necessary methods to for comparison and identity.
 */
public class _03_EmployeeTests extends TestSupport {

	@Test
	public void employeeIdentityShouldBeBasedOnIdNotName() {
		String employeeId = "42";
		String firstName = "Arthur";
		String secondName = "Dent";
		Employee arthur = new Employee(employeeId, firstName, secondName);
		Employee another = new Employee("42", "A", "Dent");
		
		assertEquals(another, arthur);
	}
	@Test
	public void employeesShouldBeComparable() {
		assertTrue(Comparable.class.isAssignableFrom(Employee.class));
	}
	
	@Test
	public void shouldBeAbleToSortEmployeesByIdByDefault() {
		Employee arthur = new Employee("42", "Arthur", "Dent");
		Employee ford = new Employee("23", "Ford", "Prefect");
		
		List<Employee> employees = new ArrayList<>(asList(arthur, ford));
		
		Collections.sort(employees);
		
		assertEquals(asList(ford, arthur), employees);
	}
	
	@Test
	public void shouldBeAbleToSortEmployeesByLastName() {
		
		Comparator<Employee> lastNameFirstNameComparator = new LastNameFirstNameComparator();
		Employee arthur = new Employee("42", "Arthur", "Dent");
		Employee ford = new Employee("23", "Ford", "Prefect");
		
		List<Employee> employees = new ArrayList<>(asList(ford, arthur));
		
		Collections.sort(employees, lastNameFirstNameComparator);
		
		assertEquals(asList(arthur, ford), employees);
	}
	
	@Test
	public void shouldBeAbleToSortEmployeesByLastNameThenFirstName() {
		
		Comparator<Employee> lastNameFirstNameComparator = new LastNameFirstNameComparator();
		Employee atilla = new Employee("86", "Atilla", "Dent");
		Employee arthur = new Employee("42", "Arthur", "Dent");
		Employee ford = new Employee("23", "Ford", "Prefect");
		
		List<Employee> employees = new ArrayList<>(asList(atilla, arthur, ford));
		
		Collections.sort(employees, lastNameFirstNameComparator);
		
		assertEquals(asList(arthur, atilla, ford), employees);
	}
	
	@Test
	public void shouldNotBeAbleToAddTwoEmployeesWithTheSameIdToASet() {
		Employee arthur = new Employee("42", "Arthur", "Dent");
		Employee another = new Employee("42", "A", "Dent");
		
		Set<Employee> employees = new HashSet<>();
		employees.add(arthur);
		employees.add(another);
		
		assertEquals(1, employees.size());
	}
}
