package VirtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualShelter myPets = new VirtualShelter();
		String optionEntered;

		System.out.println(
				"Thank you for volunteering at Brooke's pet shelter!  We have lots of pets, ranging from RoboPets to Organic pets");

		do {
			System.out.println("This is the status of your pets:");
			System.out.println();
			for (VirtualPet pet : myPets.showPets()) {
				System.out.println("- " + pet);
			}
			System.out.println();
			System.out.println("What would you like to do next?");
			System.out.println("Press 1 to feed all organic pets");
			System.out.println("Press 2 to water all organic pets");
			System.out.println("Press 3 to play with all organic pets");
			System.out.println("Press 4 to clean the cat litterbox");
			System.out.println("Press 5 to adopt a pet");
			System.out.println("Press 6 to admit a pet");
			System.out.println("Press 7 to clean the dog cages");
			System.out.println("Press 8 to oil the robopets");
			System.out.println("Press 9 to charge robopets batteries");
			System.out.println("Press 0 to quit");
			optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				myPets.feedAllPets();
				System.out.println("Thank you for feeding the organic pets!");
				System.out.println("Here's their new level information:");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
			}

			if (optionEntered.equals("2")) {
				myPets.waterAllPets();
				System.out.println("Thank you for watering the organic pets!");
				System.out.println("Here's their new level information:");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
			}

			if (optionEntered.equals("3")) {
				System.out.println("Which pet would you like to play with, or all?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petPlay = input.nextLine();
				if (petPlay.equalsIgnoreCase("all")) {
					myPets.playAllPets();
					System.out.println("Thanks for playing with all the pets! Here's their current status: ");
					for (VirtualPet pet : myPets.showPets()) {
						System.out.println(" - " + pet);
					}
				} else {
					myPets.playWithPet(petPlay);
					System.out.println("Thanks for playing with " + petPlay + "!\nHere's their current status: "
							+ myPets.getFullPetInfo(petPlay));
				}

			}
			if (optionEntered.equals("4")) {
				myPets.cleanLitterBox();
				System.out.println("Thank you for cleaning the cat litterboxes!");
				System.out.println("Which pet would you like to take to the bathroom?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
			}
			if (optionEntered.equals("5")) {
				System.out.println("Which pet would you like to adopt?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String adoptPet = input.nextLine();
				System.out.println("Thank you for adopting " + adoptPet);
				myPets.adoptPet(adoptPet);
			}
			if (optionEntered.equals("6")) {
				System.out.println("Enter the name of the pet you'd like to admit:");
				String admitName = input.nextLine();
				System.out.println("Enter the type of pet you'd like to admit:");
				System.out.println("1 for Cat");
				System.out.println("2 for Dog");
				System.out.println("3 for RoboCat");
				System.out.println("4 for RoboDog");
				String newType = input.nextLine();
				if (newType.equals("1")) {
					System.out.println("Please enter a description of your pet:");
					String catDescription = input.nextLine();
					myPets.admitPet(new Cat(admitName, catDescription));
				}
				if (newType.equals("2")) {
					System.out.println("Please enter a description of your pet:");
					String dogDescription = input.nextLine();
					myPets.admitPet(new Dog(admitName, dogDescription));
				}
				if (newType.equals("3")) {
					System.out.println("Please enter a description of your pet:");
					String rCatDescription = input.nextLine();
					myPets.admitPet(new RobotCat(admitName, rCatDescription));
				}
				if (newType.equals("4")) {
					System.out.println("Please enter a description of your pet:");
					String rDogDescription = input.nextLine();
					myPets.admitPet(new RobotDog(admitName, rDogDescription));
				}
				System.out.println("Thank you for admitting " + admitName + "!");
			}
			if (optionEntered.equals("7")) {
				myPets.cleanDogCages();
				System.out.println("Thank you for cleaning the dog cages!");
				System.out.println("Here's their new level information:");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
			}
			if (optionEntered.equals("8")) {
				myPets.oilAllRoboticPets();
				System.out.println("Thank you for oiling the robopets!");
				System.out.println("Here's their new level information:");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
			}
			if (optionEntered.equals("9")) {
				myPets.chargeBatteries();
				System.out.println("Thank you for charging the robopets!");
				System.out.println("Here's their new level information:");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
			}
			myPets.calltick();
		} while (!(optionEntered.equals("0")));
		System.out.println("Thank you for playing, come back soon!");
		System.exit(0);

	}
}
