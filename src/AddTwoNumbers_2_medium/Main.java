package AddTwoNumbers_2_medium;


public class Main {
    public static void fillNode(ListNode l1, int[] n) {
        ListNode dummyhead = l1;
        dummyhead.val = n[0];
        for (int i = 1; i < n.length; i ++) {
            dummyhead.next = new ListNode(n[i]);
            dummyhead = dummyhead.next;
        }
    }

    public static void printNode(ListNode l1) {
        ListNode dummyhead = l1;
        while (dummyhead != null) {
            System.out.print(dummyhead.val + " ");
            dummyhead = dummyhead.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        int[] list = {2, 0, 3, 2, 5};
        int[] list2 = {2, 0, 3, 2, 5};
        fillNode(n1, list);
        fillNode(n2,list2);
        printNode(n1);
        printNode(n2);
        Solution l = new Solution();
        ListNode listF = l.addTwoNumbers(n1,n2);
        printNode(listF);
        System.gc();
    }


}