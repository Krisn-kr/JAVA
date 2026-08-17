package Recursion;

import java.util.Scanner;

public class Tower0FHanaoi {
    public static void towerToHanoi(int n , String src, String helper , String des){
        
    if (n == 1) {
        System.out.println("Transfer disk " + n + " from " + src + " to " + des);
        return;
    }

        towerToHanoi(n-1, src, des, helper);
        System.out.println("transfer disk "+n+" froom "+src+" to "+ des);
        towerToHanoi(n-1, helper, src, des);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        towerToHanoi(n, "S", "H", "D");
        sc.close();
    }
    
}
