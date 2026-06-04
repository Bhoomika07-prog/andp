package day4;
class Car1{
	private String name;
	private int mileage;
	private int cost;
	
	//constructor
	public Car1(String name,int mileage,int cost) {
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
	}
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	public int getCost() {
		return cost;
	}
	
	
}

public class ExWithConstructor {

	public static void main(String[] args) {
		Car1 c1=new Car1("BMW",70,600000);
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());
		
		
	}

}
