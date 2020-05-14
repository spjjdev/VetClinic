package staff;

public class Nurse extends MedicalStaff {
	
	public Nurse () {};
	
	public Nurse(String name, int staffID, String contactNum, int salary, String medicalLicence) {
		this.name = name;
		this.staffID = counter;
		counter++;
		this.contactNum = contactNum;
		this.salary = salary;
		this.medicalLicence = medicalLicence;
	}

	@Override
	public String toString() {
		return "Nurse: "+ name + "\n" 
		           + "Staff ID: " + staffID  + "\n"
					+ "Contact Number: " + contactNum + "\n"
					+ "Salary: " + salary + "\n"
					+ "Medical Licence: " + medicalLicence + "\n"+"\n";
	}

	
	
	
}
