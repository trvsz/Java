package Semester_2.Pemrograman.Tugas_Akhir.Chap15_ImplementingCollection;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

// Class ArrayIntList can be used to store a list of integers.
// Client -> PracticeIt

import java.util.*;

public class ArrayIntList {
    private int[] elementData;   // list of integers
    private int size;            // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 10;

    // Exercise 1
    public void mystery() {
        int n = 0;
        for (int i = 0; i < size; i++) {
            n += elementData[i] * i;
        }
        elementData[size] = n;
        size++;
    }
    /*
     * Output:
     * List = [14, 3, 6, 2, 21]
     * Size = 5
     */

    // Exercise 2
    public Boolean isPairwiseSorted () {
        int runs = size / 2;
        for (int i = 0; i < runs; i++) {
            if (elementData[i * 2] > elementData[i * 2 + 1]) {
                return false;
            }
        }
        return true;
    }
    /*
     * Output:
     * [3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42]
     * true
     * [1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4]
     * false
     */

    // Exercise 3
    public ArrayIntList runningTotal () {
        ArrayIntList result = new ArrayIntList();
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += elementData[i];
            result.add(total);
        }
        return result;
    }
    /*
     * Output:
     * [2, 3, 5, 4, 7, 15, 20, 7]
     * [2, 5, 10, 14, 21, 36, 56, 63]
     * 
     * [42]
     * [42]
     */

    // Exercise 4
    public void removeFront (int num) {
        for (int i = 0; i < num; i++) {
            elementData[i] = elementData[i + num];
        }
        size -= num;
    }
    /*
     * Output:
     * [8, 17, 9, 24, 42, 3, 8], remove 4
     * [42, 3, 8]
     */

    // Exercise 5
    public void removeAll (int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                remove(i);
                i--;
            }
        }
    }
    /*
     * Output:
     * [1, 2, 3, 4] removeAll(3)
     * [1, 2, 4]
     * size: 3
     * 
     * [1, 2, 1, 2, 2, 1, 2] removeAll(2)
     * [1, 1, 1]
     * size: 3
     */

    // Exercise 6
    public void stretch (int n) {
        if (n <= 0) {
            clear();
        } else {
            int oldSize = size;
            for (int i = 0; i < oldSize; i++) {
                for (int j = 1; j < n; j++) {
                    add(n * i + j, elementData[n * i]);
                }
            }
        }
    }
    /*
     * Output:
     * [42] x 10
     * [42, 42, 42, 42, 42, 42, 42, 42, 42, 42]
     * 
     * [18, 7, 4, 24, 11] x 3
     * [18, 18, 18, 7, 7, 7, 4, 4, 4, 24, 24, 24, 11, 11, 11]
     */

    // Exercise 7
    public int longestSortedSequence() {
        if (size == 0) {
            return 0;
        }
        int longest = 1;
        int current = 1;
        for (int i = 1; i < size; i++) {
            if (elementData[i] >= elementData[i - 1]) {
                current++;
            } else {
                if (current > longest) {
                    longest = current;
                }
                current = 1;
            }
        }
        return Math.max(longest, current);
    }
    /*
     * Output:
     * [1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17]
     * 4
     */

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value) {
        ensureCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre : size() < capacity (throws IllegalStateException if not) &&
    //       0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre: size() + other.size() <= capacity (throws IllegalStateException
    //      if not)
    // post: appends all values in the given list to the end of this list
    public void addAll(ArrayIntList other) {
        ensureCapacity(size + other.size);
        for (int i = 0; i < other.size; i++) {
            add(other.elementData[i]);
        }
    }

    // post: list is empty
    public void clear() {
        size = 0;
    }

    // post: returns true if the given value is contained in the list,
    //       false otherwise
    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    // post: ensures that the underlying array has the given capacity; if not,
    //       the size is doubled (or more if given capacity is even larger)
    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the integer at the given index with the given value
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
