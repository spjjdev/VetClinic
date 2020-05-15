package staff;

public class ITstaff extends AdminStaff {

	public ITstaff() {
	};

	public ITstaff(String name, String contactNum, int salary, int contractHrs, String dept) {
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
				+ "Contract hours: " + contractHrs + "\n" + "Contact Number: " + contactNum + "\n" + "Salary: " + salary
				+ "\n" + "\n";
	}
}