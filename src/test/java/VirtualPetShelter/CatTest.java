package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

	private Cat cat = new Cat("Henry", "cat", 5, 5, 5, 5, 5, 5, 5);

	@Test
	public void changesForBathroom() {
		cat.takePetToBathroom();
		int hunger = cat.getHunger();
		int bathroom = cat.getBathroom();
		int thirst = cat.getThirst();
		int boredom = cat.getBoredom();
		assertThat(hunger, is(5));
		assertThat(bathroom, is(4));
		assertThat(thirst, is(5));
		assertThat(boredom, is(5));
	}

	@Test
	public void changesForTick() {
		cat.tick();
		int hunger = cat.getHunger();
		int bathroom = cat.getBathroom();
		int thirst = cat.getThirst();
		int boredom = cat.getBoredom();
		Assert.assertEquals(9, bathroom);
		Assert.assertEquals(9, thirst);
		Assert.assertEquals(3, boredom);
		Assert.assertEquals(8, hunger);
	}

	@Test
	public void checkLitterBox() {
		int check = cat.checkLitter();
		assertThat(check, is(5));
	}

	@Test
	public void cleanLitter() {
		cat.cleanLitter();
		int check = cat.checkLitter();
		assertThat(check, is(0));
	}

	@Test
	public void getHealth() {
		Cat cat2 = new Cat("Henry", "cat", 5, 10, 5, 5, 5, 5, 5);
		String check = cat2.getHealth();
		assertThat(check, is("Feeling Amazing"));
	}
}
