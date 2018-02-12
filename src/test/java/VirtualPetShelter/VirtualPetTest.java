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
		assertThat(name, is("Henry"));
	}

	@Test
	public void getDesc() {
		String desc = dog.getPetDescription();
		assertThat(desc, is("Dog"));
	}
	
	@Test
	public void getInfo() {
		String check = dog.fullPetInfo();
		assertThat(check, is("Henry the Dog has hunger of 5, thirst of 5, boredom of 5, and bathroom of 5."));
	}
	
	@Test
	public void getHealth() {
		String check = dog.getHealth();
		assertThat(check, is("Feeling groovy"));
	}
	
	@Test 
	public void getHealth2() {
		VirtualPet pet = new Dog("Henry", "Dog", 3,2,1,1,7,8,3,8);
		String check = pet.getHealth();
		assertThat(check,is("Feeling meh"));
	}
	


}
