package Task2.Array;
import java.util.Scanner;

//Array Implementation
public class ArrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] name = new String[5];
        int[] marks = new int[5];
        for(int i=0; i<5; i++){
            name[i] = sc.next();
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.print(name[i]+": "+marks[i]+"\n");
        }
        
        sc.close();
    }
}
