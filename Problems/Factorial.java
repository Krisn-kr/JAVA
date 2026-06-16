package Problems;
import java.util.*;
public class Factorial {
    public static int fact(int n){
        int ans =1;
        if(n<0){
            System.out.println("Invalid");
            return 0;    
            
    }else{
        while(n!=0){
            ans *=n;
            n--;
            
        }
        return ans;
        
    }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.println("Factorial : "+fact(n));
        sc.close();


        

        
    }
    
}
