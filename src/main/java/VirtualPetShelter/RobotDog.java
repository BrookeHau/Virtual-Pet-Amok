package VirtualPetShelter;

public class RobotDog extends Robot implements Walkable {

	private int walkLevel;

	public RobotDog(String roboName, String roboDescription, int oilLevel, int batteryLevel, int walkLevel) {
		this.roboName = roboName;
		this.roboDescription = roboDescription;
		this.oilLevel = oilLevel;
		this.batteryLevel = batteryLevel;
		this.walkLevel = walkLevel;
	}

	@Override
	public void walkdog() {
		walkLevel += 2;
	}

	@Override
	public int getWalkLevel() {
		return walkLevel;
	}

	@Override
	public String fullPetInfo() {
		return toString();
	}

	public String toString() {
		return petName + " the " + description + " has an oil level of " + oilLevel + ", battery level of "
				+ batteryLevel + ", and walk level of " + walkLevel + ".";
	}

}
