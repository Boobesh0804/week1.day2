package week1.day2;

public class TwoWheeler {
	 

	public int noOfWheel() {
		int numberofwheel =2;
		return numberofwheel;
	}
	
	public short noOfMirrors() {
		short numberofmirros =2;
		return numberofmirros;
	}
	
	public long chassisNumber() {
		long chassisnumber = 45844587811236472l;
		return chassisnumber;
	}
	
	public boolean isPunctured(){
		return false;
		
	}
	
	public String bikeName() {
		
		String name ="160ns";
		return name;
	}
	
	public double runningKM() {
		double km=45897.58;
		return km;
	}
	 public static void main(String[] args) {
		 
		 TwoWheeler bike= new TwoWheeler();
		
		 System.out.println(bike.noOfWheel());
		 System.out.println(bike.noOfMirrors());
		 System.out.println(bike.chassisNumber());
		 System.out.println(bike.isPunctured());
		 System.out.println(bike.bikeName());
		 System.out.println(bike.runningKM());
		 
	}
			
	
	}


