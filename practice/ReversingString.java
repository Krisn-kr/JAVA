package practice;
import java.util.*;

public class ReversingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i =0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() -1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            System.out.println(sb);

        }

        System.out.println("Fiinal result : "+sb);
        sc.close();
        
    }
    
}
