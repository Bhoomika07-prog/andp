package ExceptionHandling;

class InvalidPasswordException extends Exception{
	
}

public class CustomException {

	public static void main(String[] args) throws InvalidPasswordException {
		String id="admin";
		int password=123456;
		if(id.equals("admin")) {
			if(password==123456) {
				System.out.println("Login Successfull");
			}
			else {
				try {
				InvalidPasswordException i= new InvalidPasswordException();
				throw i;
				}
				catch(InvalidPasswordException e) {
					System.out.println("Invalid password");
				}
				
			}
		}

	}

}
