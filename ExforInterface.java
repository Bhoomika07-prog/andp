package day4;
import java.util.Scanner;
interface Calculator{
	void add();
	void sub();
}
class MyCalci1 implements Calculator{
	public void add() {
		int a =20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a =20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	
}
class MyCalci2 implements Calculator{
	public void add() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first no:");
		int a=s.nextInt();
		System.out.println("Enter second no:");
		int b=s.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first no:");
		int a=s.nextInt();
		System.out.println("Enter second no:");
		int b=s.nextInt();
		int c=a-b;
		System.out.println(c);
	}
	
}

public class ExforInterface {

	public static void main(String[] args) {
		MyCalci1 c1=new MyCalci1();
		MyCalci2  c2=new MyCalci2();
		c1.add();
		c1.sub();
		c2.add();
		c2.sub();
		
		
	}

}
