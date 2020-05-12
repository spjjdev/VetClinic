package animals;

public class Cat extends Animal {

	private String licenceNum;
	
	public Cat() {};

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
		return "Cat, Name: "+ name + "\n"
				+ "Age: " + age + "\n"
				+ "Ailment: " + ailment + "\n"
				+ "Licence No: " + licenceNum + "\n"
				+ "Owner: " + owner + "\n"
				+ "Contact No: " + contactNum + "\n"+ "\n";
				
	}

}
