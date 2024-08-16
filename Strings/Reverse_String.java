public class Reverse_String{

    // Function to reverse a portion of the array from 'start' to 'end'
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static String reverseWordsAndCharacters(String s) {
        char[] strArray = s.toCharArray(); // Convert the string to a character array

        // Step 1: Reverse the entire string
        reverse(strArray, 0, strArray.length - 1);

        // Step 2: Reverse each word in the string
        int start = 0; // Start index of a word
        for (int end = 0; end <= strArray.length; end++) {
            // When we find a space or reach the end of the array, reverse the word
            if (end == strArray.length || strArray[end] == ' ') {
                reverse(strArray, start, end - 1);
                start = end + 1; // Move to the start of the next word
            }
        }

        return new String(strArray); // Convert the char array back to a string
    }

    public static void main(String[] args) {
        String s = "Azan is a good boy";
        String reversed = reverseWordsAndCharacters(s);
        System.out.println(reversed); // Output will be the words in reverse order, with characters also reversed
    }
}
