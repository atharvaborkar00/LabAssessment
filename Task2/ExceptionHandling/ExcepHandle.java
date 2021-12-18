//Exception Handling Implementation

package Task2.ExceptionHandling;

import java.util.Scanner;

public class ExcepHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dividend = new int[5];
        int[] divisor = new int[5];
        int[] quotient = new int[5];

        for(int i=0; i<5; i++){
            try {
                dividend[i] = sc.nextInt();
                divisor[i] = sc.nextInt();
                quotient[i] = dividend[i]/divisor[i];
            } catch (ArithmeticException e) {
                System.out.print(e);
            }
        }
        for(int i=0; i<5; i++){
            System.out.print(quotient[i] + " ");
        }
        sc.close();
    }
}

//INPUT AND OUTPUT OF THE ABOVE CODE
/* 2 0
java.lang.ArithmeticException: / by zero
4 2
777 111
45 0
java.lang.ArithmeticException: / by zero
90 30
0 2 7 0 3  */