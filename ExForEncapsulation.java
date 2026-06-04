package day4;
class Car{
	private String name;
	private int mileage;
	private int cost;
	
	public void setData(String x,int y,int z) {
		name=x;
		mileage=y;
		cost=z;
		
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
public class ExForEncapsulation {

	public static void main(String[] args) {
		Car c= new Car();
		c.setData("Maruti",200,25000);
		

	}

}
