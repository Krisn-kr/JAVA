package Patterns;
import java.util.Scanner;

public class AdvancePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // pattern  - 01

        // UPPER PART
        System.out.println("\n===Figure - 01===");
        for(int i =0; i<n ; i++){
            // upper left-stars

            for(int j=0 ; j<=i; j++){
                System.out.print("* ");
            }
            

            // Spaces
            for(int j = 0;  j< (2*n) - 2*(i+1) ; j++){
                System.out.print("  ");

            }

            // top-right stars
            for(int j=0 ; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println("\n");
        }


        // LOWER PART


        for(int i =0; i<n ; i++){
            // bottom left-stars

            for(int j=0 ; j<n-i; j++){
                System.out.print("* ");
            }
            

            // Spaces
            if(i != 0){
                for(int j = 0;  j< 2*(i+1)-2 ; j++){
                System.out.print("  ");

            }
            }
            

            // top-right stars
            for(int j=0 ; j<n-i; j++){
                System.out.print("* ");
            }

            System.out.println("\n");
        }
  
        // pattern- 02 
        
        // Solid Rhombud. 
        System.out.println("\nPattern - 02 ");
        for(int i = 0; i< n; i++){


            // Spacaes
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }


            // Stars
            for(int j= 0; j<n; j++){

                System.out.print("* ");
            }
            System.out.println("\n");
        }

        // pattermn    03
        System.out.println("\nPattern = 03");
        for(int i =0; i<n; i++){
            // spaces
            for(int j =0; j<n-i; j++){
                System.out.print("  ");
            }
            // number
            for(int j = 0; j<= i; j++){
                System.out.print((i+1)+"   ");
            }
            System.out.println("\n");
        }
    
        // Pattern = 04
        System.out.println("\nPattern -  04");
        for(int i = 0;i< n;  i++){
            // spaces
            for(int j = 0  ; j< n-1-i ; j++){
                System.out.print("  ");
            }

            // First  part
            for(int j =0 ; j<=i ; j++){
                System.out.print((1+j)+" ");
            }
            // Second part
            for(int j = i; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println("\n");

        }


        // Pattern = 05
        System.out.println("\nPattern -  05");
        for(int i = 0;i< n;  i++){
            // spaces
            for(int j = 0  ; j< n-1-i ; j++){
                System.out.print("  ");
            }

            // First  part
            for(int j =i+1 ; j>0 ; j--){
                System.out.print((j)+" ");
            }
            // Second part
            for(int j = i+1; j>1; j--){
                System.out.print(j+" ");
            }
            System.out.println("\n");

        }


        System.out.println("\nPattern - 06");

        for(int i =0; i<n; i++){
            for(int j= 0 ; j< n; j++){
                if(i == 0||j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }

        

    sc.close();
        
        
    }

}
