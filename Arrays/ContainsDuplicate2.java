import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

    public static boolean ContainsDuplicate(int Array[], int k) {
        // Brute Force solution
        // for (int i = 0; i < Array.length; i++) {
        // for (int j = i+1; j < Array.length; j++) {
        // if (Array[i] == Array[j] && Math.abs(i - j) <= k) {
        // return true;
        // }
        // }
        // }
        // return false;

        // optimal
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < Array.length; i++) {
            if (map.containsKey(Array[i]) && i - map.get(Array[i]) <= k) {
                return true;
            }
            map.put(Array[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int Array[] = { 1, 2, 3, 1, 2, 3 };
        System.out.println(ContainsDuplicate(Array, 2));
    }
}
