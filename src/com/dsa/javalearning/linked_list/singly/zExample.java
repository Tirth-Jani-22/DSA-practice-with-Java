package com.dsa.javalearning.linked_list.singly;

public class zExample extends MakingLL {

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = lists[0];
        ListNode mainCurr = head;
        int ind = 0;
        for(int i=1;i<lists.length;i++){
            ListNode currCurr = lists[i];
            while (mainCurr != null && currCurr != null){
                if(mainCurr.val < currCurr.val){
                    mainCurr = mainCurr.next;
                }else{
                    ListNode next = mainCurr.next;
                    mainCurr.next = new ListNode(currCurr.val);
                    mainCurr.next.next = next;
                    currCurr = currCurr.next;
                    mainCurr = mainCurr.next;
                }
            }
            while (currCurr != null){
                mainCurr = currCurr;
                mainCurr = mainCurr.next;
                currCurr = currCurr.next;
            }
            mainCurr=head;
        }
        return head;
    }

    public static void main(String[] args) {
        MakingLL list1 = new MakingLL();
        MakingLL list2 = new MakingLL();
        MakingLL list3 = new MakingLL();
        list1.addFirst(5);
        list1.addFirst(4);
        list1.addFirst(1);
        list2.addFirst(4);
        list2.addFirst(3);
        list2.addFirst(1);
        list3.addFirst(6);
        list3.addFirst(2);
        list1.printll();
        System.out.println();
        list2.printll();
        System.out.println();
        list3.printll();
        System.out.println();
        ListNode[] listNodes = {list1.head,list2.head,list3.head};
        printll(mergeKLists(listNodes));
    }
}
