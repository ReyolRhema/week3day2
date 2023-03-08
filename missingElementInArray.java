package week3day1;

public class missingElementInArray {
	public static void main(String[] args) {
		
				
				int[] value= {1,3,2,5,7,6,9,8};
				Arrays.sort(value);
				int sum1=0;
				for (int i = 1; i < 7; i++) {
					sum1=sum1+i;
					System.out.println(sum1);
					
					int sum2=0;
					for (int j = 0; j < value.length; j++) {
						sum2=sum2+value[i];
						System.out.println(sum2);
						int sum3=sum1-sum2;
						System.out.println("missing element" + sum3);
						
					}
					
					
				}
			}

		}

		
	}

}
