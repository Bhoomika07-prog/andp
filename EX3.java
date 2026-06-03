package ExceptionHandling;
import java.util.Scanner;
public class EX3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		try {
			System.out.println(arr[6]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
