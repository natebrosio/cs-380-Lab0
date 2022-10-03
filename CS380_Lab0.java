package packagetest;

public class CS380_Lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Lab CS380");
		
		//Exercise 1
		
		int num = 12345; // given number
		int result = 0;  // reversed number 
		
		/*while loop to reverse the given number
		 * create a temp variable to store num mod 10, which is the last digit
		 * multiply by 10 and add the temp variable 
		 * divide the orignal number by 10
		 */
		while(num != 0) {  		
			int temp = num%10;
			result = result*10 + temp;
			num /= 10;
		}
		
		System.out.println("The reversed number is " + result);
		
		
	}

}

