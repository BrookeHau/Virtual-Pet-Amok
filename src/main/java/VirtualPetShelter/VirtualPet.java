package VirtualPetShelter;

public abstract class VirtualPet {

	protected String petName;
	protected String description;
	protected int petHealth;
	protected int petHappiness;

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return description;
	}

	public abstract String fullPetInfo();

	public void playWithPet() {

	}

	public abstract void tick();

	public String getName() {
		return petName;
	}

	protected abstract String getHealth();

}
