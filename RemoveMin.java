public class RemoveMin {
    public ListNode remove (ListNode list) {
        // replace statement below with code you write
        ListNode a = list;
        ListNode b = list;
        ListNode temp = list;
        if(temp == null){
            return null;
        }
        int i = 0;
        while(list!=null){
            if(list.next!=null) {
                if (list.next.info < temp.info) {
                    b = list;
                    temp = list.next;
                    i = i+1;
                }
            }
            list = list.next;
        }

        if(i==0){
            return temp.next;
        }

        b.next = temp.next;
        return a;
    }
}