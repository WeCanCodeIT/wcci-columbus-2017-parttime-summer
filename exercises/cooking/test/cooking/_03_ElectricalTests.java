package cooking;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _03_ElectricalTests {

	@Test
	public void aMicrowaveShouldBePowered() {
		
		Powered underTest = new Microwave();
		
		assertNotNull(underTest);
	}

	@Test
	public void aMicrowaveShouldAllowItselfToBeTurnedOn() {
		
		Powered underTest = new Microwave();
		
		underTest.powerOn();
		boolean turnedOn = underTest.isTurnedOn();
		
		assertTrue(turnedOn);
	}

	
	@Test
	public void aMicrowaveShouldNotBeInitiallyTurnedOn() {
		
		Powered underTest = new Microwave();
		
		boolean turnedOn = underTest.isTurnedOn();

		assertFalse(turnedOn);
	}

	/**
	 * Our pizza oven is a crude wood-burning fire hazard.
	 */
	@Test
	public void aPizzaOvenShouldNotBePowered() {
		
		// this is checking whether a PizzaOven *isA* Powered
		boolean isPowered = Powered.class.isAssignableFrom(PizzaOven.class);
		
		assertFalse(isPowered);
	}

	@Test
	public void anElectricRangeShouldBePowered() {
		
		Powered underTest = new ElectricRange();
		
		assertNotNull(underTest);
	}

	@Test
	public void anElectricRangeShouldAllowItselfToBeTurnedOn() {
		
		Powered underTest = new ElectricRange();
		
		underTest.powerOn();
		boolean turnedOn = underTest.isTurnedOn();
		
		assertTrue(turnedOn);
	}
}
