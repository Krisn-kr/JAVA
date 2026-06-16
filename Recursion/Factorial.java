package Recursion;

public class Factorial {

    public static int Fact(int n, int fact) {
        // Base case: Stop when n drops to 1, and return our final total
        if (n <= 1) {
            return fact;
        }

        // 1. Move down to the next number: (n - 1)
        // 2. Multiply the current number into the total: (fact * n)
        return Fact(n - 1, fact * n); 
    }
//  other way ----------- 
    public static int factorial(int n){
        if( n ==1 || n == 0){
            return 1;
        }

        int fact_nm1 = factorial(n-1);
        int fact_n = n * fact_nm1;


        return fact_n;
    }

    public static void main(String[] args) {
        System.out.println(Fact(5, 1)); // Outputs: 120

        int n = 5;

        int ans = factorial(n);
        System.out.println(ans);
    }
}