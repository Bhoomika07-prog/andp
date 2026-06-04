package day4;
import java.util.Scanner;
public class TwoDimArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age[][]=new int[2][5];
		for(int i=0;i<age.length;i++) {
			for(int j=0;j<=age[i].length;j++) {
				System.out.println("Enter the age of student " +j+);
			}
		}

	}

}
