package day4;
import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age[]=new int[5];
		for(int i=0;i<age.length;i++) {
			System.out.println("Enter age of student "+i);
			age[i]=sc.nextInt();
		}
		System.out.println("The student ages are:");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}

	}

}
