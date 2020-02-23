import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            }else{
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }
        //当A,B任意一单链表走完时，输出另一链表即可
        if(l1 == null) {
            tmp.next = l2;
        }
        if(l2 == null) {
            tmp.next = l1;
        }
        return newHead.next;
    }
}


public class Main {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] c = in.next().toCharArray();
            StringBuffer sb = new StringBuffer();
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < c.length; i++) {
                if (set.add(c[i]))
                    sb.append(c[i]);
            }
            System.out.println(sb.toString());
        }
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!builder.toString().contains(temp + "")) {
                builder.append(temp);
            }
        }

        System.out.println(builder.toString());

    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if(!builder.toString().contains(tmp + "")) {
                builder.append(tmp);
            }
        }
        System.out.println();
    }

}