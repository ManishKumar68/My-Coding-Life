import java.util.*;
class TernaryOperator {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();

        String numbers = ((number % 2) == 0)? "Even" : "odd";
        System.out.println(numbers);*/

//        Check iF a Student will Pass or Fail.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        String Result = (marks >= 33)? "Pass" :"Fail";
        System.out.println("your Report Card :" + Result);
    }
}