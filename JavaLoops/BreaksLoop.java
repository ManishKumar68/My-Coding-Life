import java.util.*;
public class BreaksLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object created
        do {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}

