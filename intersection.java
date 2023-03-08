package week3day1;

public class intersection {

	 public static void main(String[] args) {
			
		 int[] marks1 = {30,80,11,44,46,77};	 
		int[]  marks2=  {100,90,80,44,92,77};
		 
		for (int i = 0; i < marks1.length; i++) {
			for (int j = 0; j < marks2.length; j++) {
				if(marks1[i]==marks2[j]) {
					System.out.println(marks1[i]);
				}
			}
		}
	}
	}
