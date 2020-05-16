package animals;

public class Bird extends Animal {

	private String birdType;

	public Bird() {
	};

	public Bird(String name, int age, String owner, String contactNum, String ailment, String birdType) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.contactNum = contactNum;
		this.ailment = ailment;
		this.birdType = birdType;
	}

	public String getBirdType() {
		return birdType;
	}

	public void setBirdType(String birdType) {
		this.birdType = birdType;
	}

	@Override
	public String toString() {
		return "Bird, Name: " + name + "\n" + "Age: " + age + "\n" + "Species: " + birdType + "\n" + "Ailment: "
				+ ailment + "\n" + "Owner: " + owner + "\n" + "Contact No: " + contactNum + "\n" + "\n";

	}
}
