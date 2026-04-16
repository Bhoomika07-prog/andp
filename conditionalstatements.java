package day4;

public class conditionalstatements {

	public static void main(String[] args) {
		int marks=79;
		if(marks<0 && marks>100) {
			System.out.println("Invalid marks");
		}
		else if(marks>=81 && marks<=100){
			System.out.println("Distinction");
		}
		else if(marks>=60 && marks<=80){
			System.out.println("First cls");
		}
		else if(marks>=35 && marks<=59){
			System.out.println("Second class");
		}
		else {
			System.out.println("Fail");
		}
	}

}
