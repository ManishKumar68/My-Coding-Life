import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int Number_1= sc.nextInt();
        System.out.println("Enter the second number");
        int Number_2 = sc.nextInt();
        System.out.println("operator");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+' : System.out.println(Number_1+Number_2);
                        break;
            case '-' : System.out.println(Number_1-Number_2);
                        break;
             case '*' : System.out.println(Number_1*Number_2);
                        break;
            case '/' : System.out.println(Number_1/Number_2); break;
            case '%' : System.out.println(Number_1%Number_2); break;
            default : System.out.println("Invalid operator");
        }
    }
}