package VirtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualShelter() {
		pets.put("Henry", new Dog("Henry", "dog with an old soul, and a charmer", 5, 4, 7, 3, 5, 6, 7, 8));
		pets.put("Woody", new RobotDog("Woody", "energetic and playful robodog", 2, 4, 4));
		pets.put("Kitty", new Cat("Kitty", "cat that loves to play fetch", 3, 3, 5, 4, 7, 5, 5));
		pets.put("Leigh Ann", new RobotCat("Leigh Ann", "robot", 5, 4));
	}

	public void admitPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public int shelterSize() {
		return pets.size();
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public String getFullPetInfo(String testPet) {
		return pets.get(testPet).toString();
	}

	public Collection<VirtualPet> showPets() {
		return pets.values();
	}

	public void clear() {
		pets.clear();
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feedPet();
			}
		}
	}

	public void playAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).playWithPet();
			}
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).waterPet();
			}
		}
	}

	public void calltick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
		}

	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Walkable) {
				((Walkable) pet).walkdog();
			}
		}
	}

	public void oilAllRoboticPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robot) {
				((Robot) pet).oil();
			}
		}
	}

	public void chargeBatteries() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robot) {
				((Robot) pet).charge();
			}
		}
	}

	public void cleanDogCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).cleanCage();
			}
		}
	}

	public void cleanLitterBox() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Cat) {
				((Cat) pet).cleanLitter();
			}
		}
	}

	public int getWalkLevel() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Walkable) {
				return ((Walkable) pet).getWalkLevel();
			}
		}
		return 0;
	}

	public int getHunger() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				return ((OrganicPet) pet).getHunger();
			}
		}
		return 0;
	}

	public int getThirst() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				return ((OrganicPet) pet).getThirst();
			}
		}
		return 0;
	}

	public int getBoredom() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				return ((OrganicPet) pet).getBoredom();
			}
		}
		return 0;
	}

	public int getBathroom() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				return ((OrganicPet) pet).getBathroom();
			}
		}
		return 0;
	}

	public int getOilLevel() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robot) {
				return ((Robot) pet).checkOil();
			}
		}
		return 0;
	}

	public int getBatteryLevel() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robot) {
				return ((Robot) pet).checkBattery();
			}
		}
		return 0;
	}

	public int getCageSoilLevel() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				return ((Dog) pet).getCageSoilLevel();
			}
		}
		return 0;
	}

	public int checkLitter() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Cat) {
				return ((Cat) pet).checkLitter();
			}
		}
		return 0;
	}

}
