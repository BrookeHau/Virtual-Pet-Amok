package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CatTest {


	@Test
	public void changesForBathroom() {
		Cat dog = new Cat("Henry", "Dog", 5, 5, 5, 5);
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
}
