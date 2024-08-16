import java.util.*;

public class Hashmaap {
    // First non repating char in string
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        for (var ch : chars) {
            if (map.containsKey(ch)){
                var count = map.get(ch);
                map.put(ch, count + 1);
            }
            else
                map.put(ch, 1);
        }
        for (var ch : chars)
            if(map.get(ch) == 1)
            return ch;

        return Character.MIN_VALUE;

    }

    // First repeating char in string
    //  public char findFirstRepeatingChar(String str) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     var chars = str.toCharArray();
    //     for (var ch : chars) {
    //         if (map.containsKey(ch)){
    //             var count = map.get(ch);
    //             map.put(ch, count + 1);
    //         }
    //         else
    //             map.put(ch, 1);
    //     }
    //     for (var ch : chars)
    //         if(map.get(ch) >= 2)
    //         return ch;

    //     return Character.MIN_VALUE;

    // }

      // Using HashSet
     public char findFirstRepeatingChar(String str) {
        Set<Character> set = new HashSet<>();
        var chars = str.toCharArray();
        for (var ch : chars) {
            if (set.contains(ch))
               return ch;
            
            set.add(ch);
        }
        return Character.MIN_VALUE;

    }

    public static void main(String[] args) {
        Hashmaap finder = new Hashmaap();
        String str = "green apple";
        var ch = finder.findFirstRepeatingChar(str);
        System.out.println(ch);

    }
}
