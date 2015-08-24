import java.util.Scanner;

class Division {
	public static void main(String[] args) throws IllegalArgumentException {

		int a, b, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
		try {
			a = input.nextInt();
			b = input.nextInt();
			if (b == 0) {
				throw new IllegalArgumentException();
			}
			result = a / b;
			System.out.println("Result = " + result);
		} catch (IllegalArgumentException e) {
			System.out.println("Please enter a valid integer for as a divisor");
		}finally {
		      System.out.println("Division in put of integers continued. Input two integers: ");
		      a = input.nextInt();
		      b = input.nextInt();
		      try{
		    	  result = a / b;
		      }catch(ArithmeticException e){
		    	  System.out.println("cannot divide: " + e.getMessage());
		      }
		   
		}
		input.close();
	}
}