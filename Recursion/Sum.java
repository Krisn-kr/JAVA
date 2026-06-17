package Recursion;

public class Sum {

    public static void printSum(int i, int n , int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            
            return;
        }

        sum+=i;
        System.out.println(i);

        printSum(i+1,n,sum);



        // System.out.println(sum);
        // printSum(n);
    }
   public static void main(String[] arg){
    System.out.println("Sum of N number : ");
    printSum(1,5,0);
    

   }    
}
