public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        // replace statement below with code you write
        ListNode temp;
        ListNode k = list;
        while(list!=null) {

            for(int i = 0; i<amount-1; i++) {
                temp = new ListNode(list.info, list.next);
                list.next = temp;
                list = list.next;
            }
            if(list.next!=null) {
                list = list.next;
            }
            else{
                return k;
            }
        }
        return k;
    }
}