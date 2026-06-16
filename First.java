import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your Date of Birth (DAY) :");
        int date =  sc.nextInt();
        System.out.print("Enter your birth month :");
        int month=sc.nextInt();
        System.out.print("Enter your birth year :");
        int year=sc.nextInt();
        System.out.println("You are of "+age);
        System.out.print("Your date of birth is : "+ date );
        System.out.print("/"+month);
        
        System.out.println("/"+year);

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a child.");
        }
        // after the age 
        if (age>=75){
            System.out.println("You aren,t eligible to vote anymore .");
        } else if(age >=50){
            System.out.println("Congratulation! You are still eligible to vote .");
        } else {
            System.out.println("Congratulation ! you are eligible to vote .");
        }

        sc.close();
    }
}
