....
public class NestedLoops {
    public static void main(String[] args) {
        // outer loops
        for (int Line = 1; Line <= 4; Line++) {
            // inner Loops
            for (int star = 1; star <= Line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* output

*
**
***
****

*/


// inverted Star partten Print 
public class NestedLoops {
    public static void main(String[] args) {
        int n = 4;
        // outer loops
        for (int Line = 1; Line <= 4; Line++) {
            // inner Loops
            for (int star = 1; star <= n-Line + 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// NestedLoops output
// ****
// ***
// **
// *
*/


// Print Half-Pyramid pattern.
public class NestedLoops {
    public static void main(String[] args) {
        
        // outer loops
        for (int Line = 1; Line <= 4; Line++) {
            // inner Loops
            for (int number = 1; number <= Line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

// Print Half-Pyramid Charecter Print...
public class NestedLoops {
    public static void main(String[] args) {
        // outer loops
        for (char i = 'A'; i <= 'J'; i++) {
            // inner Loops
            for (int Character = 'A'; Character <= i; Character++){
                System.out.print((char)Character);
            }
            System.out.println();
        }
    }
}

// Print Character Pattern..
public class NestedLoops {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        // outer loops
        for (int Line = 1 ; Line <= n; Line++) {
            // inner Loops
            for (int Character = 1; Character <= Line; Character++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

