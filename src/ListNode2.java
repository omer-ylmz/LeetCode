import java.math.BigInteger;

public class ListNode2 {
    int val;
    ListNode2 next;

    // Constructors
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

class Solution2 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        if (l1 == null && l2 == null) return new ListNode2();

        l1 = tersCevir(l1);
        l2 = tersCevir(l2);

        BigInteger l1Sayi = sayiyaCevir(l1);
        BigInteger l2Sayi = sayiyaCevir(l2);

        BigInteger toplam = l1Sayi.add(l2Sayi);

        String numStr = toplam.toString();
        ListNode2 yeni = null;

        for (int i = 0; i < numStr.length(); i++) {
            char basamak = numStr.charAt(i);
            ListNode2 listNode = new ListNode2(Character.getNumericValue(basamak), yeni);
            yeni = listNode;
        }
        return yeni;
    }

    public ListNode2 tersCevir(ListNode2 listNode) {
        ListNode2 yeni = new ListNode2(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            yeni = new ListNode2(listNode.val, yeni);
        }
        return yeni;
    }

    public BigInteger sayiyaCevir(ListNode2 listNode) {
        StringBuilder sayiIlk = new StringBuilder();
        while (listNode != null) {
            sayiIlk.append(listNode.val);
            listNode = listNode.next;
        }
        return new BigInteger(sayiIlk.toString());
    }
}
