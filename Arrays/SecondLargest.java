//Brute solution: Sort array and then find second largest


//Better solution: o(2n)
public class SecondLargest {

    // public static int secondLargest(int Arr[]){
    //     int largest = Arr[0];
    //     int secondL = -1;
    //     for (int i = 0; i < Arr.length; i++) {
    //         if (Arr[i] > largest){
    //             largest = Arr[i];
    //         }
    //     }

    //     for (int i = 0; i < Arr.length; i++) {
    //         if(Arr[i]>secondL && Arr[i] !=largest){
    //             secondL = Arr[i];
    //         }
    //     }

    //     return secondL;
    // }

    //Optimal approach O(n)
    public static int secondLargest(int Arr[]){
        int largest = Arr[0];
        int sLargest = Integer.MIN_VALUE;
        for (int i = 1; i < Arr.length; i++) {
            if(Arr[i]> largest){
                sLargest = largest;
                largest = Arr[i];
            }

            if(Arr[i] !=largest && Arr[i]> sLargest){
                sLargest = Arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args) {
        int Arr[] = {1,2,4,7,6,7,5};
        System.out.println(secondLargest(Arr));
    }
}
