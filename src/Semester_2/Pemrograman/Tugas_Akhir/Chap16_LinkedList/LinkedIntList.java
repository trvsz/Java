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
    public int min() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        int min = front.data;
        ListNode current = front.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    // Exercise 5
    public Boolean hasTwoConsecutive() {
        if (front == null) {
            return false;
        }
        ListNode current = front;
        while (current.next != null) {
            if (current.data + 1 == current.next.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Exercise 6
    public int deleteBack() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        int result;
        if (front.next == null) {
            result = front.data;
            front = null;
        } else {
            ListNode current = front;
            while (current.next.next != null) {
                current = current.next;
            }
            result = current.next.data;
            current.next = null;
        }
        return result;
    }

    // Exercise 7
    public int removeAll(int value) {
        int count = 0;
        while (front != null && front.data == value) {
            front = front.next;
            count++;
        }
        if (front == null) {
            return count;
        }
        ListNode current = front;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                count++;
            } else {
                current = current.next;
            }
        }
        return count;
    }

    // Exercise 8
    public void doubleList() {
        if (front != null) {
            ListNode end = front;
            int size = 1;
            while (end.next != null) {
                end = end.next;
                size++;
            }
            ListNode current = front;
            while (size > 0) {
                end.next = new ListNode(current.data);
                current = current.next;
                end = end.next;
                size--;
            }
        }
    }

    // Exercise 9
    public void reverse() {
        if (front != null) {
            ListNode current = front;
            ListNode previous = null;
            while (current != null) {
                ListNode next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            front = previous;
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
