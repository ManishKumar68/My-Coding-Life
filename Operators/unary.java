import java.util.*;
public class unary {
    public static void main(String []  args){
    int a = 5;
    System.out.println(a++); //5 (first print then increment);
    System.out.println(++a); //7 (first increment then print);
    System.out.println(a--); //7 (first print then decrement);
    System.out.println(--a); //5 (first decrement then print);
    }
}