import java.util.*;
public class TexCalculator {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        int tex;
        if ( income < 500000 ) {
            tex = 0;
           System.out.println("No tex :" + income);

        } else if (500000 >= income  && income < 1000000) {
            tex = (int) (income * 0.2);
            System.out.println("tex is 20% : " + tex + "%");
        } else {
            tex = (int) (income * 0.3);
            System.out.println("tex is 30% :" + tex + "%");
        }
        System.out.println("your tex is : " + tex );
    }
}