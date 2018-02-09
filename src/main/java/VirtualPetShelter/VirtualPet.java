package VirtualPetShelter;

public abstract class VirtualPet {

	protected String petName;

	protected int petBoredom;
	protected String description;
	protected int petHealth;

	public String getPetName() {
		return petName;
	}
	public String getPetDescription() {
		return description; 
	}
	
	public abstract void fullPetInfo();

	public abstract void tick();

	public String getName() {
		return petName;
	}

}
