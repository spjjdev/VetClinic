import java.util.ArrayList;
import java.util.Random;

import animals.Animal; //do i need to import this or if i import each animal by iself will the abstraction reach outside the package
import animals.Dog;
import animals.Cat;
import animals.Bird;
import animals.Hamster;
import animals.Rabbit;

public class Data {

	Random rG = new Random();

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
	// i want to randomly generate these in a method randomly assigns and feeds to
	// the setter methods in Animal class
	int[] animalAge = { 1, 2, 3, 4, 5, 6, 7, 8 };
	String[] phoneNum = { "0980980981", "0192384211", "5746329821", "0192893843", "0192384211", "5746329821",
			"0192893843", "0918394039", "0909098787", "0980980981", "0192384211", "5746329821", "0192893843",
			"0918394039", "0909098787" };
	String[] dogLicence = { "0980980981", "0192384211", "5746329821", "0192893843", "0192384211", "5746329821",
			"0192893843", "0918394039", "0909098787", "0980980981", "0192384211", "5746329821", "0192893843",
			"0918394039", "0909098787" };

	public ArrayList<Dog> buildDog(ArrayList<Dog> dogs) {
		for (int i = 0; i < 20; i++) {
			dogs.add(new Dog());
			dogs.get(i).setName(dogName[rG.nextInt(dogName.length)]);
			dogs.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			dogs.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			dogs.get(i).setName(dogs.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			dogs.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			dogs.get(i).setAilment(dogAilment[rG.nextInt(dogAilment.length)]);
			dogs.get(i).setLicenceNum(dogLicence[rG.nextInt(dogLicence.length)]);
			dogs.get(i).setBreed(dogBreed[rG.nextInt(dogBreed.length)]);

		}
		return dogs;
	}

	public ArrayList<Cat> buildCat(ArrayList<Cat> cats) {
		for (int i = 0; i < 20; i++) {
			cats.add(new Cat());
			cats.get(i).setName(catName[rG.nextInt(catName.length)]);
			cats.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			cats.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			cats.get(i).setName(cats.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			cats.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			cats.get(i).setAilment(catAilment[rG.nextInt(catAilment.length)]);
			cats.get(i).setLicenceNum(dogLicence[rG.nextInt(dogLicence.length)]);

		}
		return cats;
	}

	public ArrayList<Rabbit> buildRabbit(ArrayList<Rabbit> rabbits) {
		for (int i = 0; i < 20; i++) {
			rabbits.add(new Rabbit());
			rabbits.get(i).setName(rabbitName[rG.nextInt(rabbitName.length)]);
			rabbits.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			rabbits.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			rabbits.get(i).setName(rabbits.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			rabbits.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			rabbits.get(i).setAilment(rabbitAilment[rG.nextInt(rabbitAilment.length)]);

		}
		return rabbits;
	}

	public ArrayList<Hamster> buildHamster(ArrayList<Hamster> hamsters) {
		for (int i = 0; i < 20; i++) {
			hamsters.add(new Hamster());
			hamsters.get(i).setName(hamsterName[rG.nextInt(hamsterName.length)]);
			hamsters.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			hamsters.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			hamsters.get(i).setName(hamsters.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			hamsters.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			hamsters.get(i).setAilment(hamsterAilment[rG.nextInt(hamsterAilment.length)]);

		}
		return hamsters;
	}

	public ArrayList<Bird> buildBird(ArrayList<Bird> birds) {
		for (int i = 0; i < 20; i++) {
			birds.add(new Bird());
			birds.get(i).setName(birdName[rG.nextInt(birdName.length)]);
			birds.get(i).setAge(animalAge[rG.nextInt(animalAge.length)]);
			birds.get(i).setName(firstName[rG.nextInt(firstName.length)]);
			birds.get(i).setName(birds.get(i).getName() + " " + lastName[rG.nextInt(lastName.length)]);
			birds.get(i).setContactNum(phoneNum[rG.nextInt(phoneNum.length)]);
			birds.get(i).setAilment(birdAilment[rG.nextInt(birdAilment.length)]);
			birds.get(i).setBirdType(birdtype[rG.nextInt(birdtype.length)]);

		}
		return birds;
	}
}