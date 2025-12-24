// 1 - Print the largest of 2 numbers
import java.util.*;
public class Question  {
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2;
        if (a > b) {
            System.out.println("a is largest number of b" + a);
        } else {
            System.out.println("b is largest number of a " + b);
        }
    }
}


 // 2 Print if a number is Odd or Even
import java.util.*;
public class Question  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 2 == 0) {
        System.out.println("The number is a Even number " + number);
        } else {
        System.out.println("The number is a odd number :" + number);
        }
    }
}


//    print the largest of 3
import java.util.*;
public class Question  {
    public static void main(String[] args) {
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

// Question 4 :Write a Java program toget a number from the user and print whether it is positive or negative.
import java.util.*;
public class Question  {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int Whether = sc.nextInt();
        if (Whether > 0) {
            System.out.println("Your number is positive");
        } else if (Whether < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is zero");
        }
    }
}

// Question 5:Finish the following code so that it prints “You have a fever” if your temperature is above 100 and otherwise prints “You don’t have a fever.
import java.util.*;
public class Question  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Temperature");
        double temperature = sc.nextDouble();

        if (temperature > 100) {
            System.out.println("you have a high fever.");
            System.out.println("you go fast contacts Doctor's.");
        } else if (temperature >= 95 && temperature <= 98) {
            System.out.println("you have a low fever, tack the paracetamol Capsule");

        } else {
            System.out.println("you don't have fever");
        }
    }
}

//  Question 6 : This is a clean, exam-ready Java program using switch case to print the day name based on week number (1–7).
import java.util.*;
public class Question  {
    public static void main(String[] args) {
        System.out.println("Enter the Week number(1 - 7)");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}*/

//Question 7 :What will be the value of x & y in the following program. import java.util.*;
public class Question  {
    public static void main(String[] args) {      
Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean x = (a <= b) ? true : false;
        System.out.println(x ? "YES" : "NO");
        boolean y = (a >= b) ? true : false;
        System.out.println(y ? "YES" : "NO");
        sc.close();
    }
}


//  Question 8 :Write a Java program that takes a year from the user and prints whether that year is a leap year or not.
import java.util.*;
public class Question  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input , Year:");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if ((x && y) || z) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
