package VirtualPetShelter;

public class Dog extends OrganicPet implements Walkable {

	protected int dogWalk;
	protected int cageSoilLevel;

	public Dog(String petName, String description, int petHealth, int petHappiness, int petBoredom, int petHunger,
			int petThirst, int petBathroom, int dogWalk, int cageSoilLevel) {
		this.dogWalk = dogWalk;
		this.cageSoilLevel = cageSoilLevel;
	}

//	public Dog(String petName, String description) {
//		this.petName = petName;
//		this.description = description;
//		this.petBoredom = 6;
//		this.petHunger = 5;
//		this.petThirst = 3;
//		this.petBathroom = 4;
//		this.dogWalk = 3;
//		this.cageSoilLevel = 5;
//	}

	public String toString() {
		return petName + " the " + description + " has hunger of " + petHunger + ", thirst of " + petThirst
				+ ", boredom of " + petBoredom + ", and bathroom of " + petBathroom + ".";
	}

	@Override
	public void fullPetInfo() {
		toString();
	}

	@Override
	public void walkdog() {
		petBoredom -= 1;
		dogWalk -= 2;
	}

	@Override
	public int getWalkLevel() {
		return dogWalk;
	}

}
