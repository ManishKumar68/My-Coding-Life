import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a) {
            case 1: System.out.println("Samosa"); break;
            case 2: System.out.println("Burger"); break;
            case 3: System.out.println("Apple"); break;
            default : System.out.println("We wake up");
        }
    }
}