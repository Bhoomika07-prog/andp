package day4;

public class ExForMeth {
	//with parameter and with return
	int add(int a,int b) {
		return a+b;
	}
	
	//with parameter and no return
	void subtract(int a,int b) {
		System.out.println("Subtract:"+(a-b));
	}
	
	//without parameter and return type
	void multiply() {
		int a=5,b=10;
		int res=a*b;
		System.out.println(res);
	}
	
	//without parameter and with return type
	int div() {
		int n1=100,n2=10;
		return n1/n2;
	}
	
	public static void main(String[] args) {
		ExForMeth e=new ExForMeth();
		System.out.println(e.add(50,20));
		e.subtract(100, 50);
		e.multiply();
		System.out.println(e.div());
		}
}

