package Semester_2.Struktur_Data.Minggu_07;

import java.util.Scanner;

class Node {
    public String Data1;
    public int Data2;
    public Node next;
    public Node previous;

    public Node(String dat1, int dat2) {
        Data1 = dat1;
        Data2 = dat2;
    }

    public void tanpilNode() {
        System.out.println("{" + Data1 + ", " + Data2 + "}");
    }
}

class DoubleLink {
    private Node first;
    private Node last;

    public DoubleLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(String dat1, int dat2) {
        Node newNode = new Node(dat1, dat2);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(String dat1, int dat2) {
        Node newNode = new Node(dat1, dat2);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(String key, String dat1, int dat2) {
        Node current = first;
        while (current.Data1 != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node(dat1, dat2);
        if (current == last) {
            newNode.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    // Menghapus data tertentu (tidak diawal maupun diakhir list)
    public Node hapus(String key) {
        Node current = first;
        while (current.Data1 != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.println(">> List Forward: ");
        Node current = first;
        while (current != null) {
            current.tanpilNode();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.println(">> List Backward: ");
        Node current = last;
        while (current != null) {
            current.tanpilNode();
            current = current.previous;
        }
        System.out.println("");
    }
}

public class prak06_22537141013 {
    public static void main(String[] args) {
        DoubleLink list = new DoubleLink();
        Scanner ui = new Scanner(System.in);
        while(true) {
            System.out.println("+--------MENU--------+");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert After");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Backward");
            System.out.println("9. Exit");
            System.out.println("+--------------------+");
            System.out.print(">> Pilihan: ");
            int pilihan = ui.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print(">> Masukkan data 1: ");
                    String data1 = ui.next();
                    System.out.print(">> Masukkan data 2: ");
                    int data2 = ui.nextInt();
                    list.insertFirst(data1, data2);
                    break;
                case 2:
                    System.out.print(">> Masukkan data 1: ");
                    String data3 = ui.next();
                    System.out.print(">> Masukkan data 2: ");
                    int data4 = ui.nextInt();
                    list.insertLast(data3, data4);
                    break;
                case 3:
                    System.out.print(">> Masukkan Indeks: ");
                    String key = ui.next();
                    System.out.print(">> Masukkan data 1: ");
                    String data5 = ui.next();
                    System.out.print(">> Masukkan data 2: ");
                    int data6 = ui.nextInt();
                    list.insertAfter(key, data5, data6);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.print(">> Masukkan Indeks: ");
                    String key2 = ui.next();
                    list.hapus(key2);
                    break;
                case 7:
                    list.displayForward();
                    break;
                case 8:
                    list.displayBackward();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("[!] Pilihan tidak ada");
                    break;
            }
        }
    }
}
