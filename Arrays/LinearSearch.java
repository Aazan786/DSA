public class LinearSearch {

    public static int Search(String fruits[], String key ){
        for (int i = 0; i < fruits.length; i++) 
            if (fruits[i]== key)
            return i;
        
        return -1;
    }
    public static void main(String[] args){
        String fruits[] = {"apple", "banana", "orange","pineapple","watermelon", "mango"};
        String key = "orange";
        int index= Search(fruits, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key at index:"+ index);
        } 
    }
}
