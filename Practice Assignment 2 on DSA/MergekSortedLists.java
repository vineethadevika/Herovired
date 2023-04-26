class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                values.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(values);

        ListNode dummy = new ListNode();
        ListNode answer = dummy;
        for (int i = 0; i < values.size(); i++) {
            dummy.next = new ListNode(values.get(i));
            dummy = dummy.next;
        }

        return answer.next;
    }
}
