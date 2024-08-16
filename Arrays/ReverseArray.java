public class ReverseArray {
    
    public static void Reverse(int Array[]){
        int n = Array.length;
        for (int i = 0; i < n/2; i++) {
            int temp = Array[i];
            Array[i] = Array[n-i-1];
            Array[n-i-1] = temp;
        }
    }
    public static void main(String[] args){
        int Array[] = {2,3,4,5,6,7,8};
       Reverse(Array);
       for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
       }
    }
}
