package day4;

public class assignmentop {

	public static void main(String[] args) {
		System.out.println("---------Assignment operators-----");
		int x=10;
		x+=5; //x=x+5
		System.out.println("Value of x:"+x);
		x-=3;
		System.out.println("Value of x:"+x);
		x/=2;
		System.out.println("Value of x:"+x);
		x*=3;
		System.out.println("Value of x:"+x);
		
		System.out.println("-----Relational operators------");	
		int a=10;
		int b=20;
		System.out.println(a<b); //T
		System.out.println(a<=5); //F
		System.out.println(b>a);//T
		System.out.println(b>50); //F
		System.out.println(a==b); //F
		System.out.println(a!=b); //T
		
		System.out.println("-----Logical operators-----");
		int p=1;
		int q=2;
		boolean res=p<q && p==1;
		System.out.println(res); //T
		System.out.println(p<=4 || q==10); //T
		System.out.println(!true); //F
		System.out.println(!false); //T
		
		System.out.println("----Unary operators----");
		int n=20;
		int m=n++ + n-- + ++n + n++ + n-- + ++n - --n;
		System.out.println(n);
		System.out.println(m);
		
		System.out.println("------Ternary operator----");
		int num1=200;
		int num2=300;
		int max=num1>num2?num1:num2;
		System.out.println("Maximum of num1 and num2:"+max);
		
	}

}
