import java.util.*;
public class MostFrequentElement {
    public int RepeatedElement(int Array[]){
        Map<Integer, Integer> map = new HashMap<>();
        int mostFrequent = Array[0];
        int maxFrequency = 0;

      for (int num : Array) {
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num, count + 1 );
            }
            else
            map.put(num, 1);  

            if(map.get(num) > maxFrequency){
                mostFrequent = num;
                maxFrequency = map.get(num);
            }
           
        }
     
        return mostFrequent;
    }
    public static void main(String[] args){
        MostFrequentElement mf = new MostFrequentElement();
        int Array[] = {1,3,2,1,4,1,4,5,2,4,5,2,4};
        mf.RepeatedElement(Array);
        int ms = mf.RepeatedElement(Array);
        System.out.println(ms);

    }
}
