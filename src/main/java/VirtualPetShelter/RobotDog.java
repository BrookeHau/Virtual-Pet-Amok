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

	public RobotDog(String roboName, String roboDescription) {
		this.roboName = roboName;
		this.roboDescription = roboDescription;
		this.oilLevel = 2;
		this.batteryLevel = 3;
		this.walkLevel = 4;
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
		return roboName + " the " + roboDescription + " has an oil level of " + oilLevel + ", battery level of "
				+ batteryLevel + ", and walk level of " + walkLevel + ".";
	}

}
