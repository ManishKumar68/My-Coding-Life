import java.util.*;
public class TypePromotion {
    public static void main(String[] args){
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println("print the total value:" + (a-b));


        // byte a = 40; 
        // byte b = 50;
        // byte c = 100;
        // byte bt = (byte)(a * b * c);
        // System.out.println(bt); only foe understannding this  write the code 

        //  int a = 25;
        //  float b = 35.55f;
        //  long c = 25;
        //  double d = 45.66;
        //  double result = a + b + c + d;
        //  System.out.println("result is :" + result);
        //  int answer =(int) (a + b + c + d);
        //  System.out.println("answer is :" + answer);

        byte b = 5;
        byte a =  (byte)(b * 2);
        System.out.println(a);

        /* incompatible types: possible lossy conversion from int to byte
         byte a =  b * 2;*/

    }


}