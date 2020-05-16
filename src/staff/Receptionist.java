package staff;

//AdminStaff extends Staff
public class Receptionist extends AdminStaff {

	public Receptionist() {
	};

	public Receptionist(String name, int staffID, String contactNum, int salary, int contractHrs, String dept) {
		this.name = name;
		this.staffID = counter;
		counter++;
		this.contactNum = contactNum;
		this.salary = salary;
		this.contractHrs = contractHrs;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Department: " + dept + "\n" + "Staff ID: " + staffID + "\n"
				+ "Contract hours: " + contractHrs + "\n" + "Contact Number: " + contactNum + "\n" + "Task: " + task
				+ "\n" + "Salary: " + salary + "\n" + "\n";

	}
}
