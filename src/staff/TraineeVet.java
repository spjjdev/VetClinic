package staff;

public class TraineeVet extends MedicalStaff {

	private String university;

	// this constructor uses the TraineeVet specific variable 'university' and does
	// not use the inherited 'medicalLicence'
	// because a trainee does not yet have one

	public TraineeVet() {};

	public TraineeVet(String name, int staffID, String contactNum, int salary, String university) {
		this.name = name;
		this.staffID = counter;
		counter ++;
		this.contactNum = contactNum;
		this.salary = salary;
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Trainee Vet: "+ name + "\n" 
		           + "Staff ID: " + staffID  + "\n"
					+ "Contact Number: " + contactNum + "\n"
					+ "Salary: " + salary + "\n"
					+ "Medical Licence: " + medicalLicence +"\n"
							+ "University: "+ university + "\n"+"\n";
	}

}
