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


public class Inheritance {

	public static void main(String[] args) {
		Cargoplane cp = new Cargoplane();

        cp.takeoff();      //Inherited method
        cp.fly();          //Overridden method
        cp.land();         //Inherited method
        cp.carryCargo();   //Specialized method

        PassengerPlane pp = new PassengerPlane();

        pp.takeoff();
        pp.fly();
        pp.land();
        pp.carryPassengers();

        FighterPlane fp = new FighterPlane();

        fp.takeoff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
    

	}

}
