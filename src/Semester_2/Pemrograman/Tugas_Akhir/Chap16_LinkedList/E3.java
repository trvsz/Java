package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class E3 {
    public static void main(String[] args) {
        ListNode LIST = new ListNode(1, new ListNode(2)); // LIST -> 1 -> 2
        ListNode TEMP = new ListNode(3, new ListNode(4)); // TEMP -> 3 -> 4
        TEMP.next.next = LIST.next; // Answer VSC
        // temp.next.next = list;   // Answer PracticeIt
        LIST.next = TEMP;           // Answer VSC
        // list.next = temp;        // Answer PracticeIt
        System.out.println(LIST.data + " " + LIST.next.data + " " + LIST.next.next.data + " " + LIST.next.next.next.data);
    }
}

/*
 * Output:
 * 1 3 2 4
 */
