

import java.util.Arrays;
public class FindSecondLar {

	
		public static void main(String [] args) {
			int[] data = {3,2,11,4,6,7};
			
			Arrays.sort(data);
			
			//System.out.println(data[data.length-2]);
			System.out.println("The Second largest number in array is {3,2,11,4,6,7}: " +data[data.length-2]);
		
		}

	}