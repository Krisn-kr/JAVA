package Function_AND_METHODS;

// import java.util.*;

import java.util.*;

public class Function {
    public static void printMyName(String name){
        return ;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NAme : ");
        String name = sc.nextLine();
        printMyName(name); // calling the d\function
        sc.close();
        
    }
    
}
