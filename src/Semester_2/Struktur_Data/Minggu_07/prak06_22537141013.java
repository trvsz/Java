import java.util.Scanner;

// Travis Zusa Zuve Saputra
// 22537141013

class Node {
    public String Data1; //Membuat variabel Data1
    public int Data2; //Membuat variabel Data2
    public Node next; //Membuat variabel next
    public Node previous; //Membuat variabel previous

    public Node(String dat1, int dat2) { //Membuat constructor Node
        Data1 = dat1; //Menginisialisasi variabel Data1
        Data2 = dat2; //Menginisialisasi variabel Data2
    }

    public void tanpilNode() { //Membuat method tanpilNode
        System.out.println("{" + Data1 + ", " + Data2 + "}"); //Menampilkan data
    }
}

class DoubleLink { //Membuat class DoubleLink
    private Node first; //Membuat variabel first dan last
    private Node last; //Membuat variabel first dan last

    public DoubleLink() { //Membuat constructor DoubleLink
        first = null; //Menginisialisasi variabel first dan last
        last = null; 
    }

    public boolean isEmpty() {  //Membuat method isEmpty
        return first == null; //Mengembalikan nilai true jika first kosong
    } 

    public void insertFirst(String dat1, int dat2) { //Membuat method insertFirst
        Node newNode = new Node(dat1, dat2); //Membuat objek newNode dari class Node
        if (isEmpty()) { //Jika first kosong
            last = newNode; //Maka last akan diisi dengan newNode
        } else { //Jika first tidak kosong
            first.previous = newNode; //Maka first.previous akan diisi dengan newNode
        } 
        newNode.next = first; //Maka newNode.next akan diisi dengan first
        first = newNode; //Maka first akan diisi dengan newNode
    }

    public void insertLast(String dat1, int dat2) { //Membuat method insertLast
        Node newNode = new Node(dat1, dat2); //Membuat objek newNode dari class Node
        if (isEmpty()) { //Jika first kosong
            first = newNode; //Maka first akan diisi dengan newNode
        } else { //Jika first tidak kosong
            last.next = newNode; //Maka last.next akan diisi dengan newNode
            newNode.previous = last; //Maka newNode.previous akan diisi dengan last
        } 
        last = newNode; //Maka last akan diisi dengan newNode
    }

    public Node deleteFirst() { //Membuat method deleteFirst
        Node temp = first; //Membuat objek temp dari class Node
        if (first.next == null) { //Jika first.next kosong
            last = null; //Maka last akan diisi dengan null
        } else { //Jika first.next tidak kosong
            first.next.previous = null; //Maka first.next.previous akan diisi dengan null
        }
        first = first.next; //Maka first akan diisi dengan first.next
        return temp; //Mengembalikan nilai temp
    }

    public Node deleteLast() { //Membuat method deleteLast
        Node temp = last; //Membuat objek temp dari class Node
        if (first.next == null) { //Jika first.next kosong
            first = null; //Maka first akan diisi dengan null
        } else { //Jika first.next tidak kosong
            last.previous.next = null; //Maka last.previous.next akan diisi dengan null
        }
        last = last.previous; //Maka last akan diisi dengan last.previous
        return temp; //Mengembalikan nilai temp
    }

    public boolean insertAfter(String key, String dat1, int dat2) { //Membuat method insertAfter
        Node current = first; //Membuat objek current dari class Node
        while (current != null && !current.Data1.equals(key)) { //Jika current.Data1 tidak sama dengan key
            current = current.next; //Maka current akan diisi dengan current.next
        }
        if (current == null) { //Jika current kosong
            return false; //Maka akan mengembalikan nilai false
        }
        Node newNode = new Node(dat1, dat2); //Membuat objek newNode dari class Node
        if (current == last) { //Jika current sama dengan last
            newNode.next = null; //Maka newNode.next akan diisi dengan null
            last = newNode; //Maka last akan diisi dengan newNode
        } else { //Jika current tidak sama dengan last
            newNode.next = current.next; //Maka newNode.next akan diisi dengan current.next
            current.next.previous = newNode; //Maka current.next.previous akan diisi dengan newNode
        }
        newNode.previous = current; //Maka newNode.previous akan diisi dengan current
        current.next = newNode; //Maka current.next akan diisi dengan newNode
        return true; //Mengembalikan nilai true
    }

    public Node hapus(String key) { //Membuat method hapus
        Node current = first; //Membuat objek current dari class Node
        while (current != null && !current.Data1.equals(key)) { //Jika current.Data1 tidak sama dengan key
            current = current.next; //Maka current akan diisi dengan current.next
            if (current == null) { //Jika current kosong
                return null; //Maka akan mengembalikan nilai null
            }
        }
        if (current == first) { //Jika current sama dengan first
            first = current.next; //Maka first akan diisi dengan current.next
        } else { //Jika current tidak sama dengan first
            current.previous.next = current.next; //Maka current.previous.next akan diisi dengan current.next
        }
        if (current == last) { //Jika current sama dengan last
            last = current.previous; //Maka last akan diisi dengan current.previous
        } else { //Jika current tidak sama dengan last
            current.next.previous = current.previous; //Maka current.next.previous akan diisi dengan current.previous
        }
        return current; //Mengembalikan nilai current
    }

    public void displayForward() { //Membuat method displayForward
        System.out.println(">> List Forward: ");
        Node current = first; //Membuat objek current dari class Node
        while (current != null) { //Jika current tidak sama dengan null
            current.tanpilNode(); //Maka akan menampilkan current
            current = current.next; //Maka current akan diisi dengan current.next
        }
    }

    public void displayBackward() { //Membuat method displayBackward
        System.out.println(">> List Backward: ");
        Node current = last; //Membuat objek current dari class Node
        while (current != null) { //Jika current tidak sama dengan null
            current.tanpilNode(); //Maka akan menampilkan current
            current = current.previous; //Maka current akan diisi dengan current.previous
        }
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
                    System.out.print(">> Masukkan Nama Mahasiswa: ");
                    String data1 = ui.next();
                    System.out.print(">> Masukkan NIM Mahasiswa: ");
                    int data2 = ui.nextInt();
                    list.insertFirst(data1, data2); //Memanggil method insertFirst
                    break;
                case 2:
                    System.out.print(">> Masukkan Nama Mahasiswa: ");
                    String data3 = ui.next();
                    System.out.print(">> Masukkan NIM Mahasiswa: ");
                    int data4 = ui.nextInt();
                    list.insertLast(data3, data4); //Memanggil method insertLast
                    break;
                case 3:
                    System.out.print("?? Setelah Nama: ");
                    String key = ui.next();
                    System.out.print(">> Masukkan Nama Mahasiswa: ");
                    String data5 = ui.next();
                    System.out.print(">> Masukkan NIM Mahasiswa: ");
                    int data6 = ui.nextInt();
                    // list.insertAfter(key, data5, data6); //Memanggil method insertAfter
                    if (!list.insertAfter(key, data5, data6)) {
                        System.out.println("!! Node dengan nama " + key + " tidak ditemukan.");
                    } else {
                        System.out.println(">> Node berhasil ditambahkan setelah node dengan nama " + key);
                    }
                    break;
                case 4:
                    list.deleteFirst(); //Memanggil method deleteFirst
                    break; 
                case 5:
                    list.deleteLast(); //Memanggil method deleteLast
                    break;
                case 6:
                    System.out.print("?? Nama yang ingin dihapus: ");
                    String key2 = ui.next();
                    list.hapus(key2); //Memanggil method hapus
                    break;
                case 7:
                    list.displayForward(); //Memanggil method displayForward
                    break;
                case 8:
                    list.displayBackward(); //Memanggil method displayBackward
                    break;
                case 9:
                    System.out.println("!! Program Selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("!! Pilihan tidak ada");
                    break;
            }
        }
    }
}
