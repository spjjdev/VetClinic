package staff;

public class Vet extends MedicalStaff {

	public Vet() {
	} // not sure if i need a default constructor

	public Vet(String name, String staffID, String contactNum, int salary, String medicalLicence) {
		this.name = name;
		this.staffID = staffID;
		this.contactNum = contactNum;
		this.salary = salary;
		this.medicalLicence = medicalLicence;
	}

	@Override
	public String toString() {
		return "Vet [medicalLicence=" + medicalLicence + ", name=" + name + ", staffID=" + staffID + ", contactNum="
				+ contactNum + ", salary=" + salary + "]";
	}
	
	
}
