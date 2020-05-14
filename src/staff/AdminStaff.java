package staff;

public abstract class AdminStaff extends Staff {

	protected int contractHrs;
	protected String dept;
	

	

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
