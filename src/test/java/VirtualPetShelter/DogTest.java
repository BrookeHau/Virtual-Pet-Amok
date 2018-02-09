package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

	@Test
	public void dogShouldWalk() {
		Dog test = new Dog("Henry", "dog", 5, 5, 5, 5);
		test.walkdog();
		int check = test.getBoredom();
		assertThat(check, is(4));

	}

	@Test
	public void changesForBathroom() {
		Dog dog = new Dog("Henry", "Dog", 5, 5, 5, 5);
		dog.takePetToBathroom();
		int hunger = dog.getHunger();
		int bathroom = dog.getBathroom();
		int thirst = dog.getThirst();
		int boredom = dog.getBoredom();
		assertThat(hunger, is(5));
		assertThat(bathroom, is(2));
		assertThat(thirst, is(5));
		assertThat(boredom, is(5));
	}

	@Test
	public void changesForTick() {
		Dog dog = new Dog("Henry", "Dog", 5, 5, 5, 5);
		dog.tick();
		int hunger = dog.getHunger();
		int bathroom = dog.getBathroom();
		int thirst = dog.getThirst();
		int boredom = dog.getBoredom();
		Assert.assertEquals(9, bathroom);
		Assert.assertEquals(9, thirst);
		Assert.assertEquals(3, boredom);
		Assert.assertEquals(8, hunger);
	}
}
