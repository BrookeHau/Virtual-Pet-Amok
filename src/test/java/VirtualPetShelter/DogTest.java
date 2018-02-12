package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

	private Dog dog = new Dog("Henry", "Dog", 5, 5, 5, 5, 5, 5, 5, 5);

	@Test
	public void dogWalk() {
		dog.walkdog();
		int check = dog.getWalkLevel();
		assertThat(check, is(3));
	}

	@Test
	public void bathroomChange() {
		dog.takePetToBathroom();
		int check = dog.getBathroom();
		assertThat(check, is(2));
	}
	//
	// @Test
	// public void changesForBathroom() {
	// dog.takePetToBathroom();
	// int hunger = dog.getHunger();
	// int bathroom = dog.getBathroom();
	// int thirst = dog.getThirst();
	// int boredom = dog.getBoredom();
	// assertThat(hunger, is(5));
	// assertThat(bathroom, is(2));
	// assertThat(thirst, is(5));
	// assertThat(boredom, is(5));
	// }
	//
//	 @Test
//	 public void changesForTick() {
//	 dog.tick();
//	 int hunger = dog.getHunger();
//	 int bathroom = dog.getBathroom();
//	 int thirst = dog.getThirst();
//	 int boredom = dog.getBoredom();
//	 Assert.assertEquals(9, bathroom);
//	 Assert.assertEquals(9, thirst);
//	 Assert.assertEquals(3, boredom);
//	 Assert.assertEquals(8, hunger);
//	 }
	
	// @Test
	// public void changesForWalk() {
	// dog.walkdog();
	// int hunger = dog.getHunger();
	// int bathroom = dog.getBathroom();
	// int thirst = dog.getThirst();
	// int boredom = dog.getBoredom();
	// int walk = dog.getWalkLevel();
	// Assert.assertEquals(5, bathroom);
	// Assert.assertEquals(3, walk);
	// Assert.assertEquals(5, thirst);
	// Assert.assertEquals(4, boredom);
	// Assert.assertEquals(5, hunger);
	// }
}
