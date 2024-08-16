public class searchChar {

public static String reverse(String word){
    String reverseword = "";
    for (int i = word.length() -1; i>= 0; i--) {
        reverseword += word.charAt(i);
    }
    return reverseword;
}
public static String Search(String str, char ch){
    String[] words = str.split(" ");
    String word = "";
    for (int i = 0; i < words.length; i++) {
        if (words[i].indexOf(ch) != -1) {
            word = reverse(words[i]);
            break;
        }
    }
   
    return word;
}

    public static void main(String[] args) {
        String str = "This is a long text";
        // String mtr = "Long range over";
        char given = 'o';
        String res = Search(str, given);
        System.out.println(res);
    }
}
