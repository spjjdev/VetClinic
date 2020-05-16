import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
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
	Queue<Animal> dogsQ;
	Queue<Animal> catsQ;
	Queue<Animal> birdsQ;
	Queue<Animal> hamstersQ;
	Queue<Animal> rabbitsQ;
	Map<Vet, Queue<Animal>> vetQ;

	// In the constructor I have populated the ArrayLists, Queues and Map above with
	// data using appropriate methods.
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
		dogsQ = queueDog();
		catsQ = queueCat();
		birdsQ = queueBird();
		hamstersQ = queueHamster();
		rabbitsQ = queueRabbit();
		vetQ = buildMap();
	}

	// This method puts the ArrayLists of different types of staff into one
	// ArrayList of all staff by iterating through each one and adding to
	// 'staffList'.
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

	// This method takes a user choice and displays the corresponding ArrayList of
	// staff by iterating through that ArrayList and putting them in the 'toReturn'
	// ArrayList.
	public ArrayList<Staff> listStaffByCategory(int userChoice) {
		ArrayList<Staff> toReturn = new ArrayList<Staff>();
		switch (userChoice) {
		case 1:
			for (Staff s : vets) {
				toReturn.add(s);
			}
			break;
		case 2:
			for (Staff s : traineeVets) {
				toReturn.add(s);
			}
			break;
		case 3:
			for (Staff s : nurses) {
				toReturn.add(s);
			}
			break;
		case 4:
			for (Staff s : ITteam) {
				toReturn.add(s);
			}
			break;
		case 5:
			for (Staff s : receptionists) {
				toReturn.add(s);
			}
			break;
		}
		return toReturn;
	}

	// This method returns an ArrayList of Admin staff (ITstaff and receptionists)
	// that are working on a task by iterating through those ArrayLists and
	// searching
	// for an attribute that matches the users choice.
	public ArrayList<Staff> staffWorkingOnTask(int taskChoice) {
		ArrayList<Staff> tasking = new ArrayList<Staff>();
		switch (taskChoice) {
		case 1:
			for (int i = 0; i < receptionists.size(); i++) {
				if (receptionists.get(i).getTask().contains("Filing")) {
					tasking.add(receptionists.get(i));
				}
			}
			for (int i = 0; i < ITteam.size(); i++) {
				if (ITteam.get(i).getTask().contains("Filing")) {
					tasking.add(ITteam.get(i));
				}
			}
			break;
		case 2:
			for (int i = 0; i < receptionists.size(); i++) {
				if (receptionists.get(i).getTask().contains("Making Phone Calls")) {
					tasking.add(receptionists.get(i));
				}
			}
			for (int i = 0; i < ITteam.size(); i++) {
				if (ITteam.get(i).getTask().contains("Making Phone Calls")) {
					tasking.add(ITteam.get(i));
				}
			}
			break;
		case 3:
			for (int i = 0; i < receptionists.size(); i++) {
				if (receptionists.get(i).getTask().contains("Updating Patient Database")) {
					tasking.add(receptionists.get(i));
				}
			}
			for (int i = 0; i < ITteam.size(); i++) {
				if (ITteam.get(i).getTask().contains("Updating Patient Database")) {
					tasking.add(ITteam.get(i));
				}
			}
			break;
		case 4:
			for (int i = 0; i < receptionists.size(); i++) {
				if (receptionists.get(i).getTask().contains("Patient Follow-up")) {
					tasking.add(receptionists.get(i));
				}
			}
			for (int i = 0; i < ITteam.size(); i++) {
				if (ITteam.get(i).getTask().contains("Patient Follow-up")) {
					tasking.add(ITteam.get(i));
				}
			}
			break;
		case 5:
			for (int i = 0; i < receptionists.size(); i++) {
				if (receptionists.get(i).getTask().contains("Scheduling Appointments")) {
					tasking.add(receptionists.get(i));
				}
			}
			for (int i = 0; i < ITteam.size(); i++) {
				if (ITteam.get(i).getTask().contains("Scheduling Appointments")) {
					tasking.add(ITteam.get(i));
				}
			}
			break;
		}
		return tasking;
	}

	// This method returns a staff object whose name attribute matches the users
	// input. it uses the listAllStaff method to get the ArrayList of staff and
	// iterates over it with a linear search for a matching name.
	public ArrayList<Staff> searchStaffByName(String name) {
		ArrayList<Staff> staff = listAllStaff();
		ArrayList<Staff> toReturn = new ArrayList<Staff>();
		for (int i = 0; i < staff.size(); i++) {
			if (staff.get(i).getName().contains(name)) {
				toReturn.add(staff.get(i));
			}
		}
		return toReturn;
	}

	// This method iterates through the separate animal ArrayLists and puts them in
	// one 'animalList' ArrayList
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

	// This retrieves the animal ArrayList that corresponds to the users choice.
	public ArrayList<Animal> listAnimalByType(int userChoice) {
		ArrayList<Animal> toReturn = new ArrayList<Animal>();

		switch (userChoice) {
		case 1:
			System.out.println("one");
			for (Animal a : dogs) {
				toReturn.add(a);

			}
			break;
		case 2:
			System.out.println("two");
			for (Animal a : cats) {
				toReturn.add(a);
			}
			break;
		case 3:
			for (Animal a : rabbits) {
				toReturn.add(a);
			}
			break;
		case 4:
			for (Animal a : birds) {
				toReturn.add(a);
			}
			break;
		case 5:
			for (Animal a : hamsters) {
				toReturn.add(a);
			}
			break;

		}

		return toReturn;
	}

	// This method uses linear search to find an animal with a name attribute that
	// matches the users input.
	public ArrayList<Animal> searchAnimalByName(String name) {
		ArrayList<Animal> animals = listAllAnimals();
		ArrayList<Animal> toReturn = new ArrayList<Animal>();

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getName().contains(name)) {
				toReturn.add(animals.get(i));
			}
		}
		return toReturn;
	}

	// This method uses the Map Collection to retrieve a Queue of animals that a
	// particular vet will look after
	public Queue<Animal> animalsAssignedToStaff(int userChoice) {

		switch (userChoice) {
		case 1:
			return vetQ.get(vets.get(0));

		case 2:
			return vetQ.get(vets.get(1));

		case 3:
			return vetQ.get(vets.get(2));

		case 4:
			return vetQ.get(vets.get(3));

		case 5:
			return vetQ.get(vets.get(4));
		}
		return null;

	}

	// This method uses the Map Collection to retrieve a value of a queue of animals
	// by using the vet key
	public Queue<Animal> waitingListOfAnimalsPerStaff(int userChoice) {
		switch (userChoice) {
		case 1:
			return vetQ.get(vets.get(0));

		case 2:
			return vetQ.get(vets.get(1));

		case 3:
			return vetQ.get(vets.get(2));

		case 4:
			return vetQ.get(vets.get(3));

		case 5:
			return vetQ.get(vets.get(4));
		}
		return null;

	}

	// This method gets a queue of animals based on the user choice and then gives
	// the option to dequeue from that queue
	public Queue<Animal> passToNextPet(int userChoice, int choice) {
		Queue<Animal> queue = waitingListOfAnimalsPerStaff(userChoice);
		if (choice == 1) {
			queue.remove();
			System.out.println(queue);
		} else if (choice == 2) {
			System.out.println("Back to Menu");
		}
		return queue;
	}

	// This method populates a queue of dogs by iterating over the ArrayList of dogs
	public Queue<Animal> queueDog() {
		Queue<Animal> dogQ = new LinkedList<Animal>();
		for (Dog d : dogs) {
			dogQ.add(d);
		}
		return dogQ;
	}

	// This method populates a queue of cats by iterating over the ArrayList of cats
	public Queue<Animal> queueCat() {
		Queue<Animal> catQ = new LinkedList<Animal>();
		for (Cat c : cats) {
			catQ.add(c);
		}
		return catQ;
	}

	// This method populates a queue of birds by iterating over the ArrayList of
	// birds
	public Queue<Animal> queueBird() {
		Queue<Animal> birdQ = new LinkedList<Animal>();
		for (Bird b : birds) {
			birdQ.add(b);
		}
		return birdQ;
	}

	// This method populates a queue of rabbits by iterating over the ArrayList of
	// rabbits
	public Queue<Animal> queueRabbit() {
		Queue<Animal> rabbitQ = new LinkedList<Animal>();
		for (Rabbit r : rabbits) {
			rabbitQ.add(r);
		}
		return rabbitQ;
	}

	// This method populates a queue of hamsters by iterating over the ArrayList of
	// hamsters
	public Queue<Animal> queueHamster() {
		Queue<Animal> hamsterQ = new LinkedList<Animal>();
		for (Hamster h : hamsters) {
			hamsterQ.add(h);
		}
		return hamsterQ;
	}

	// Thid method populates a Map with vets and queues of animals
	public Map<Vet, Queue<Animal>> buildMap() {
		Map<Vet, Queue<Animal>> vetMap = new HashMap<Vet, Queue<Animal>>();
		vetMap.put(vets.get(0), dogsQ);
		vetMap.put(vets.get(1), catsQ);
		vetMap.put(vets.get(2), birdsQ);
		vetMap.put(vets.get(3), hamstersQ);
		vetMap.put(vets.get(4), rabbitsQ);
		return vetMap;

	}

}
