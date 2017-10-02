package cooking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class _02_CookerTests {

	@Test
	public void aMicrowaveShouldBeACooker() {

		Cooker underTest = new Microwave();

		assertNotNull(underTest);
	}

	@Test
	public void aCookerShouldKnowItsTypeIsMicrowave() {

		Cooker underTest = new Microwave();

		String result = underTest.getCookerType();

		assertEquals("Microwave", result);
	}

	@Test
	public void aPizzaOvenShouldBeACooker() {

		Cooker underTest = new PizzaOven();

		assertNotNull(underTest);
	}

	@Test
	public void aCookerShouldKnowItsTypeIsPizzaOven() {

		Cooker underTest = new PizzaOven();

		String result = underTest.getCookerType();

		assertEquals("PizzaOven", result);
	}

	@Test
	public void anElectricRangeShouldBeACooker() {

		Cooker underTest = new ElectricRange();

		assertNotNull(underTest);
	}

	@Test(expected = InstantiationException.class)
	public void shouldNotBeAbleToConstructACooker() throws Exception {
		Cooker.class.newInstance();
	}

	@Test
	public void cookersShouldCook() {
		Cooker underTest = new Microwave();

		assertNotNull(underTest.cook());
	}
}
