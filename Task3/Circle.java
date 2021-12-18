package Task3;
import java.util.Scanner;
class AreaOfCircle{
    float r = 0.0f;
    float area = 0.0f;
    float perimeter = 0.0f;

    //function to take the user input for the radius
    public void readRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        r = sc.nextFloat();
        sc.close();
    }

    //function to calculate the perimeter of the circle
    public float Area(){
        area = (float)Math.PI * r * r;
        return area;
    }
    //function to calculate the area of the circle
    public float Perimeter(){
        perimeter = (float)Math.PI * 2 * r;
        return perimeter;
    }
}

public class Circle {
    public static void main(String[] args) {
        AreaOfCircle aOfCircle = new AreaOfCircle();

        aOfCircle.readRadius();
        System.out.println("Area of the circle is " + aOfCircle.Area());
        System.out.println("Perimeter of the circle is " + aOfCircle.Perimeter());
    }
}
//output
//Enter the Radius of the Circle: 50
//Area of the circle is 7853.982
//Perimeter of the circle is 314.15927