package Recursion;

public class Intro {

    public static void printNumb(int n){
    //  Stopping condition


    // if not used  ----------> leads to stck overflow 
        if(n == 0){
            return;
        }

        // printing and calling itself _------> recursion
        System.out.println(n);
        printNumb(n-1);
    }


    //  second code

    public static void printNumb1(int n){
        if(n>10){
            return;
            
        }
        System.out.println(n);
        printNumb1(n+1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Dec.......");
        printNumb(n);
        System.out.println("Inc...");
        printNumb1(n);

        
    }
}
