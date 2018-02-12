package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class OrganicPetTest {

	private OrganicPet underTest = new Dog("Henry", "dog", 5, 5, 5, 5, 5, 5, 5, 5);

	@Test
	public void changesForWateringPet() {
		underTest.waterPet();
		int hunger = underTest.getHunger();
		int bathroom = underTest.getBathroom();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		assertThat(bathroom, is(7));
		Assert.assertEquals(3, thirst);
		Assert.assertEquals(5, boredom);
		Assert.assertEquals(4, hunger);
	}

	@Test
	public void changesForPlay() {
		underTest.playWithPet();
		int hunger = underTest.getHunger();
		int bathroom = underTest.getBathroom();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		Assert.assertEquals(5, bathroom);
		Assert.assertEquals(7, thirst);
		Assert.assertEquals(2, boredom);
		Assert.assertEquals(6, hunger);
	}

	@Test
	public void changesForBathroom() {
		underTest.takePetToBathroom();
		int hunger = underTest.getHunger();
		int bathroom = underTest.getBathroom();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		Assert.assertEquals(4, bathroom);
		Assert.assertEquals(5, thirst);
		Assert.assertEquals(5, boredom);
		Assert.assertEquals(5, hunger);

	}

	@Test
	public void changesForTick() {
		underTest.tick();
		int hunger = underTest.getHunger();
		int bathroom = underTest.getBathroom();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		Assert.assertEquals(9, bathroom);
		Assert.assertEquals(9, thirst);
		Assert.assertEquals(3, boredom);
		Assert.assertEquals(8, hunger);
	}

	@Test
	public void getName() {
		VirtualPet underTest = new Dog("Henry", "dog", 5, 5, 5, 5, 5, 5, 5, 0);
		String name = underTest.getName();
		Assert.assertEquals("Henry", name);
	}

	@Test
	public void shouldPrintFullPetInfo() {
		String printString = underTest.fullPetInfo();
		assertThat(printString, is(
				"Henry the dog has hunger of 5, thirst of 5, boredom of 5, and bathroom of 5, a need for walk of 5 and a cage soil level of 5."));
	}

	@Test
	public void printAutopopulateInfo() {
		OrganicPet pet = new Dog("Henry", "dog");
		String printString = pet.fullPetInfo();
		assertThat(printString, is(
				"Henry the dog has hunger of 5, thirst of 3, boredom of 6, and bathroom of 4, a need for walk of 3 and a cage soil level of 5."));
	}

}
