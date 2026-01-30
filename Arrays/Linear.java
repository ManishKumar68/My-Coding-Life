import java.util.Scanner;

public class Linear {

    // Integer Linear Search
    public static int LinearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // String Linear Search
    public static int FoodMenu(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"dosa", "chole bhatura", "samosa"};

        Scanner sc = new Scanner(System.in);

        // Integer search
        System.out.print("Enter number to search: ");
        int numKey = sc.nextInt();
        int numIndex = LinearSearch(number, numKey);

        if (numIndex == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index: " + numIndex);
        }

        // String search
        sc.nextLine(); // clear buffer
        System.out.print("Enter food name to search: ");
        String foodKey = sc.nextLine();

        int foodIndex = FoodMenu(menu, foodKey);

        if (foodIndex == -1) {
            System.out.println("Food not found");
        } else {
            System.out.println("Food found at index: " + foodIndex);
        }

        sc.close();
    }
}
