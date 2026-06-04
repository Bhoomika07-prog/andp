package day4;
class Car1{
	private String name;
	private int mileage;
	private int cost;
	
	public Car1() {
		name="BMW";
		mileage=20;
		cost=60000;
	}
	//parameterized constructor
	public Car1(String name,int mileage,int cost) {
		Car1();
		/*this.name=name;
		this.mileage=mileage;
		this.cost=cost; */
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

public class LocalChaining {

	public static void main(String[] args) {
		Car1 c1=new Car1("Ferrari",5,200000);
		System.out.println(c1.getName());	
		System.out.println(c1.getMileage());	
		System.out.println(c1.getCost());	
	}

}
