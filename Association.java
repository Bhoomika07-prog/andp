package day4;

class OS
{
    private String name;
    private int size;

    OS(String name, int size)   // constructor
    {
        this.name = name;
        this.size = size;
    }

    String getName()   // getter method
    {
        return name;
    }

    int getSize()
    {
        return size;
    }
}

class Charger
{
    private String brand;
    private int voltage;

    Charger(String brand, int voltage)
    {
        this.brand = brand;
        this.voltage = voltage;
    }

    String getBrand()
    {
        return brand;
    }

    int getVoltage()
    {
        return voltage;
    }
}

class Mobile
{
    OS os = new OS("Android", 512);

    void m1(Charger c)
    {
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}



public class Association {

	public static void main(String[] args) {
		Charger c = new Charger("Apple", 5);

        Mobile m = new Mobile();

        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        m.hasA(c);
        m=null;

        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
		

	}

}
