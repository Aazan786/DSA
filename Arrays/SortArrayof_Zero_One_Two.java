public class SortArrayof_Zero_One_Two {

    public static void Sort(int Arr[]) {
        int mid = 0;
        int low = 0;
        int high = Arr.length - 1;

        while (mid <= high) {
            if (Arr[mid] == 0) {
                int temp = Arr[mid];
                Arr[mid] = Arr[low];
                Arr[low] = temp;
                mid++;
                low++;
            }

            else if (Arr[mid] == 1) {
                mid++;
            } else {
                int temp = Arr[high];
                Arr[high] = Arr[mid];
                Arr[mid] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int Arr[] = { 0, 1, 2, 2, 1, 0, 1, 2, 0 };
        // System.out.println("Before sorting:");
        // for (int i = 0; i < Arr.length; i++) {
        //     System.out.print(Arr[i] + " ");
        // }
        
        // System.out.println(); // Add newline character here

        Sort(Arr);
        System.out.println("After sorting:");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }

    }
}
