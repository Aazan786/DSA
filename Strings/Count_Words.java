public class Count_Words {
    public static int CountWords(String str){
        String[] Words = str.split("\\s+");
        return Words.length;
    }
    public static void main(String[] args) {
        String str = "This   is beautiful";
        int res = CountWords(str);
        System.out.println(res);
    }
}
