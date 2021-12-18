package Task2.Inheritance;
//Hierarchical Inheritance Implementation

class Vehicles{
    void VehicleProperties(){System.out.println("You can now go from point A to point B!");}
}

class Bikes extends Vehicles{
    void BikeProperty(){System.out.println("You can transport upto 2 people from point A to point B!");}
}

class Cars extends Vehicles{
    void CarProperties(){System.out.println("You can transport upto 5 people and some luggage as well!");}
}
public class TestInheritance3 {
    public static void main(String[] args) {
        Bikes b = new Bikes();
        b.VehicleProperties();
        b.BikeProperty();
        //b.CarProperties(); //THIS LINE WILL NOT COMPILE SINCE CARS AND BIKES BOTH INHERIT FROM VEHICLES AND NOT FROM EACH OTHER.
    }
}
//You can now go from point A to point B!
//You can transport upto 2 people from point A to point B!