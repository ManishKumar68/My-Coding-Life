import java.util.*;
public class Arrayss{
    public static void main(String args[]){
        // input in arrays..
        int marks[] = new int [100];
        // length findddd.
        System.out.println("Length of Arrays :" + marks.length);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        // Update Arrays..
        marks[2] = marks [2] + 1 ;
        
        // Output..
        System.out.println("phy : " + marks[0]);
        System.out.println("chm : " + marks[1]);
        System.out.println("chm : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println(percentage + "%");

    }
}