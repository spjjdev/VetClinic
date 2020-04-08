package staff;

public class ITstaff extends AdminStaff {

	public ITstaff() {};
	
	public ITstaff(String name, String contactNum, int salary, int contractHrs, String dept) {
		this.name = name;
		this.staffID = counter;
		counter++;
		this.contactNum = contactNum;
		this.salary = salary;
		this.contractHrs = contractHrs;
		this.dept = dept;
	}

}
