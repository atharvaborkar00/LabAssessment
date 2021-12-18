package Task2.Inheritance;
//Single Inheritance
class Vehicles{
    void VehicleProperties(){System.out.println("You can now go from point A to point B!");}
}

class Bikes extends Vehicles{
    void BikeProperty(){System.out.println("You can transport upto 2 people from point A to point B!");}
}
public class TestInheritance1 {
    public static void main(String[] args) {
        Bikes b = new Bikes();
        b.VehicleProperties();
        b.BikeProperty();
    }
}
//Output
//You can now go from point A to point B!
//You can transport upto 2 people from point A to point B!