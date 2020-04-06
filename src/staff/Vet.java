package staff;

public class Vet extends MedicalStaff {
	

	public Vet() {} ;
	
	public Vet(String name, int staffID, String contactNum, int salary, String medicalLicence) {
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
