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

	public ArrayList<Staff> listAllStaff() {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		for (Staff s : ITteam) {
			staffList.add(s);
		}
		for (Staff s : traineeVets) {
			staffList.add(s);
		}
		for (Staff s : nurses) {
			staffList.add(s);
		}
		for (Staff s : receptionists) {
			staffList.add(s);
		}
		for (Staff s : vets) {
			staffList.add(s);
		}
		return staffList;
	}

	public ArrayList<Staff> listStaffByCategory(int userChoice) {

		ArrayList<Staff> toReturn = new ArrayList<Staff>();

		switch (userChoice) {
		case 1:
			for (Staff s : vets) {
				toReturn.add(s);
			}
		case 2:
			for (Staff s : traineeVets) {
				toReturn.add(s);
			}
		case 3:
			for (Staff s : nurses) {
				toReturn.add(s);
			}
		case 4:
			for (Staff s : ITteam) {
				toReturn.add(s);
			}
		case 5:
			for (Staff s : receptionists) {
				toReturn.add(s);
			}
		}
		return toReturn;
	}

	public ArrayList<Staff> staffWorkingOnTask(int taskChoice) {
		ArrayList<Staff> tasking = new ArrayList<Staff>();
		switch (taskChoice) {
		case 1:
			// for every staff member whose attribute 'task' equals filing
			for (Staff s : ITteam) {
				tasking.add(s);
			}
		case 2:
			for (Staff s : traineeVets) {
				tasking.add(s);
			}
		case 3:
			for (Staff s : nurses) {
				tasking.add(s);
			}
		case 4:
			for (Staff s : ITteam) {
				tasking.add(s);
			}
		case 5:
			for (Staff s : receptionists) {
				tasking.add(s);
			}
		}
		return tasking;
		// tasks as an attribute of staff, ask user for tasks choice and feed to the
		// method
		// admin staff(IT staff and receptionists) mapped to tasks? should tasks be an
		// object? should it be an attribute in admin staff abstraction
	}

	// how do i ask the user to give me a name
	public Staff searchStaffByName(String name) {
		ArrayList<Staff> allStaff = new ArrayList<Staff>();
		for (int i = 0; i < allStaff.size(); i++) {
			if (allStaff.get(i).getName() == name) {
				return allStaff.get(i);
			}
		}
		return null;
	}

	public ArrayList<Animal> listAllAnimals() {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		for (Animal a : dogs) {
			animalList.add(a);
		}
		for (Animal a : cats) {
			animalList.add(a);
		}
		for (Animal a : birds) {
			animalList.add(a);
		}
		for (Animal a : rabbits) {
			animalList.add(a);
		}
		for (Animal a : hamsters) {
			animalList.add(a);
		}
		return animalList;
	}

	public ArrayList<Animal> listAnimalByType(int userChoice) {
		ArrayList<Animal> toReturn = new ArrayList<Animal>();

		switch (userChoice) {
		case 1:
			for (Animal a : dogs) {
				toReturn.add(a);
			}
		case 2:
			for (Animal a : cats) {
				toReturn.add(a);
			}
		case 3:
			for (Animal a : rabbits) {
				toReturn.add(a);
			}
		case 4:
			for (Animal a : birds) {
				toReturn.add(a);
			}
		case 5:
			for (Animal a : hamsters) {
				toReturn.add(a);
			}
		}
		return toReturn;

//		System.out.println("1.Dogs");
//		System.out.println("2.Cats");
//		System.out.println("3.Rabbits");
//		System.out.println("4.Hamsters");
//		System.out.println("5.Birds");
//		int choice = input.nextInt();
//
//		switch (choice) {
//		case 1:
//			System.out.println(dogs);
//		case 2:
//			System.out.println(cats);
//		case 3:
//			System.out.println(rabbits);
//		case 4:
//			System.out.println(hamsters);
//		case 5:
//			System.out.println(birds);
//		}

	}

	public Animal searchAnimalByName(String name) {
		ArrayList<Animal> allAnimals = new ArrayList <Animal>();
		for (int i = 0; i < allAnimals.size(); i++) {
			if (allAnimals.get(i).getName() == name) {
				return allAnimals.get(i);
			}
		}
		return null;

	}

	public void animalsAssignedToStaff() {
		// map key=vet value=queue animals
		// the queue of animals in each vets waiting list,
		// this must be a number of animals from the allAnimals arraylist

//		Map<Vet, Queue> vetMap = new HashMap<Vet, Queue>();

	}

	public void waitingListOfAnimalsPerStaff() {
		// what is the difference in this and the one before
	}

	public void passToNextPet() {
		// this uses the dequeue method of a queue?
	}

}
