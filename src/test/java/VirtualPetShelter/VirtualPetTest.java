package VirtualPetShelter;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class VirtualPetTest {

	private VirtualPet dog = new Dog("Henry", "Dog", 7, 5, 5, 5, 5, 5, 5, 5);

	@Test
	public void getName() {
		String name = dog.getPetName();
		assertTrue(name.equals("Henry"));
	}

	@Test
	public void getDesc() {
		String desc = dog.getPetDescription();
		assertThat(desc, is("Dog"));
	}
	

}
