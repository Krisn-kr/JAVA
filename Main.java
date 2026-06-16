import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.print("Enter the operation : ");
        char c = sc.next().charAt(0);

        System.out.print("Enter b number : ");
        int b = sc.nextInt();

        int ans;

        if(c == '+'){
            ans = a + b;

        } else if(c == '-'){
            ans = a - b;

        } else if(c == '*'){
            ans = a * b;

        } else if(c == '/'){
            if(b == 0){
                System.out.println("Cannot divide by zero");
                sc.close();
                return;
            }
            ans = a / b;

        } else if(c == '%'){
            ans = a % b;

        } else {
            System.out.println("Invalid operation!");
            sc.close();
            return;
        }

        sc.close();
        System.out.println("Answer = " + ans);
    }
}