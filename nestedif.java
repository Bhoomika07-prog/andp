package day4;

public class nestedif {

	public static void main(String[] args) {
		String userid="abcd";
		int password=123;
		if(userid=="abcd") {
			if(password==123) {
				System.out.println("Login successfull");
			}
			else {
				System.out.println("Login Unsuccessful");
			}
		}
		else {
			System.out.println("Invalis userid");
		}
		

	}

}
