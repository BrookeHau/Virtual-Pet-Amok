package VirtualPetShelter;

public class Dog extends OrganicPet implements Walkable {

	protected int dogWalk;
	protected int cageSoilLevel;

	public Dog(String petName, String description, int petHealth, int petHappiness, int petBoredom, int petHunger,
			int petThirst, int petBathroom, int dogWalk, int cageSoilLevel) {
		this.petName = petName;
		this.description = description;
		this.dogWalk = dogWalk;
		this.cageSoilLevel = cageSoilLevel;
		this.petHealth = petHealth;
		this.petHappiness = petHappiness;
		this.petBoredom = petBoredom;
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBathroom = petBathroom;
	}

	public Dog(String petName, String description) {
		this.petName = petName;
		this.description = description;
		this.petBoredom = 6;
		this.petHunger = 5;
		this.petThirst = 3;
		this.petBathroom = 4;
		this.dogWalk = 3;
		this.cageSoilLevel = 5;
	}

	public String toString() {
		return petName + " the " + description + " has hunger of " + petHunger + ", thirst of " + petThirst
				+ ", boredom of " + petBoredom + ", and bathroom of " + petBathroom + ", a need for walk of " + dogWalk + " and a cage soil level of " + cageSoilLevel + ".";
	}

	@Override
	public String fullPetInfo() {
		return toString();
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

	@Override
	protected String getHealth() {
		if (petHunger >= 10 && petBathroom >= 10) {
			return "Feeling Amazing";
		}
		if (petHunger >= 5 && petBathroom >= 5) {
			return "Feeling groovy";
		}
		if (petHunger >= 2 && petBathroom >= 2) {
			return "Feeling alright";
		}
		return "Feeling meh";
	}

	public int getCageSoilLevel() {
		return cageSoilLevel;
	}

	public void cleanCage() {
		cageSoilLevel = 0;
	}

}
