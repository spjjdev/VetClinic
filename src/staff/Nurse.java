package staff;

public class Nurse extends MedicalStaff {

	public Nurse(String name, String staffID, String contactNum, int salary, String medicalLicence) {
		this.name = name;
		this.staffID = staffID;
		this.contactNum = contactNum;
		this.salary = salary;
		this.medicalLicence = medicalLicence;
	}

	@Override
	public String toString() {
		return "Nurse [medicalLicence=" + medicalLicence + ", name=" + name + ", staffID=" + staffID + ", contactNum="
				+ contactNum + ", salary=" + salary + "]";
	}

	
	
	
}
