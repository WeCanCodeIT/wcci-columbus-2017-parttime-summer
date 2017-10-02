package cooking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * We are doing something unusual here. Usually the tests for a class would be
 * found in a corresponding *Test class. Here we are combining unit tests so
 * that we can make them pass in a prescribed order.
 */
public class _01_CookingTests {

	@Test
	public void shouldBeAbleToCreateAMicrowave() {
		
		Microwave underTest = new Microwave();
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCookWithAMicrowave() {
		
		Microwave underTest = new Microwave();

		String response = underTest.cook();
		
		assertEquals("Cooking by spinning polar molecules!", response);
	}
	
	@Test
	public void shouldBeAbleToCreateAPizzaOven() {
		
		PizzaOven underTest = new PizzaOven();
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCookWithAPizzaOven() {
		
		PizzaOven underTest = new PizzaOven();
		
		String response = underTest.cook();
		
		assertEquals("Cooking over wood fire!", response);
	}
	
	@Test
	public void shouldBeAbleToCreateAnElectricRange() {
		
	}
	
	@Test
	public void shouldBeAbleToCookWithAnElectricRange() {
		
		ElectricRange underTest = new ElectricRange();
		
		String response = underTest.cook();
		
		assertEquals("Cooking on a hot surface!", response);
	}
}
