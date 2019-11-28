public class Reverse {

    public ListNode reverse (ListNode list) {
        // replace statement below with code you write
        ListNode rev = null;
        ListNode temp = list.next;
        while(list!=null){
            temp = list.next;
            list.next = rev;
            rev = list;
            list = temp;
        }

        return rev;
    }
}


