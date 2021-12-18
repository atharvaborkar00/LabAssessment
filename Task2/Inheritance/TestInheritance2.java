package Task2.Inheritance;
//Multilevel inheritance implementation

class Vehicles{
    void VehicleProperties(){System.out.println("You can now go from point A to point B!");}
}

class Cars extends Vehicles{
    void CarProperties(){System.out.println("You can transport upto 5 people and some luggage as well!");}
}

class ElectricCars extends Cars{
    void ElectricCarProperties(){System.out.println("5 People + Luggage + No pollution! Hooray!");}
}
public class TestInheritance2 {
    public static void main(String[] args) {
        Cars c = new Cars();
        ElectricCars ec = new ElectricCars();
        c.VehicleProperties();
        c.CarProperties();
        System.out.println("");
        ec.VehicleProperties();
        ec.CarProperties();
        ec.ElectricCarProperties();
    }
}
//You can now go from point A to point B!
//You can transport upto 5 people and some luggage as well!

//You can now go from point A to point B!
//You can transport upto 5 people and some luggage as well!
//5 People + Luggage + No pollution! Hooray!