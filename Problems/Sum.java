package Problems;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int a = sc.nextInt();

        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.print("The sum : "+sum);

        sc.close();
        
    }


    
}
