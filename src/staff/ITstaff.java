package staff;

public class ITstaff extends AdminStaff {

	public ITstaff() {};
	
	public ITstaff(String name, int staffID, String contactNum, int salary, int contractHrs, String dept) {
		this.name = name;
		this.staffID = staffID;
		this.contactNum = contactNum;
		this.salary = salary;
		this.contractHrs = contractHrs;
		this.dept = dept;
	}

}
