package Recursion;

import java.util.Scanner;

public class Fibonacci {

    // Calculate power 
    //  height of stack is n 

    public static int calPower(int x, int n){
        if(n ==0 ){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xPownm1 = calPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    
    // Stack height is log n
    public static int calculatingPower(int x , int n){
        // Base
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n %2 == 0){// even power ke liye
            return calculatingPower(x, n/2) *calculatingPower(x, n/2);

        }
        else{ // odd power
            return calculatingPower(x, n/2) * calculatingPower(x, n/2) * x;

        }

    }

    
    public static void Fibo(int a , int b , int n){
        if(n == 0){
        return;
        }
        int c = a+b;
        System.out.print(" "+c);
        Fibo(b, c, n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print(a + " "+b);
        Fibo(a, b, n-2); // passing n-2 becaouse the previous two terms are already printed


        //  Calling the power call
        System.out.print("\nEnter the base and the power for calculating the base ^ power : ");
        System.out.println("\nBase  : ");
        int base = sc.nextInt();
        System.out.println("\nPower : ");
        int pow = sc.nextInt();

        // Calling the method
        System.out.println(calPower(base, pow));

        // Spolution in (( n log n ))
        System.out.println(calculatingPower(pow, n));
        sc.close();
        
    }
}
