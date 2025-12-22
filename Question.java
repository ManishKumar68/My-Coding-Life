import java.util.*;
// Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
public class Question {
    public static void main(String[] args){

    int A = 10;
    int B = 20;
    int C = 30;
    int Average = (A + B + C) /3;
    System.out.println("The average of 3 number is : " + Average);
  
  }
}


// Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side))
public class Question {
    public static void main(String[] args) {
        int side = 5;
        int area = side * side;
        System.out.println("The area of the square is : " + area);
        }
}

// Question3:Enter cost of 3 items from the user(using float data type)-a pencil,a pen andan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Emnter the cost of eraser:" + pen);
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float gst = (total/100)*18;
        System.out.println("Total cost of items without gst: " + total);
        System.out.println("GST on total cost: " + gst);
        System.out.println("Total cost of items with gst: " + (total + gst));

    }
}


// Question 5:(Advanced)Will the following statementgive any error in Java?int$=24
public class Question {
    public static void main(String[] args) {
int $ = 13;
System.out.println($);
    }
}
    // No, the statement will not give any error.Names of variables are called identifiers in Java. Identifiers rules says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier
