public class Length_of_last_word {
    public static int function(String str) {
        String[] Array = str.split(" ");
        return Array[Array.length - 1].length();
    }

    public static void main(String[] args) {
        String str = "This is the long text";
        int res = function(str);
        System.out.println(res);
    }
}
