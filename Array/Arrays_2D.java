package Array;
import java.util.*;

public class Arrays_2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int row = sc.nextInt();
        System.out.print("column : ");
        int col = sc.nextInt();


        System.out.print("Enter the elements of the array : ");

        int arr[][]= new int[row][col];
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing 

        

        
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        // =============
        //  searching the target element
        // ===============

        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
             if(target == arr[i][j]){
                
                System.out.println("the Position of the target element is : "+i+","+j);

             }
            }
            
        }


        
        sc.close();
        
    }
    
}
