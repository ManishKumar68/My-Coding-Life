/* Question 1 :- Print numbers from 1 to 10.
public class Question {
    public static void main(String[] args) {
        int a = 1;
        while (a <=10) {
            System.out.println(" print the number : " + a);
            a++;
        }
    }
}*/

//Question @ :- Print number from 1 to n.
/*public class Question {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = Scanner.nextInt();
        int counter = 1;
        // while Loop
        while(counter <= num) {
            System.out.println("this number = " + counter);
            counter++;
        }
    }
}*/


// 3 Question - Print sum of First n  natural Number.
/*public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
//        while loop
        while(i <= n) {
            sum = sum + i;  // sum+= i;
            System.out.println("this is number : " +i);
            i++;
        }
        System.out.println("-----------");
        System.out.println(" Total number of n : " +sum);
    }
}*/


//Print SQUARE pattern
/*public class Question {
    public static void main(String[] args) {
//        for loops same worksss.
        for (int line = 1 ; line <= 4; line++) {
            System.out.println("* * * *");
        }
//        while Loop Same Work
        int i = 1;
        while (i <= 4){
            System.out.println("* * * *");
            i++;
        }
    }
}*/

// Question Print Reverse of a number.
/*public class Question {
    public static void main(String[] args) {
        for(int n = 108; n >= 1; n--) {
            System.out.println(n);
        }
    }
}*/


// Question - Print reverse of a number using loop.  (n = 10899)
/*public class Question {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;   
        }
        System.out.println(" n value is : " + n);
        }
    }*/

//    Question Reverse of a number using  loop ( n = 10899)
/*public class Question {
    public static void main(String[] args) {
        int n = 10899;
        int originalNumber = n;
        int reverse = 0;
        while (n > 0){
            // find the list digit 10899 % 10 = 9
            // 1089 % 10 = 9
            // 108 % 10 = 8 
            // 10 % 10 = 0
            // 1 % 10 = 1
            int lastdigit = n % 10;
            // find remaining number 
            reverse = reverse * 10 + lastdigit;
            // 10899  = 0 * 10 + 9 = 9
            // 1089   = 9 * 10 + 9 = 99
            // 108    = 99 * 10 + 8 = 998
            // 10     = 998 * 10 + 0 = 9980
            // 1      = 9980 * 10 + 1 = 99801
               
            // ermove the last digit
            n = n/10;
            // remove the last digit 10899/10 = 1089 
            // remove the last digit 1089/10 = 108
            // remove the last digit 108/10 = 10
            // remove the last digit 10/10 = 1
            // remove the last digit 1/10 = 0

        }
        System.out.println(originalNumber);
        System.out.println(" Reverse of a number is : " + reverse);
    }
}  */ 


//Question - Check if a number is Prime or not. (Formula -
/*import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("n is prime number");
        }  else {
        boolean isPrime = true;
            for(int i = 2; i<= n-1; i++) {
            if (n % i == 0){ //n is a miltiple of i(i not equal or n)
                isPrime = false;
            }
        }
            if(isPrime == true) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            } 
        }
    }
        
}*/

 //Question - Check if a number is Prime or not. (Formula - optimized approach)
/*import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("n is prime number");
        }  else {
        boolean isPrime = true;
            for(int i = 2; i<= Math.sqrt(n); i++) {
            if (n % i == 0){ //n is a miltiple of i(i not equal or n)
                isPrime = false;
            }
        }
            if(isPrime == true) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            } 
        }
    }
        
}*/



// LOOPS QUESTIONS
// Question 1 :How many times 'Hello' is printed?
/*import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++){
        //     System.out.println("Hello");
        //     i = i + 2;
        // }
    }
}*/

// Question2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        
        
    }
}
