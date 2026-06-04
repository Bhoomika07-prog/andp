package day4;
class Plane   //parent class
{
    void takeoff()
    {
        System.out.println("Plane is taking off");
    }

    void fly()
    {
        System.out.println("Plane is flying");
    }

    void land()
    {
        System.out.println("Plane is landing");
    }
}

class Cargoplane extends Plane   //child class
{
    void fly()
    {
        System.out.println("Cargoplane is flying at low height");
    }

    void carryCargo()
    {
        System.out.println("Cargoplane carries cargo");
    }
}

class PassengerPlane extends Plane   //child class
{
    void fly()
    {
        System.out.println("PassengerPlane is flying at medium height");
    }

    void carryPassengers()
    {
        System.out.println("PassengerPlane carries passengers");
    }
}

class FighterPlane extends Plane   //child class
{
    void fly()
    {
        System.out.println("FighterPlane is flying at great height");
    }

    void carryWeapons()
    {
        System.out.println("FighterPlane is carrying weapons");
    }
}

public class Polymorphism {

	public static void main(String[] args) {
		Cargoplane cp=new Cargoplane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Plane ref; //parent type refernce
		
		ref=cp; // assigning child type ref to parent type
		ref.fly();
		ref.takeoff();
		ref.land(); 
		
		ref=pp; 
		ref.fly(); //same reference and same behaviour
		ref.takeoff();
		ref.land(); 
		
		ref=fp; 
		ref.fly(); //same reference and same behaviour
		ref.takeoff();
		ref.land(); 
		
		
		
	}

}
