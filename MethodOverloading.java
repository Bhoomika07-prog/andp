package day4;

public class MethodOverloading {
	//area of square
	int area(int n1,int n2) {
		return n1*n2;
	}
	float area(int n1,float n2) {
		return n1*n2;
	}
	double area(double n1,double n2) {
		return n1*n2;
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.area(10,10));
		System.out.println(mo.area(12,12f));
		System.out.println(mo.area(12.5,12.5));
		

	}

}
