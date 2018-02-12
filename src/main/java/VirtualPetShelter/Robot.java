package VirtualPetShelter;

public abstract class Robot extends VirtualPet {
	protected String roboName;
	protected String roboDescription;
	protected int oilLevel;
	protected int batteryLevel;

	public void oil() {
		oilLevel += 3;

	}

	public int checkOil() {
		return oilLevel;
	}

	public void charge() {
		batteryLevel += 2;
	}

	public int checkBattery() {
		return batteryLevel;
	}

	public void tick() {
		batteryLevel += 3;
		oilLevel += 2;
	}

	public String getHealth() {
		if (oilLevel >= 10) {
			return "Amazing Health";
		}
		if (oilLevel >= 5) {
			return "Feeling so so";
		}
		if (oilLevel >= 2) {
			return "Low levels, need oil";
		}
		return "Extremely low, HELP";
	}
}
