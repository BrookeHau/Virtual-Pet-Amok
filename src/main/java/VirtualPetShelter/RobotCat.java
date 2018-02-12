package VirtualPetShelter;

public class RobotCat extends Robot {

	public RobotCat(String roboName, String roboDescription, int oilLevel, int batteryLevel) {
		this.roboName = roboName;
		this.roboDescription = roboDescription;
		this.oilLevel = oilLevel;
		this.batteryLevel = batteryLevel;

	}

	public RobotCat(String roboName, String roboDescription) {
		this.roboName = roboName;
		this.roboDescription = roboDescription;
		this.oilLevel = 4;
		this.batteryLevel = 2;

	}

	@Override
	public String fullPetInfo() {
		return toString();
	}

	public String toString() {
		return roboName + " the " + roboDescription + " has an oil level of " + oilLevel + ", battery level of "
				+ batteryLevel + ".";
	}

}