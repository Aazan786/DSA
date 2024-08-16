import java.util.*;
public class LengthofsubArray {
    // brute force solution
    // public int Length(int Array[], int k) {
    //     int length = 0;
    //     for (int i = 0; i < Array.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < Array.length; j++) {
    //             sum += Array[j];
    //             if (sum == k) {
    //                 length = Math.max(length, j - i + 1);
    //             }
    //         }
    //     }
    //     return length;
    // }

    // optimal O(n)
    public static int Length(int Array[], int k) {
        int left = 0;
        int right = 0;
        int n = Array.length;
        int maxLen = 0;
        int sum = Array[0];

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= Array[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += Array[right];
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int Array[] = { 1, 2, 3, 4, 5 };
        int result = Length(Array, 5);
        System.out.println(result);
    }
}
