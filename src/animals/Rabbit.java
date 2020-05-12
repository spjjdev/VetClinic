package animals;

public class Rabbit extends Animal {
	
	public Rabbit () {};

	public Rabbit(String name, int age, String owner, String contactNum, String ailment) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.contactNum = contactNum;
		this.ailment = ailment;
	}

	@Override
	public String toString() {

		return "Rabbit, Name: "+ name + "\n"
				+ "Age: " + age + "\n"
				+ "Ailment: " + ailment + "\n"
				+ "Owner: " + owner + "\n"
				+ "Contact No: " + contactNum + "\n"+ "\n";
				
				
	}

}
