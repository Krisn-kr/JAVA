package Condition;
import java.util.Scanner;
public class Break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();


    //   Introducing the Switch statemnet (Condition)
        switch(n){
            case 1 : System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3 : System.out.println("Threee"); break;
            case 4 : System.out.println("Four"); break;
            case 5 : System.out.println("Five"); break;

            case 6 : System.out.println("Six"); break;

            // Default Output
            default : System.out.println("Invalid Input");
        }
     
        sc.close();
        
    }
}
