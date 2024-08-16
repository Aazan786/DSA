import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
    public int findDuplicatenumber(int array[]){
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if(set.contains(i))
                return i;
            set.add(i);
            
        }
        return 0;
    }
    public static void main(String[] args){
        FirstRepeatingElement dm = new FirstRepeatingElement();
        int array [] = {1,2,3,3,4,4,4,5};
        int num = dm.findDuplicatenumber(array);
        System.out.println(num);
    }
}
