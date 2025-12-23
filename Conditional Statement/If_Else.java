import java.util.Scanner;
public class If_Else {
    public static void main (String[] args) {
        //  normal if else condition check.
        // int a = 10;
        // int b = 20;
        // if(a > b) {
        //     System.out.println("a is greater than b" + a);
        // }
        // else {
        //     System.out.println(" b is greater than a" + b);
        // }
        
        // age check (if else)
        /*int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }*/

        // (if - if - else ) 
        int age = 12;
        if(age >= 18) {
            System.out.println("you are eligible to drive");

        } if (age > 11 && age < 18) {
            System.out.println("You are a teenager");
        } else {
                System.out.println("you are a child");
            }
    }
}