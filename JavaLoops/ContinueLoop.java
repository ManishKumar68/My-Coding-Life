/*public class ContinueLoop {
    public static void main(String[] args){
        for(int i = 1;i <= 5 ; i++) {
           if (i == 3 ){
               continue;
           }
           System.out.println(i);
        }
    }
}*/

//Question Display all numbers entered by user except multiples of 10.
import java.util.Scanner;
public class ContinueLoop {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        do {
            System.out.print("enter your number : ");
            int n = Sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n + " is a continue loop");

        }while(true);
    }
}
