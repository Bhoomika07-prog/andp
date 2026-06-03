package ExceptionHandling;

public class Ex1 {

	public static void main(String[] args) {
		int num1=30;
		int num2=0;
		//System.out.println(num1/num2);
		try {
			System.out.println(num1/num2);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}

	}

}
