package Task1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        //1.1 How to accept input from keyboard in java?
        
        //Using Scanner Class
        Scanner sc = new Scanner(System.in);
        String inputScan = sc.nextLine();
        System.out.println("Input taken using Scanner Class: " +inputScan);

        //Using Console class
        Console c = System.console();
        String inputConsole = c.readLine();
        System.out.println("Input taken using Console Class: " +inputConsole);

        //Using InputStreamReader and BufferedReader Class
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String inputIrBr = br.readLine();
        System.out.println("Input taken using InputStreamReader and BufferedReader Class: " +inputIrBr);
        
        br.close();
        ir.close();
        sc.close();
    }
    
}
