import First.Array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(8);
        numbers.insert(5);
        numbers.insert(6);
        numbers.insertAt(40, 1);
        numbers.print();
        //numbers.reverse();
        System.out.println("max element is : ");
        System.out.println(numbers.Min());
        // System.out.println(numbers.indexOf(30));
        // numbers.removeAt(1);
        // numbers.print();
    }
}