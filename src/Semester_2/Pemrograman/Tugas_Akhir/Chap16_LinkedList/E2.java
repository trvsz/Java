package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E2 {
    public static void main(String[] args) {
        ListNode LIST_OLD = new ListNode(1, new ListNode(2)); // LIST_OLD -> 1 -> 2
        ListNode LIST = new ListNode(3, LIST_OLD); // Answer VSC
        // list = new ListNode(3, list);                // Answer PracticeIt
        System.out.println(LIST.data + " " + LIST.next.data + " " + LIST.next.next.data);
    }
}

/*
 * Output:
 * 3 1 2
 */