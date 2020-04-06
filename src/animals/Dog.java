package animals;

public class Dog extends Animal {

	private String licenceNum;

	public Dog(String name, int age, String owner, String contactNum, String ailment, String licenceNum) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.contactNum = contactNum;
		this.ailment = ailment;
		this.licenceNum = licenceNum;
	}

	public String getLicenceNum() {
		return licenceNum;
	}

	public void setLicenceNum(String licenceNum) {
		this.licenceNum = licenceNum;
	}

	@Override
	public String toString() {
		return "Dog [licenceNum=" + licenceNum + ", name=" + name + ", age=" + age + ", owner=" + owner
				+ ", contactNum=" + contactNum + ", ailment=" + ailment + "]";
	}

}
