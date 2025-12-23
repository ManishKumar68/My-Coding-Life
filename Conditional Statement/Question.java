import java.util.*;
public class Question  {
    public static void main(String[] args) {
/*1 - Print the largest of 2 numbers
        int a = 1 ;
        int b = 2;
        if (a > b) {
            System.out.println("a is largest number of b" + a);
        } else {
            System.out.println("b is largest number of a " + b);
        }


 // 2 Print if a number is Odd or Even
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 2 == 0) {
        System.out.println("The number is a Even number " + number);
        } else {
        System.out.println("The number is a odd number :" + number);

        }*/


//    print the largest of 3
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A >= B && B >= C){
            System.out.println("lergest is A");
        } else if (B >= C){
            System.out.println("largest is B ");
        } else {
        System.out.println("largest is C ");
        }

    }
}