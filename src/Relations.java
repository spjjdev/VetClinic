import java.util.ArrayList;
import java.util.Scanner;

import animals.Animal;
import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Hamster;
import animals.Rabbit;
import staff.ITstaff;
import staff.Nurse;
import staff.Receptionist;
import staff.Staff;
import staff.TraineeVet;
import staff.Vet;

public class Relations {

	Data data = new Data();
	Scanner input = new Scanner(System.in);
	ArrayList<Dog> dogs;
	ArrayList<Cat> cats;
	ArrayList<Rabbit> rabbits;
	ArrayList<Hamster> hamsters;
	ArrayList<Bird> birds;
	ArrayList<ITstaff> ITteam;
	ArrayList<Receptionist> receptionists;
	ArrayList<Vet> vets;
	ArrayList<TraineeVet> traineeVets;
	ArrayList<Nurse> nurses;
	ArrayList<Staff> allStaff; // must populate this from all arrays of staff
	ArrayList<Animal> allAnimals; // must populate this from all arrays of animals

	public Relations() {
		dogs = data.buildDog();
		cats = data.buildCat();
		rabbits = data.buildRabbit();
		hamsters = data.buildHamster();
		birds = data.buildBird();
		ITteam = data.buildITstaff();
		receptionists = data.buildReceptionist();
		vets = data.buildVet();
		traineeVets = data.buildTraineeVet();
		nurses = data.buildNurse();
	}

//	ArrayList<Animal> animals = new ArrayList<Animal>();
//	animals.addAll(dogs);
//	animals.addAll(cats);
//	animals.addAll(rabbits);

//	Queue<Animal> animalQueue = new LinkedList<>();

//	animalQueue.add(dogs);
//	

	// populate this array from other staff arrays
	public ArrayList<Staff> listAllStaff(ArrayList<Staff> allStaff) {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		for (int i = 0; i < allStaff.size(); i++) {
			System.out.println((i + 1) + ". " + allStaff.get(i).toString());
		}
		return staffList;
	}

	public void listStaffByCategory() {
		// display each type of staff as a list ie 1.vet 2.nurse etc
		// user chooses and display arraylist of type of staff
		System.out.println("1.Vets");
		System.out.println("2.Trainee Vets");
		System.out.println("3.Nurses");
		System.out.println("4.Receptionists");
		System.out.println("5.IT Staff");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			for (int i = 0; i < vets.size(); i++) {
				System.out.println(vets.get(i).getName());
			}
		case 2:
			System.out.println(traineeVets);
		case 3:
			System.out.println(nurses);
		case 4:
			System.out.println(receptionists);
		case 5:
			System.out.println(ITteam);
		}
	}

	public void staffWorkingOnTask() {
	}

	public Staff searchStaffByName(String name, ArrayList<Staff> allStaff) {
		for (int i = 0; i < allStaff.size(); i++) {
			if (allStaff.get(i).getName() == name) {
				return allStaff.get(i);
			}
		}
		return null;
	}

	public ArrayList<Animal> listAllAnimals(ArrayList<Animal> allAnimals) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		for (int i = 0; i < allAnimals.size(); i++) {
			System.out.println((i + 1) + ". " + allAnimals.get(i).toString());

		}
		return animalList;
	}

	public void listAnimalByType() {
		// display lists of animals by type, user chooses and displays the arraylist
		// of specific type by one attribute, eg name
		System.out.println("1.Dogs");
		System.out.println("2.Cats");
		System.out.println("3.Rabbits");
		System.out.println("4.Hamsters");
		System.out.println("5.Birds");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println(dogs);
		case 2:
			System.out.println(cats);
		case 3:
			System.out.println(rabbits);
		case 4:
			System.out.println(hamsters);
		case 5:
			System.out.println(birds);
		}

	}

	public void searchAnimalType() {
		// display list of animal types and choose one displaying that array of animals
	}

	public Animal searchAnimalByName(String name, ArrayList<Animal> allAnimals) {
		for (int i = 0; i < allAnimals.size(); i++) {
			if (allAnimals.get(i).getName() == name) {
				return allAnimals.get(i);
			}
		}
		return null;

	}

	public void animalsAssignedToStaff() {
		// the queue of animals in each vets waiting list,
		// this must be a number of animals from the allAnimals arraylist
		// map key=vet value=queue animals
	}

	public void waitingListOfAnimalsPerStaff() {
		// what is the difference in this and the one before
	}

	public void passToNextPet() {
	}

}
