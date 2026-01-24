/*public class methods {

// function calling  
    public static void sum(){
        int a = 4;
        int b = 4;
        int sum = (a + b);
        System.out.println(sum);
    }

    // normal parameters define 
    public static void calculated(){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int f = sc.nextInt();
        int cal = (d + f);
        System.out.println(cal);
    }

    // Formal parameters define 
    public static int calculat( int e, int g){  // formale parameters 
        int cals = (e + g);
        return cals;
    }
    public static void main(String[] args){
        sum(); // Call
        calculated();

        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int g = sc.nextInt();
        int cals = calculat(e,g);  // Actual Parameters Arguments.
        System.out.println(cals);
    }

}*/

// swap - vaalues exchange.
public class methods {
    public static void swap(int a , int b){
        // Swap
    int temp = a;
    a = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);
    }
public static void main (String [] args){

// swap - vaalues exchange.
int a = 4;
int b = 5;
swap(a,b);

}
}

