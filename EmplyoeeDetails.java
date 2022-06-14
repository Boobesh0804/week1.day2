package week1.day2;

public class EmplyoeeDetails {
	
	public String printEmplyoeeName() {
		
		String empname ="Boobesh vijayakumar";
		return empname;
	}

	public int printEmplyoeeId() {
		int empid =45879;
		return empid;
		
	}
	public String getEmplyoeeAddress() {
		
		String add ="Chennai";
		return add;
	}
	
	public double printEmplyoeeSalary() {
		double  saly =1458788.25;
		return saly;
	}

	public long printEmplyoeeMobileNumber() {
		
		long phnnum = 80568785412l;
		return phnnum;
	}
	public static void main(String[] args) {
		EmplyoeeDetails emp =new EmplyoeeDetails();
		   
		System.out.println(emp.printEmplyoeeName()+" & "+ emp.printEmplyoeeId());
		System.out.println(emp.getEmplyoeeAddress());
		System.out.println(emp.printEmplyoeeSalary());
		System.out.println(emp.printEmplyoeeMobileNumber());
	}


}

