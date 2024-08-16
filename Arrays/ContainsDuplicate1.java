import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate1 {
    public static boolean ContainsDuplicate(int Array[]){
         Set<Integer> set = new HashSet<>();
         for (int i = 0; i < Array.length; i++) {
            set.add(Array[i]);
         }
         if (set.size()==Array.length) {
            return false;
         }
        return true;
    }
    public static void main(String[] args) {
        int Array[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(ContainsDuplicate(Array));
    }
}
