package week1.day2;

import java.lang.reflect.Array;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		
		int[] i= {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int A = i.length;
	//	Array.sort(i);
		
		
		
		for (int o =0; o<A;o++) {
		
			if (o!=	i[A-1])
			{
				System.out.println(i[o]);
			}

		 }


		  
	}
	
	

}
