package day4;

public class pat2 {

	public static void main(String[] args) {
		int n=3,space=n-1,star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
			
		}

	}

}
