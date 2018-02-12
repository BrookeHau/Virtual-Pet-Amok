package VirtualPetShelter;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;

public class VirtualShelterTest {

	private VirtualPet testPet = new Dog("Henry", "dog", 5, 5, 5, 5, 5, 5, 5, 5);
	private VirtualShelter shelterUnderTest = new VirtualShelter();
	private VirtualPet anotherPet = new Cat("Woody", "dog", 5, 5, 5, 5, 5, 5, 5);
	private VirtualPet anotherPet2 = new RobotDog("Woody", "robo", 5, 5, 5);

	@Before
	public void clearList() {
		shelterUnderTest.clear();
	}

	@Test
	public void getFullPetInfo() {
		shelterUnderTest.admitPet(testPet);
		String info = shelterUnderTest.getFullPetInfo("Henry");
		assertThat(info, is(
				"Henry the dog has hunger of 5, thirst of 5, boredom of 5, and bathroom of 5, a need for walk of 5 and a cage soil level of 5."));
	}

	@Test
	public void showAllPets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		Collection<VirtualPet> pets = shelterUnderTest.showPets();
		assertThat(pets, containsInAnyOrder(testPet, anotherPet));
	}

	@Test
	public void shouldAddPet() {
		shelterUnderTest.admitPet(testPet);
		VirtualPet retrieved = shelterUnderTest.findPet("Henry");
		assertThat(retrieved, is(testPet));
	}

	@Test
	public void shouldAddMultiplePets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		int size = shelterUnderTest.shelterSize();
		Assert.assertEquals(2, size);
	}

	@Test
	public void shouldRemovePet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.adoptPet("Henry");
		VirtualPet found = shelterUnderTest.findPet("Henry");
		assertThat(found, is(nullValue()));

	}

	@Test
	public void shouldWalkAllDogs() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.walkAllDogs();
		int check = shelterUnderTest.getWalkLevel();
		Assert.assertEquals(3, check);
	}

	@Test
	public void shouldFeedPets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.feedAllPets();
		int check = shelterUnderTest.getHunger();
		int check2 = shelterUnderTest.getThirst();
		assertThat(check, is(3));
		assertThat(check2, is(6));
	}

	@Test
	public void shouldWaterPets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.waterAllPets();
		int check = shelterUnderTest.getHunger();
		int check2 = shelterUnderTest.getThirst();
		assertThat(check, is(4));
		assertThat(check2, is(3));
	}

	@Test
	public void playPet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.playAllPets();
		int check = shelterUnderTest.getHunger();
		int check2 = shelterUnderTest.getBoredom();
		assertThat(check, is(6));
		assertThat(check2, is(2));
	}

	@Test
	public void useTick() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.calltick();
		int hunger = shelterUnderTest.getHunger();
		int bathroom = shelterUnderTest.getBathroom();
		int thirst = shelterUnderTest.getThirst();
		int boredom = shelterUnderTest.getBoredom();
		assertThat(hunger, is(8));
		assertThat(bathroom, is(9));
		assertThat(thirst, is(9));
		assertThat(boredom, is(3));
	}

	@Test
	public void useTickForRobot() {
		shelterUnderTest.admitPet(anotherPet2);
		shelterUnderTest.calltick();
		int oil = shelterUnderTest.getOilLevel();
		int battery = shelterUnderTest.getBatteryLevel();
		assertThat(oil, is(7));
		assertThat(battery, is(8));
	}

	@Test
	public void cleanCage() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.cleanDogCages();
		int check = shelterUnderTest.getCageSoilLevel();
		assertThat(check, is(0));
	}

	@Test
	public void cleanLitter() {
		shelterUnderTest.admitPet(anotherPet);
		shelterUnderTest.cleanLitterBox();
		int check = shelterUnderTest.checkLitter();
	}

	@Test
	public void playWithOnePet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.playWithPet("Henry");
		int check = shelterUnderTest.getBoredom();
		assertThat(check, is(2));

	}

}
