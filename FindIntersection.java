package week1.day2;

public class FindIntersection {

		
	public static void main(String[] args) {
		int [] a = {3,2,11,4,6,7};
		int [] b = {1,2,8,4,9,7};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int p=0;p<b.length;p++) {
				
				if (a[i]==b[p]) {
					System.out.println(a[i]);
				}
			}
		}
		
	}



}

