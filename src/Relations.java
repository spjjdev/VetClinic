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
		
		Queue<Animal> dogsQ = new LinkedList<Animal>();
		for (Animal d : dogs) {
			dogsQ.add(d);
		}
		Queue<Animal> catsQ = new LinkedList<Animal>();
		for (Animal c : cats) {
			catsQ.add(c);
		}
		Queue<Animal> birdsQ = new LinkedList<Animal>();
		for (Animal b : birds) {
			birdsQ.add(b);
		}
		Queue<Animal> rabbitsQ = new LinkedList<Animal>();
		for (Animal r : rabbits) {
			rabbitsQ.add(r);
		}
		Queue<Animal> hamstersQ = new LinkedList<Animal>();
		for (Animal h : hamsters) {
			hamstersQ.add(h);
		}
		
		Map<Vet, Queue<Animal>> vetQ = new HashMap<Vet,Queue<Animal>>();
		vetQ.put(vets.get(0), dogsQ);
		vetQ.put(vets.get(1), catsQ);
		vetQ.put(vets.get(2), birdsQ);
		vetQ.put(vets.get(3), hamstersQ);
		vetQ.put(vets.get(4), rabbitsQ);
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

	public ArrayList<Staff> staffWorkingOnTask(int taskChoice) {
		ArrayList<Staff> staff = listAllStaff();
		ArrayList<Staff> tasking = new ArrayList<Staff>();
		switch (taskChoice) {
		case 1:
			for (int i = 0; i < staff.size(); i++) {
				if (staff.get(i).getTask().contains("Filing")) {
					tasking.add(staff.get(i));
				}
			}
			break;
		case 2:
			for (int i = 0; i < staff.size(); i++) {
				if (staff.get(i).getTask().contains("Making Phone Calls")) {
					tasking.add(staff.get(i));
				}
			}
			break;
		case 3:
			for (int i = 0; i < staff.size(); i++) {
				if (staff.get(i).getTask().contains("Updating Patient Database")) {
					tasking.add(staff.get(i));
				}
			}
			break;
		case 4:
			for (int i = 0; i < staff.size(); i++) {
				if (staff.get(i).getTask().contains("Patient Follow-up")) {
					tasking.add(staff.get(i));
				}
			}
			break;
		case 5:
			for (int i = 0; i < staff.size(); i++) {
				if (staff.get(i).getTask().contains("Scheduling Appointments")) {
					tasking.add(staff.get(i));
				}
			}
			break;
		}
		return tasking;

	}

	public ArrayList<Staff> searchStaffByName(String name) {
		ArrayList<Staff> staff = listAllStaff();
		ArrayList<Staff> toReturn = new ArrayList<Staff>();
		// arraylist of staff with same name
		for (int i = 0; i < staff.size(); i++) {
			if (staff.get(i).getName().contains(name)) {
				toReturn.add(staff.get(i));
			}
		}
		return toReturn;
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

	public Queue<Animal> animalsAssignedToStaff(int userChoice) {
		Queue<Animal> toReturn = new LinkedList<Animal>();
		switch (userChoice) {
		case 1:
			vetQ.get(vets.get(0));
			toReturn.
			
			break;
		case 2:
			vetQ.get(vets.get(1));
			
			break;
		case 3:
			vetQ.get(vets.get(2));
			
			break;
		case 4:
			vetQ.get(vets.get(3));
			
			break;
		case 5:
			vetQ.get(vets.get(4));
			
			break;
		}
		return toReturn;
		
		
		
		

		return toReturn;
	}

	public void waitingListOfAnimalsPerStaff() {
		// what is the difference in this and the one before
	}

	public void passToNextPet() {
		// this uses the dequeue method of a queue?
	}

}
