package VirtualPetShelter;

public class Cat extends OrganicPet {

	private int litterSoilLevel;

	public Cat(String petName, String description, int petBoredom, int petHunger, int petThirst, int petBathroom,
			int litterSoilLevel, int petHealth, int petHappiness) {
		this.petName = petName;
		this.description = description;
		this.litterSoilLevel = litterSoilLevel;
		this.petHealth = petHealth;
		this.petHappiness = petHappiness;
		this.petBoredom = petBoredom;
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBathroom = petBathroom;
	}

	public String toString() {
		return petName + " the " + description + " has hunger of " + petHunger + ", thirst of " + petThirst
				+ ", boredom of " + petBoredom + ", and bathroom of " + petBathroom + " and a litterbox soil level of "
				+ litterSoilLevel + ".";
	}

	@Override
	public String fullPetInfo() {
		return toString();
	}

	@Override
	protected String getHealth() {
		if (petHunger >= 10) {
			return "Feeling Amazing";
		}
		if (petHunger >= 5) {
			return "Feeling groovy";
		}
		if (petHunger >= 2) {
			return "Feeling alright";
		}
		return "Feeling meh";
	}

	public int checkLitter() {
		return litterSoilLevel;
	}

	public void cleanLitter() {
		litterSoilLevel = 0;
	}

}
