package Recursion;

import java.util.Scanner;

public class Fibonacci {
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
        sc.close();
        
    }
}
