package animals;

public class Hamster extends Animal {

	public Hamster(String name, int age, String owner, String contactNum, String ailment) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.contactNum = contactNum;
		this.ailment = ailment;
	}

	@Override
	public String toString() {
		return "Hamster [name=" + name + ", age=" + age + ", owner=" + owner + ", contactNum=" + contactNum
				+ ", ailment=" + ailment + "]";
	}

}
