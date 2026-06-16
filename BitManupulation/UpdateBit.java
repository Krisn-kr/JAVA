package BitManupulation;

import java.util.*;
public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation : (1- set/ 2 - clear )");
        int oper = sc.nextInt();
        // oper = 1 : set 
        // oper = 0 : clear

        int n = 5; //0101
        int pos = 1; // 2nd pos.  (0111)
        int bitMask = 1<<pos;
       if(oper == 1){
        // set 
        
        int newNumber = bitMask | n;
        System.out.println(newNumber);
       } else{
        // Clear
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);

       }
        
    }
}
