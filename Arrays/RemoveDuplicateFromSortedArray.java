public class RemoveDuplicateFromSortedArray {

    // Using two Pointer:

    public static int RemoveFunction(int Array[], int n) {
        int i = Array[0];
        for (int j = i + 1; j < n; j++) {
            if (i != Array[j]) {
                i++;
                Array[i] = Array[j];
            }
            j++;
        }
        return i + 1;
    }

    // using count variable
    // public static int RemoveFunction(int Array[]) {
    // int n = Array.length;
    // int count = 0;
    // for (int i = 1; i < Array.length; i++) {
    // if (Array[i] == Array[i - 1]) {
    // count++;
    // } else
    // Array[i - count] = Array[i];
    // }

    // int k = n - count;

    // for (int i = 0; i < k; i++) {
    // System.out.println(Array[i]);
    // }
    // System.out.println("******************");
    // return n - count;
    // }

    public static void main(String[] args) {
        int Array[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int n = Array.length;
        n = RemoveFunction(Array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i]+" ");
        }
    }
}
