package animals;

public class Dog extends Animal {

	private String licenceNum;
	private String breed;
	
	public Dog() {};

	public Dog(String name, int age, String owner, String contactNum, String ailment, String licenceNum, String breed) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.contactNum = contactNum;
		this.ailment = ailment;
		this.licenceNum = licenceNum;
		this.breed = breed;
	}

	public String getLicenceNum() {
		return licenceNum;
	}

	public void setLicenceNum(String licenceNum) {
		this.licenceNum = licenceNum;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [licenceNum=" + licenceNum + ", breed=" + breed + ", name=" + name + ", age=" + age + ", owner="
				+ owner + ", contactNum=" + contactNum + ", ailment=" + ailment + "]";
	}

	

}
