package leetcode;

public class SingleNumberIII360 {

	public static void main(String[] args) {
		SingleNumberIII360 sn = new SingleNumberIII360();
		int[] input = {3,2,3,66,2,5,5,7};
		sn.getNonRepeatingNumbers(input);
	}

	private int[] getNonRepeatingNumbers(int[] input) {
		int[] nonRepeat = new int[2];
		int temp = input[0];
		for (int i = 1; i < input.length; i++) {
			temp = temp ^ input[i];
		}
		System.out.println(temp);
		int index = 0;
		while (temp != 0) {
			if ((temp & 1) == 1) {
				break;
			} else {
				index++;
			}
			temp>>=1;
		}
		System.out.println(index);
		int first = 0;
		int second = 0;
		for (int i = 0; i < input.length; i++) {
			if (((input[i] >> index) & 1) == 1) {
				first ^= input[i];
			} else {
				second ^= input[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
		nonRepeat[0] = first;
		nonRepeat[1] = second;
		return nonRepeat;
	}
	
	public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast->next!=null && fast->next->next!=null){
            fast = fast->next->next;
            slow = slow->next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

}
