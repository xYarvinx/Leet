package ReverseLinkedList_206_easy;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode fin = new ListNode();
        ListNode node = fin;
        node.val = 1;
        for(int i = 2; i < 6; i++){
            node.next= new ListNode(i);
            node = node.next;
        }
        System.out.println(solution.reverseList(fin));

    }
}
