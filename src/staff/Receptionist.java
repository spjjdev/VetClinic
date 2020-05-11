package staff;

public class Receptionist extends AdminStaff {
	
	public Receptionist () {};
	
	public Receptionist(String name, int staffID, String contactNum, int salary, int contractHrs, String dept) {
		this.name = name;
		this.staffID = counter;
		counter ++;
		this.contactNum = contactNum;
		this.salary = salary;
		this.contractHrs = contractHrs;
		this.dept = dept;
	}
}
