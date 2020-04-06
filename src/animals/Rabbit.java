package animals;

public class Rabbit extends Animal {

	public Rabbit(String name, int age, String owner, String contactNum, String ailment) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.contactNum = contactNum;
		this.ailment = ailment;
	}

	@Override
	public String toString() {
		return "Rabbit [name=" + name + ", age=" + age + ", owner=" + owner + ", contactNum=" + contactNum
				+ ", ailment=" + ailment + "]";
	}

}
