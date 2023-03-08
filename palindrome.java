package week3day1;

public class palindrome {

		public static void main(String[] args) {
			
			String name="malayalam";
			
			//int palin = name.length();
			//System.out.println(palin);
			
			char[] character= name.toCharArray();
			
			for(int i=character.length-1;i>=0;i--){
				System.out.println(character[i]);
			}
		
		
		}

	}
		
	