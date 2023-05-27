package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E1 {
    public static void main(String[] args) {
        ListNode LIST = new ListNode(1, new ListNode(2, new ListNode(3))); // LIST -> 1 -> 2 -> 3
        System.out.println(LIST.data + " " + LIST.next.data + " " + LIST.next.next.data);
    }
}

/*
 * Output:
 * 1 2 3
 */