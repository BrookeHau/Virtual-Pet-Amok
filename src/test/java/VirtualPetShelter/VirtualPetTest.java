package VirtualPetShelter;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class VirtualPetTest {

	@Test
	public void getName() {
		VirtualPet dog = new Dog("Henry", "Dog", 5, 5, 5, 5);
		String name = dog.getPetName();
		assertTrue(name.equals("Henry"));
	}

	@Test
	public void getDesc() {
		VirtualPet dog = new Dog("Henry", "Dog", 5, 5, 5, 5);
		String desc = dog.getPetDescription();
		assertThat(desc, is("Dog"));
	}

}
