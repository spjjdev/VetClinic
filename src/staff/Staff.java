package staff;

public abstract class Staff {

	protected String name;
	protected int staffID;
	protected String contactNum;
	protected int salary;
	static int counter = 0001;
	protected String task;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffID() {
		return staffID;
	}


	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// I have generated a to string method here as well as the sub classes because
	// it might be useful to get a list
	// of staff regardless of role
	@Override
	public String toString() {
		return "Staff, Name: "+ name + "\n" 
		           + "Staff ID: " + staffID  + "\n"
					+ "Contact Number: " + contactNum + "\n"
					+ "Task: " + task + "\n"
					+ "Salary: " + salary + "\n"+"\n";	
				
				
				
	}

}
