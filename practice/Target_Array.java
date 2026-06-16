package practice;
import java.util.*;

public class Target_Array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enyter the elemnts of the array : ");
        for(int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }

        // ============
        //     target element

        
        System.out.print("Enter the targeted elemenet : ");
        int target = sc.nextInt();
        for(int i =0 ; i<arr.length; i++){
            if(target == arr[i]){
                target = i;

            }
            
        }

        System.out.println("Position : "+target);

        System.out.println("Size of the array : "+arr.length);


        sc.close();
    }
    
}
