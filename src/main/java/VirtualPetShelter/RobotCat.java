package VirtualPetShelter;

public class RobotCat extends Robot {

	public RobotCat(String roboName, String roboDescription, int oilLevel, int batteryLevel) {
		this.roboName = roboName;
		this.roboDescription = roboDescription;
		this.oilLevel = oilLevel;
		this.batteryLevel = batteryLevel;

	}

	@Override
	public String fullPetInfo() {
		return toString();
	}

	public String toString() {
		return petName + " the " + description + " has an oil level of " + oilLevel + ", battery level of "
				+ batteryLevel + ".";
	}

}