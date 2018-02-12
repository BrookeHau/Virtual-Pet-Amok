package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

	private Dog dog = new Dog("Henry", "Dog", 7, 7, 7, 7, 7, 7, 7, 7);

	@Test
	public void dogWalk() {
		dog.walkdog();
		int check = dog.getWalkLevel();
		assertThat(check, is(5));
	}

	@Test
	public void changesForBathroom() {
		dog.takePetToBathroom();
		int hunger = dog.getHunger();
		int bathroom = dog.getBathroom();
		int thirst = dog.getThirst();
		int boredom = dog.getBoredom();
		assertThat(hunger, is(7));
		assertThat(bathroom, is(6));
		assertThat(thirst, is(7));
		assertThat(boredom, is(7));
	}

	@Test
	public void changesForTick() {
		dog.tick();
		int hunger = dog.getHunger();
		int bathroom = dog.getBathroom();
		int thirst = dog.getThirst();
		int boredom = dog.getBoredom();
		Assert.assertEquals(11, bathroom);
		Assert.assertEquals(11, thirst);
		Assert.assertEquals(5, boredom);
		Assert.assertEquals(10, hunger);
	}

	@Test
	public void changesForWalk() {
		dog.walkdog();
		int hunger = dog.getHunger();
		int bathroom = dog.getBathroom();
		int thirst = dog.getThirst();
		int boredom = dog.getBoredom();
		int walk = dog.getWalkLevel();
		Assert.assertEquals(7, bathroom);
		Assert.assertEquals(5, walk);
		Assert.assertEquals(7, thirst);
		Assert.assertEquals(6, boredom);
		Assert.assertEquals(7, hunger);
	}

	@Test
	public void cageCheck() {
		int check = dog.getCageSoilLevel();
		assertThat(check, is(7));
	}

	@Test
	public void cleanCage() {
		dog.cleanCage();
		int check = dog.getCageSoilLevel();
		assertThat(check, is(0));
	}
}
