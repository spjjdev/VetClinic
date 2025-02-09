import java.util.ArrayList;
import java.util.Random;
import animals.Dog;
import animals.Cat;
import animals.Bird;
import animals.Hamster;
import animals.Rabbit;
import staff.ITstaff;
import staff.Nurse;
import staff.Receptionist;
import staff.TraineeVet;
import staff.Vet;

public class Data {

	Random rG = new Random();

	// These are arrays of data to assign to attributes of the animals and staff
	// instances
	String[] firstName = { "Peter", "Mark", "Matthew", "Luke", "John", "James", "Stephen", "Michael", "Laura",
			"Michelle", "Rose", "Mary", "Cathy", "Ursula", "Sarah", "Rachel" };
	String[] lastName = { "Smith", "Jones", "Ryan", "Byrne", "Roberts", "Hanks", "DeNiro", "Peters", "Jackson",
			"Houston", "Streep", "Windsor", "Kennedy", "Obama", "DeValera", "Collins" };
	String[] dogName = { "Max", "Milo", "Coco", "Bailey", "Daisy", "Rosie", "Rocky", "Brian", "Comet", "Balto", "Bingo",
			"Laika", "Nipper" };
	String[] catName = { "Felix", "Sylvester", "Tigger", "Simba", "Binx", "Shadow", "Duchess", "Lucifer", "Mufasa",
			"Snowbell", "Salem", "Aslan" };
	String[] rabbitName = { "Thumper", "Peter Rabbit", "Bunny", "Snowball", "Roger Rabbit", "Velveteen", "Hodge-Podge",
			"Basil", "Buster", "Hoppy", "Schnuffel", "Benjamin" };
	String[] hamsterName = { "Biscuit", "Bob", "Nibbles", "Chubs", "Beefcake", "Buttons", "Fluffy", "Ginger",
			"Maximillan" };
	String[] birdName = { "Rio", "Griffen", "Sterling", "Coco", "Robin", "Ava", "Tweetie", "Daffy", "Donald", "Hedwig",
			"Captain", "Jupiter", "Pheonix" };
	String[] birdtype = { "Parrot", "Budgie", "Cockatoo", "Canary", "Finch" };
	String[] dogBreed = { "Dashshund", "King Charles", "Labrador", "Bulldog", "Rottweiler", "Terrier", "German Shepard",
			"Poodle" };
	String[] birdAilment = { "Psittacosis", "Proventricular Dilatation Disease", "Psittacine Beak",
			"\r\n" + "Polyomavirus", "Candidiasis", "Broken Wing", "Feather Cyst", "Cataract" };
	String[] dogAilment = { "Ear Infection", "Worms", "Fleas", "Doggy Diarrhea", "Anal gland sacculitis",
			"Atopic dermatitis" };
	String[] catAilment = { "Diabetes", "Feline Immunodeficiency Virus (FIV)", "Feline Leukemia Virus (FelV)",
			"Heartworm", "Ringworm", "Fleas", "Vomiting", "Feline Lower Urinary Tract Disease (FLUTD)",
			"Conjunctivitis" };
	String[] hamsterAilment = { "Wet Tail", "Diarrhea", "Constipation", "Mange", "Runny Eyes", "Abscess",
			"Respiratory Infection" };
	String[] rabbitAilment = { "Ivy poisoning", "Head tilt", "Loss of appetite", "Myxomatosis", "RVHD2",
			"Ear Infection" };
	String[] tasks = { "Filing", "Updating Patient Database", "Patient Follow-up", "Scheduling Appointments" };
	String[] university = { "TCD", "NUIG", "UCD", "Queens" };
	String[] phoneNum = { "0980980981", "0192384211", "5746329821", "0192893843", "0192384211", "5746329821",
			"0192893843", "0918394039", "0909098787", "0980980981", "0192384211", "5746329821", "0192893843",
			"0918394039", "0909098787" };
	String[] dogLicence = { "E63-5647", "D79-5648", "D58-0987", "A12-6048", "F45-2344", "G45-8364", "J09-6543",
			"D14-3113", "R42-1334", "F65-6768", "F66-4353", "D13-2323", "G56-7878", "G55-9764", "W23-4456" };
	int[] animalAge = { 1, 2, 3, 4, 5, 6, 7, 8 };

	// This method builds instances of the Dog Class
	public ArrayList<Dog> buildDog() {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		for (int i = 0; i < 3; i++) {
			dogs.add(new Dog());
			dogs.get(i).setName(dogName[rG.nextInt(dogName.length)]);
			dogs.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			dogs.get(i).setName(dogName[rG.nextInt(dogName.length)]);
			dogs.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			dogs.get(i).setAilment(dogAilment[rG.nextInt(dogAilment.length)]);
			dogs.get(i).setLicenceNum(dogLicence[rG.nextInt(dogLicence.length)]);
			dogs.get(i).setBreed(dogBreed[rG.nextInt(dogBreed.length)]);
			dogs.get(i).setOwner(firstName[rG.nextInt(firstName.length)] + " " + lastName[rG.nextInt(lastName.length)]);
		}
		return dogs;
	}

	// This method builds instances of the Cat Class
	public ArrayList<Cat> buildCat() {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		for (int i = 0; i < 200; i++) {
			cats.add(new Cat());
			cats.get(i).setName(catName[rG.nextInt(catName.length)]);
			cats.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			cats.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			cats.get(i).setAilment(catAilment[rG.nextInt(catAilment.length)]);
			cats.get(i).setLicenceNum(dogLicence[rG.nextInt(dogLicence.length)]);
			cats.get(i).setOwner(firstName[rG.nextInt(firstName.length)] + " " + lastName[rG.nextInt(lastName.length)]);
		}
		return cats;
	}

	// This method builds instances of the Rabbit Class
	public ArrayList<Rabbit> buildRabbit() {
		ArrayList<Rabbit> rabbits = new ArrayList<Rabbit>();
		for (int i = 0; i < 200; i++) {
			rabbits.add(new Rabbit());
			rabbits.get(i).setName(rabbitName[rG.nextInt(rabbitName.length)]);
			rabbits.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			rabbits.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			rabbits.get(i).setAilment(rabbitAilment[rG.nextInt(rabbitAilment.length)]);
			rabbits.get(i)
					.setOwner(firstName[rG.nextInt(firstName.length)] + " " + lastName[rG.nextInt(lastName.length)]);
		}
		return rabbits;
	}

	// This method builds instances of the Hamster Class
	public ArrayList<Hamster> buildHamster() {
		ArrayList<Hamster> hamsters = new ArrayList<Hamster>();
		for (int i = 0; i < 200; i++) {
			hamsters.add(new Hamster());
			hamsters.get(i).setName(hamsterName[rG.nextInt(hamsterName.length)]);
			hamsters.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			hamsters.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			hamsters.get(i).setAilment(hamsterAilment[rG.nextInt(hamsterAilment.length)]);
			hamsters.get(i)
					.setOwner(firstName[rG.nextInt(firstName.length)] + " " + lastName[rG.nextInt(lastName.length)]);
		}
		return hamsters;
	}

	// This method builds instances of the Bird Class
	public ArrayList<Bird> buildBird() {
		ArrayList<Bird> birds = new ArrayList<Bird>();
		for (int i = 0; i < 200; i++) {
			birds.add(new Bird());
			birds.get(i).setName(birdName[rG.nextInt(birdName.length)]);
			birds.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			birds.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			birds.get(i).setAilment(birdAilment[rG.nextInt(birdAilment.length)]);
			birds.get(i).setBirdType(birdtype[rG.nextInt(birdtype.length)]);
			birds.get(i)
					.setOwner(firstName[rG.nextInt(firstName.length)] + " " + lastName[rG.nextInt(lastName.length)]);
		}
		return birds;
	}

	// This method builds instances of the ITstaff Class
	public ArrayList<ITstaff> buildITstaff() {
		ArrayList<ITstaff> ITteam = new ArrayList<ITstaff>();
		for (int i = 0; i < 5; i++) {
			ITstaff s = new ITstaff();
			s.setName(firstName[rG.nextInt(firstName.length)] + " " + lastName[rG.nextInt(lastName.length)]);
			s.setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			s.setSalary(40000);
			s.setContractHrs(30);
			s.setDept("I.T. Department");
			s.getStaffID();
			s.setTask(tasks[rG.nextInt(tasks.length)]);
			ITteam.add(s);
		}
		return ITteam;
	}

	// This method builds instances of the Receptionist Class
	public ArrayList<Receptionist> buildReceptionist() {
		ArrayList<Receptionist> receptionists = new ArrayList<Receptionist>();
		for (int i = 0; i < 200; i++) {
			receptionists.add(new Receptionist());
			receptionists.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			receptionists.get(i).setName(receptionists.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			receptionists.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			receptionists.get(i).setSalary(30000);
			receptionists.get(i).setContractHrs(40);
			receptionists.get(i).setDept("Administration");
			receptionists.get(i).getStaffID();
			receptionists.get(i).setTask(tasks[rG.nextInt(tasks.length)]);
		}
		return receptionists;
	}

	// This method builds instances of the Vet Class
	public ArrayList<Vet> buildVet() {
		ArrayList<Vet> vets = new ArrayList<Vet>();
		for (int i = 0; i < 5; i++) {
			vets.add(new Vet());
			vets.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			vets.get(i).setName(vets.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			vets.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			vets.get(i).setSalary(70000);
			vets.get(i).getMedicalLicence();
			vets.get(i).getStaffID();
		}
		return vets;
	}

	// This method builds instances of the TraineeVet Class
	public ArrayList<TraineeVet> buildTraineeVet() {
		ArrayList<TraineeVet> traineeVets = new ArrayList<TraineeVet>();
		for (int i = 0; i < 10; i++) {
			traineeVets.add(new TraineeVet());
			traineeVets.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			traineeVets.get(i).setName(traineeVets.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			traineeVets.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			traineeVets.get(i).setSalary(40000);
			traineeVets.get(i).setUniversity(university[rG.nextInt(university.length)]);
			traineeVets.get(i).setMedicalLicence("N/A");
			traineeVets.get(i).getStaffID();
		}
		return traineeVets;
	}

	// This method builds instances of the Nurse Class
	public ArrayList<Nurse> buildNurse() {
		ArrayList<Nurse> nurses = new ArrayList<Nurse>();
		for (int i = 0; i < 15; i++) {
			nurses.add(new Nurse());
			nurses.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			nurses.get(i).setName(nurses.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			nurses.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			nurses.get(i).setSalary(40000);
			nurses.get(i).getMedicalLicence();
			nurses.get(i).getStaffID();
		}
		return nurses;
	}

}