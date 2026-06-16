package Recursion;

public class Intro {

    public static void printNumb(int n){
    //  Stopping condition
        if(n == 0){
            return;
        }

        // printing and calling itself _------> recursion
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumb(n);

        
    }
}
