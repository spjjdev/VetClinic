package animals;

public class Cat extends Animal {

	private String licenceNum;

	public Cat(String name, int age, String owner, String contactNum, String ailment, String licenceNum) {
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
		return "Cat [licenceNum=" + licenceNum + ", name=" + name + ", age=" + age + ", owner=" + owner
				+ ", contactNum=" + contactNum + ", ailment=" + ailment + "]";
	}

}
