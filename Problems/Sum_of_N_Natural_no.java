package Problems;
import java.util.Scanner;

public class Sum_of_N_Natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int i=1, sum1 = 0;
        // while loop
        while(i <=n){
            sum1 +=i;
            i++;
        }
        System.out.println("Sum (while) : "+sum1);

        // for
        int sum2 = 0;
        for(i = 1; i<=n ; i++){
            sum2 +=i;
        }

        System.out.println("Sum (for) "+sum2);


        sc.close();
        
    }
}
