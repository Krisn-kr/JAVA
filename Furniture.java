import java.util.Scanner;

class FurnitureItem {
    String furniture;
    String type;
    String color;
    char grade;
    int price;

    FurnitureItem(String f, String t, String c, char g, int p) {
        furniture = f;
        type = t;
        color = c;
        grade = g;
        price = p;
    }

    void display() {
        System.out.println("\nFurniture : " + furniture);
        System.out.println("Type      : " + type);
        System.out.println("Color     : " + color);
        System.out.println("Grade     : " + grade);
        System.out.println("Price     : " + price);
    }
}

public class Furniture {

    static void itemDisplay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Furniture: ");
        String f = sc.nextLine();

        System.out.print("Choose (Indoor/Outdoor): ");
        String t = sc.nextLine();

        System.out.print("Choose color (Red/Green/Blue): ");
        String c = sc.nextLine();

        System.out.print("Select grade (A/B/C): ");
        char g = sc.nextLine().charAt(0);

        System.out.print("Enter the price: ");
        int p = Integer.parseInt(sc.nextLine());

        FurnitureItem item = new FurnitureItem(f, t, c, g, p);
        item.display();

        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("Hey! This is Krishna Kumar\n");
        itemDisplay();
    }
}
