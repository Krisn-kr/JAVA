package Array;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int[] marks = new int[3];
        
        // =================
        //   another way
        // ==================

        int num [] = {12, 13, 114};

        for(int i =0; i<3; i++){
            System.out.println(num[i]);
        }

        //==========================
        //  other way
        // ========================== 

        int marks[] = new int[3];


        marks[0] = 97; //chem
        marks[1] = 98; //phy
        marks[2] = 95; //maths
        
        for(int i =0; i<3; i++){
            System.out.println(marks[i]);
        }



        // user input array
        System.out.print("Enter the size of the array : ");


        int size = sc.nextInt();
        int numbers []= new int[size]; // aray declaration

        // uer input
        System.out.print("Enter the elenements of the array : ");
        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
            
        }
        // ================
        //  for printing the array
        // ====================
        for(int i =0; i<size; i++){
           System.out.println(numbers[i]);
            
        }


        sc.close();

    }


    

    
}
