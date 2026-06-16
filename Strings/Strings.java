package Strings;

import java.util.*;
public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // User input
        // String name = sc.nextLine();
        // System.out.println("Your name  is : "+name);
        // System.out.println(name.length());


        // =====================
        //      concatenation
        // =======================

        String firstName = "Tonny";
        String lastName = "Stark";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName +"\nLength of the string(name) : "+ fullName.length());


        // =======================
        //         charAt
        // ========================
        for(int i =0 ; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }



        // =========================
        //       comparing strings
        //        (  .compareTo  )
        // ===========================

        String name1 = "Krishna";
        String name2 = "Krishna";


        // 1 s1 > s2 : +ve value
        // 2 s1 = s2 : 0
        // 3 s1 < s2 : -ve value


        //  comparing the first character

        if(name1.compareTo(name2) ==0 ) {
            System.out.println("Strings are equal");

        } else{
            System.out.println("Strings are not equal ");
        }
        if(name1==name2 ) {
            System.out.println("Strings are equal");

        } else{
            System.out.println("Strings are not equal ");
        }


        // ===============================
        //  it fails               so -  (name1==name2 )  not used 
        // ================================


        if(new String("Krishna")== new String("Krishna") ) {
            System.out.println("Strings are equal");

        } else{
            System.out.println("Strings are not equal ");
        }




        sc.close();
        
    }
}