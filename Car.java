package week1.day2;

public class Car {
	
	// apply on break is false
	public boolean applyBreak() {
		return false;
	}
	
	// gear applyed 1st gear ready to go
	public int  applyGear() {
		int gear =1;			
		return gear;
	}
	// ac switch on
	public String switchOnAc() {
		String ac= "on";
		return ac;
	}
	// acclerate given to move on
	public String applyAcclerate() {
		String acclerate = "done";
		return acclerate;
		
	}
	
	public static void main(String[] args) {
		Car c= new Car();
		  System.out.println(c.applyBreak());
		  System.out.println(c.applyGear());
		  System.out.println(c.switchOnAc());
		  System.out.println(c.applyAcclerate());
		  
	}
}

