package ExceptionHandling;

class Example{
	static void dis() throws Exception{
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}
public class EX5 {

	public static void main(String[] args) {
		Example ex=new Example();
		try {
			ex.dis();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
