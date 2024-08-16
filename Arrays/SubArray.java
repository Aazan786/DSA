public class SubArray {

    public static void PrintSubArray(int numbers[]){
    for (int i = 0; i < numbers.length; i++) {
    int start = i;
    for (int j = i; j < numbers.length; j++) {
    int end = j;
    for (int k = start; k<=end; k++) {
    System.out.print(numbers[k]+" ");
    }
    System.out.println();
    }
    System.out.println();
    }
    }

    Brute Force Solution O(n3)
    Prefix array o(n2)

    public static void MaxSumSubArray(int numbers[]){
    int cursum = 0;
    int maxsum = Integer.MIN_VALUE;
    int prefix [] = new int[numbers.length];

    prefix[0] = numbers[0];
    for (int i= 0; i < prefix.length; i++) {
    prefix[i] = prefix[i-1] + numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {
    int start = i;
    for (int j = i; j < numbers.length; j++) {
    int end = j;
    cursum = start == 0 ? prefix[end] : prefix[end] +prefix[start-1];

    if(maxsum<cursum)
    maxsum = cursum;

    }
    System.out.println();
    }
    System.out.println("Max sum" + "" + maxsum);
    }

    Kadane's Algorithm O(n)
    public static int MaxSum(int numbers[]){

    int cursum = 0;
    int maxsum = Integer.MIN_VALUE;
    boolean allnegative = true;
    for (int i = 0; i < numbers.length; i++) {
    cursum += numbers[i];
    if(numbers[i] >= 0)
    allnegative = false;

    if(cursum< 0){
    cursum = 0;
    }

    if(maxsum < cursum)
    maxsum = cursum;
    }
    if(allnegative){
    return -1;
    }
    return maxsum;
    }

    public static int Length(int Array[], int k) {
        int length = 0;
        for (int i = 0; i < Array.length; i++) {
            int sum = 0;
            for (int j = i; j < Array.length; j++) {
                sum += Array[j];
                if (sum == k) {
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int Array[] = { 1, 2, 3, 4, 5 };
        // PrintSubArray(numbers);
        // int sum = MaxSum(numbers);
        // System.out.println(sum);

    }
}
