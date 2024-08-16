public class string_plaindrome {
    public static boolean check_plaindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "nnoon";
        System.out.println(check_plaindrome(str));
    }
}
