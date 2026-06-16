package Condition;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if( n == (n/2) * 2 ){
            System.out.println("Even");
  
        } else {
            System.out.println("Odd");
        }



        sc.close();    
    }
    
}
