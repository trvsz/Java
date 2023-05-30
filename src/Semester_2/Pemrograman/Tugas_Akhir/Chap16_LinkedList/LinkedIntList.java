package Semester_2.Pemrograman.Tugas_Akhir.Chap16_LinkedList;

import java.util.NoSuchElementException;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

// Client -> PracticeIt

public class LinkedIntList {
    private ListNode front;  // first value in the list (null if empty)

    // Exercise 4
    public int min() { // returns nilai terkecil dari list
        if (front == null) { // jika list kosong
            throw new NoSuchElementException();  // lempar exception
        }
        int min = front.data; // inisialisasi nilai terkecil dengan nilai pertama
        ListNode current = front.next; // inisialisasi current dengan nilai kedua
        while (current != null) { // iterasi selama current tidak null
            if (current.data < min) { // jika nilai current lebih kecil dari nilai terkecil
                min = current.data; // nilai terkecil menjadi nilai current
            }
            current = current.next; // current menjadi current.next
        }
        return min; // mengembalikan nilai terkecil
    }

    // Exercise 5
    public Boolean hasTwoConsecutive() { // returns true jika ada dua nilai yang berurutan
        if (front == null) { // jika list kosong
            return false; // mengembalikan nilai false
        }
        ListNode current = front; // inisialisasi current dengan nilai pertama
        while (current.next != null) { // iterasi selama current.next tidak null
            if (current.data + 1 == current.next.data) { // jika nilai current + 1 sama dengan nilai current.next
                return true; // mengembalikan nilai true
            }
            current = current.next; // current menjadi current.next
        }
        return false; // mengembalikan nilai false
    }

    // Exercise 6
    public int deleteBack() { // menghapus nilai terakhir dari list
        if (front == null) { // jika list kosong
            throw new NoSuchElementException(); // lempar exception
        }
        int result; // inisialisasi nilai yang akan dihapus
        if (front.next == null) { // jika list hanya memiliki satu nilai
            result = front.data; // nilai yang akan dihapus adalah nilai pertama
            front = null; // front menjadi null
        } else { // jika list memiliki lebih dari satu nilai
            ListNode current = front; // inisialisasi current dengan nilai pertama
            while (current.next.next != null) { // iterasi selama current.next.next tidak null
                current = current.next; // current menjadi current.next
            }
            result = current.next.data; // nilai yang akan dihapus adalah nilai current.next
            current.next = null; // current.next menjadi null
        }
        return result; // mengembalikan nilai yang dihapus
    } 

    // Exercise 7
    public int removeAll(int value) { // menghapus semua nilai yang sama dengan value
        int count = 0; // inisialisasi jumlah nilai yang dihapus
        while (front != null && front.data == value) { // iterasi selama front tidak null dan nilai front sama dengan value
            front = front.next; // front menjadi front.next
            count++; // jumlah nilai yang dihapus ditambah 1
        }
        if (front == null) { // jika list kosong
            return count; // mengembalikan jumlah nilai yang dihapus
        }
        ListNode current = front; // inisialisasi current dengan nilai pertama
        while (current.next != null) { // iterasi selama current.next tidak null
            if (current.next.data == value) { // jika nilai current.next sama dengan value
                current.next = current.next.next; // current.next menjadi current.next.next
                count++; // jumlah nilai yang dihapus ditambah 1
            } else { // jika nilai current.next tidak sama dengan value
                current = current.next; // current menjadi current.next
            }
        }
        return count; // mengembalikan jumlah nilai yang dihapus
    }

    // Exercise 8
    public void doubleList() { // menambahkan nilai yang sama dengan nilai pertama ke akhir list
        if (front != null) { // jika list tidak kosong
            ListNode end = front; // inisialisasi end dengan nilai pertama
            int size = 1; // inisialisasi panjang list
            while (end.next != null) { // iterasi selama end.next tidak null
                end = end.next; // end menjadi end.next
                size++; // panjang list ditambah 1
            }
            ListNode current = front; // inisialisasi current dengan nilai pertama
            while (size > 0) { // iterasi selama panjang list lebih dari 0
                end.next = new ListNode(current.data); // menambahkan nilai current ke akhir list
                current = current.next; // current menjadi current.next
                end = end.next; // end menjadi end.next
                size--; // panjang list dikurangi 1
            }
        }
    }

    // Exercise 9
    public void reverse() { // membalikkan list
        if (front != null) { // jika list tidak kosong
            ListNode current = front; // inisialisasi current dengan nilai pertama
            ListNode previous = null; // inisialisasi previous dengan null
            while (current != null) { // iterasi selama current tidak null
                ListNode next = current.next; // inisialisasi next dengan current.next
                current.next = previous; // current.next menjadi previous
                previous = current; // previous menjadi current
                current = next; // current menjadi next
            }
            front = previous; // front menjadi previous
        }
    }

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns the position of the first occurrence of the given
    //       value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current !=  null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    
    // post: Returns true if the list contains no elements
    public boolean isEmpty() {
        return front == null;
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
