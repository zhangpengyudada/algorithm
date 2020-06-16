import java.util.ArrayList;
import java.util.Stack;

public class 反转链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (listNode==null)return null;
        Stack stack=new Stack();
        while (listNode!=null){
            stack.add(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.isEmpty()){
            list.add((Integer) stack.pop());

        }
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
   }
}
