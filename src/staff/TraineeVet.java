package staff;

public class TraineeVet extends MedicalStaff{
	
	private String university;
	
	//this constructor uses the TraineeVet specific variable 'university' and does not use the inherited 'medicalLicence' 
	//because a trainee does not yet have one
	public TraineeVet (String name, String staffID, String contactNum, int salary, String university) {
		this.name = name;
		this.staffID = staffID;
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
		return "TraineeVet [university=" + university +  ", name=" + name
				+ ", staffID=" + staffID + ", contactNum=" + contactNum + ", salary=" + salary + "]";
	}
 
	
	
}
