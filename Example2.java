package day4;
class Student{
	//instance var
	private String name;
	private int age;
	
	//setter
	public void setData(String name,int age) { //local var
		this.name=name;
		this.age=age;
				
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}


public class Example2 {

	public static void main(String[] args) {
		Student s=new Student();
		s.setData("XYZ",20);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
	}

}
