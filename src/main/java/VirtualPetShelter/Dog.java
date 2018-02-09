package VirtualPetShelter;

public class Dog extends OrganicPet implements Walkable {

	public Dog(String petName, String description, int petBoredom, int petHunger, int petThirst, int petBathroom) {
		super(petName, description);
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBathroom = petBathroom;
		this.petBoredom = petBoredom;
	}

	public void walkdog() {
		petBoredom -= 1;
	}

}
