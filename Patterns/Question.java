// Question 1 - Hollow rectangle pattern
public class Question{
    public static void main(String args[]){
        int Rows = 4;
        int Cols = 5;
        for (int i = 1; i <= Rows; i++){
            for (int j = 1; j <= Cols; j++){

                if (i == 1 || i == Rows || j == 1 || j == Cols){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

/* output

    *  *  *  *  * 
    *           * 
    *           * 
    *  *  *  *  * 
    
    */

// Question 2 - INVERTED & ROTATED HALF-PYRAMID pattern 
 public class Question{
    public static void main(String args[]){
        
        
        for (int i = 1; i <=4 ; i++){
                // inner Loops -  Print the Space.
            for(int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // inner Loop -> Star Print 
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Question 3 - inverted Star partten Print 
public class Question {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        // outer loops
        for (int Line = 1 ; Line <= n; Line++) {
            // inner Loops
            for (int Character = 1; Character <= Line; Character++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}

// Quesyion 4 - 0-1 Triangle pattern
 public class Question {
    public static void main(String [] args){ 
        int n = 5;
        // Outter Lopp
        for (int i = 1;  i <= n; i++){
            // Ineer Loops
            for (int j = 1; j <= i; j++){

                if ((i + j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}

// Question 5 - SOLID RHOMBUS pattern
public class Question{
    public static void main(String args[]){
        int rows = 5;
        
        
        for (int i = 1; i <= rows ; i++){
                // inner Loops -  Print the Space.
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // inner Loop -> Star Print 
            for (int j = 1; j <= rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Question 6 - HOLLOW RHOMBUS Pattern
public class Question {
    public static void main(String [] args){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++){                
                if (i == 1 ||i == n || j == 1|| j == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/* output

    *****
   *   *
  *   *
 *   *
*****

*/

// Question 7 - DIAMOND Pattern
public class Question {
    public static void main (String[] args){
        int row = 5;
        int mid = row/2;

        // Upper half
        for (int i = 0; i <= mid; i++) {

            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      // Lower half
        for (int i = mid - 1; i >= 0; i--) {

            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Question 8 - NUMBER PYRAMID pattern
public class Question {
    public static void main (String[] args){
        
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // assending number
            for( int j = 1; j <= i ; j++){
                System.out.print(j);
            }

            // decending Number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//Question 10 -  NUMBER PYRAMID pattern-
public class Question {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

// Question 11 - ButterFly Partten..
public class Question {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
