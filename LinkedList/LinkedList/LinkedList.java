package LinkedList;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Operations
    // Inseration O(1)
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // inseration at anywhere at middle O(n)
    public void add(int index, int data) {

        if (index == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove Operations
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int remove(int index) {
        Node prev = head;
        int i = 0;
        while (i < index - 1) {
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // Searching Recursive
    // Reversing a linkedList
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Delete N node from the end
    public void deleteNnodefromend(int index) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (index == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int n = size - index;
        Node prev = head;
        while (i < n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Mid Node
    public Node Midnode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Plaindrome
    public boolean checkPlainfrome() {
        if (head == null || head.next != null) {
            return true;
        }

        Node midnode = Midnode(head);

        Node prev = null;
        Node curr = midnode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Cycle Detect
    public static boolean IsCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }

        return false;
    }

    // Print linked list O(n)
    public void Print() {

        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove cycle
    public static void RemoveCycle() {
        boolean cycle = false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    // Zig- Zag linked List
    public static Node Mid(Node head){
        {
            Node slow = head;
            Node fast = head.next;
    
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
    
            return slow;
        }
    }

    public void Zig_Zag(){
        //Finding mid
        Node mid = Mid(head);
        //reverse
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node NextL, NextR;

        //Alternative merging
        while (left!= null && right != null) {
            NextL =left.next;
            left.next = right;
            NextR =right.next;
            right.next = NextL;

            left = NextL;
            right = NextR;
        }
    }

    // public static void main(String[] args) {
    //     head = new  Node(1);
    //     head.next = new Node(2);
    //     head.next.next = new Node(3);
    //     head.next.next.next = head;
    // }

}
