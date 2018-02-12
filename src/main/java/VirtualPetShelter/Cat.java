package VirtualPetShelter;

public class Cat extends OrganicPet {

	public Cat(String petName, String description, int petBoredom, int petHunger, int petThirst,
			int petBathroom) {
		super(petName, description);
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBathroom = petBathroom;
		this.petBoredom = petBoredom;		
	}

}
