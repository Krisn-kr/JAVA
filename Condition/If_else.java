package Condition;
import java.util.Scanner;
public class If_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();

        // if - else conditon

        if(num1 == num2){
            System.out.println("Equal");
        } else if(num1 > num2){
            System.out.println("First number is greater then the Second one by "+(num1 - num2));

        } else{
            System.out.println("Second number is greater then the First one by "+(num2 - num1));
            
        }



        sc.close();

        


    }
    
}
