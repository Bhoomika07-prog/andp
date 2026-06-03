package labs;
import java.util.Arrays;
import java.util.Scanner;
public class TrianglChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");            
            if (a == b && b == c) {
                System.out.println("Type: Equilateral");
            } 
            else if (a == b || b == c || a == c) {
                System.out.println("Type: Isosceles");
            } 
            else {
                System.out.println("Type: Scalene");
            }          
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            int x = sides[0];
            int y = sides[1];
            int z = sides[2];

            if ((x * x) + (y * y) == (z * z)) {
                System.out.println("It is a Right Triangle");
            } else {
                System.out.println("It is NOT a Right Triangle");
            }

        } else {
            System.out.println("Invalid Triangle");
        }

	}

}
