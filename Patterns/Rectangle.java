package Patterns;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = sc.nextInt();



        // REctangular Pattern    fig =01
        System.out.println("\nFigure - 01");
        for(int i = 0; i< n ; i++){
            for(int j = 0 ; j< n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }





        // Hollow Rectangle 
        // fig = 02

        // outer loop
        System.out.println("\nFigure - 02");
        for(int i = 1; i<=n; i++ ){
            // inner loop
            for(int j =1; j<=n ; j++){

                // cell -> ( i,j )
                if(i== 1 || j== 1 || i == n || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }


            }
            System.out.print("\n");
        }


        // Right_angled trangle
        System.out.println("\nFigure - 03");
        for(int i =0; i< n; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }


        // Up-side

        System.out.println("\nFigure - 04");
        for(int i =0 ; i< n ; i++){
            for(int j = n-i ; j>0; j-- ){ // for(int j = n ; j>i; j-- )
                System.out.print("* ");

            }
            System.out.println("\n");
        }


             // fig = 05

        // R H S  - right- angled triangle.                       fig = 05
        

        System.out.println("\nFigure - 05");
        for(int i = 0; i< n ; i++){
            // spaces 
            for(int j  = 0; j<=n-(i+1); j++){
                System.out.print(" ");
            }
            // stars

            for(int j = 0 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println("\n");


        }

        // fig = 06

        // left side (Right angled triangle) of nuber

        System.out.println("Figure - 06");
        for(int i = 0; i<n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println("\n");
        }


                // fig = 07

        // left side (Right angled triangle) of nuber

        System.out.println("Figure - 07");
        for(int i = 0; i<n; i++){
            for(int j = 0; j <n-i; j++){
                System.out.print((j+1)+(" "));
            }
            System.out.println("\n");
        }



                // fig = 08

        // left side (Right angled triangle) of nuber

        System.out.println("Figure - 08");
        int k = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println("\n");
        }


                // fig = 09

        // left side (Right angled triangle) of nuber

        System.out.println("Figure - 09");
        for(int i = 0; i<n; i++){
            for(int j = 0; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println("\n");
        }







        sc.close();
    }






    
}
