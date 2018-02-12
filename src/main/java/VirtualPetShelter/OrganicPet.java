package VirtualPetShelter;

public abstract class OrganicPet extends VirtualPet {

	protected int petHunger;
	protected int petThirst;
	protected int petBathroom;
	protected int petBoredom;

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
		petBathroom -= 1;
	}

	@Override
	public void tick() {
		petHunger += 3;
		petThirst += 4;
		petBoredom -= 2;
		petBathroom += 4;
	}
}
