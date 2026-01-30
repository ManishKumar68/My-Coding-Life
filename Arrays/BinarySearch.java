/*public class BinarySearch {

    // binary search
    public static int binary(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6, 7, 9, 33, 55, 88};
        int key = 60 ;
        System.out.println("Index = " + binary(numbers, key));
    }
}*/


// Reverse an Array [2 , 4 , 6 , 8 , 10 ,88]
public class BinarySearch {

    // make a funcation 
    public static void revarse(int a[]){
        int start = 0;
         int end = a.length - 1;

         while(start < end) {
            // swapd tec...
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            start++;
            end--;
         }
    }
    public static void main(String[] args) {
        int a[] = {2 , 4 , 6 , 8 , 10, 88};
        revarse(a);
        // print the revarse array
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] +"");
        }
        System.out.println();
    }

}