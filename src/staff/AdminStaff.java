package staff;

public abstract class AdminStaff extends Staff {

	protected int contractHrs;
	protected String dept;
	protected String task;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getContractHrs() {
		return contractHrs;
	}

	public void setContractHrs(int contractHrs) {
		this.contractHrs = contractHrs;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
