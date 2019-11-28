public class RemoveLast {
    public ListNode remove(ListNode list) {
        // replace statement below with code you write
        ListNode l = list;
        if(list == null){
            return null;
        }
        else{
            while((list.next).next!=null){
                list = list.next;
            }
            list.next = null;
        }
        return l;
    }
}