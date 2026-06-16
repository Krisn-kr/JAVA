package Problems;

import java.util.Scanner;

public class Adult {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age  : ");
        int age = sc.nextInt();
        if(age >= 90){
            System.out.println("You are too older .");

        }else if(age >= 18){
            System.out.print("Congratulation ! ");
        } else{
            System.out.print("You are not anaugh older to vode .");
        }
        sc.close();
    }
    
}

