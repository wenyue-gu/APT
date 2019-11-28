public class DoubleList {
    public ListNode bigify(ListNode list) {
        // replace statement below with code you write
        ListNode temp;
        ListNode k = list;
        if(list!=null) {
            temp = new ListNode(list.info, list.next);
            list.next = temp;
            k = new ListNode(list.info, list.next);
            list = (list.next).next;
        }
            while (list != null) {
                temp = new ListNode(list.info, list.next);
                list.next = temp;

                list = (list.next).next;
            }
        return k;
    }
}