package VirtualPetShelter;

public class OrganicPet extends VirtualPet {

	protected int petHunger;
	protected int petThirst;
	protected int petBathroom;
	protected int petBoredom;

	public OrganicPet(String petName, String description, int petBoredom, int petHunger, int petThirst,
			int petBathroom) {
		this.petName = petName;
		this.description = description;
		// super(petName, description);
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBathroom = petBathroom;
		this.petBoredom = petBoredom;
	}

	public OrganicPet(String petName, String description) {
//		super(petName, description);
		this.petName = petName;
		this.description = description;
		this.petHunger = 4;
		this.petThirst = 5;
		this.petBathroom = 3;
		this.petBoredom = 5;

	}

	public void feedPet() {
		petHunger -= 2;
		petThirst += 1;
		petBathroom += 2;

	}

	public int getHunger() {
		return petHunger;
	}

	public int getBathroom() {
		return petBathroom;
	}

	public int getThirst() {
		return petThirst;
	}

	public void waterPet() {
		petHunger -= 1;
		petThirst -= 2;
		petBathroom += 2;
	}

	public void playWithPet() {
		petThirst += 2;
		petBoredom -= 3;
		petHunger += 1;
	}

	public int getBoredom() {
		return petBoredom;
	}

	public void takePetToBathroom() {
		petBathroom -= 3;
	}

	@Override
	public void tick() {
		petHunger += 3;
		petThirst += 4;
		petBoredom -= 2;
		petBathroom += 4;
	}

	public String toString() {
		return petName + " the " + description + " has hunger of " + petHunger + ", thirst of " + petThirst
				+ ", boredom of " + petBoredom + ", and bathroom of " + petBathroom + ".";
	}

	@Override
	public void fullPetInfo() {
		toString();
	}

}
