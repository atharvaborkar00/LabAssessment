//Since these files share the same package, they are packaged together in the same file directory
package Task2.PackageAndInterface;

public class AllSeasonFruits implements Fruit{
    public void Mango(){
        System.out.println("Mangoes are not available in all seasons, only in summers 😄");
    }

    public int Apple(int boxes, int boxCapacity){
        int apples = boxes*boxCapacity;
        return apples;
    }

    public float Orange(float boxes) {
        float oranges = boxes*(6);
        return oranges;
    }
}
