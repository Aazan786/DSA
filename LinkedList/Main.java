import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.Print();
        ll.Zig_Zag();
        ll.Print();
        // System.out.println(ll.IsCycle());
        // System.out.println(ll.checkPlainfrome());
        // ll.reverse();
        // ll.Print();
        // System.out.println(ll.size);
    }
}
