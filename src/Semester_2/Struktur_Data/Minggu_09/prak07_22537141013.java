import java.util.Scanner;

// Travis Zusa Zuve Saputra
// 22537141013

public class prak07_22537141013 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); //Membuat list dari class LinkedList
        Scanner ui = new Scanner(System.in); //Membuat ui dari Scanner

        while (true) { //Membuat perulangan menampilkan menu
            System.out.println("+-------------------+");
            System.out.println("|        Menu       |");
            System.out.println("+-------------------+");
            System.out.println("1. Insert Data");
            System.out.println("2. Insert Before");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print(">> Pilihan: ");
            int key = ui.nextInt(); //Membuat variabel key untuk menampung inputan dari ui
            switch (key) { //Membuat perulangan switch case untuk menampilkan menu
                case 1:
                    System.out.print("?? Banyak data yang ingin dimasukkan: ");
                    int banyakData = ui.nextInt();
                    for (int i = 0; i < banyakData; i++) {  //Membuat perulangan untuk memasukkan banyak data
                        System.out.print("[ Node ]" + ": ");
                        int data = ui.nextInt(); //Membuat variabel data untuk menampung inputan dari ui
                        list.insertData(data); //Memanggil method insertData dari class LinkedList
                    }
                    break;
                case 2:
                    System.out.print("?? Sebelum Data: ");
                    int data = ui.nextInt();
                    System.out.print("?? Nilai data yang ingin dimasukkan sebelum data " + data + ": ");
                    int dataBaru = ui.nextInt();
                    NodeData targetNode = new NodeData(data); //Membuat objek targetNode dari class NodeData
                    list.insertBefore(targetNode, dataBaru); //Memanggil method insertBefore dari class LinkedList
                    break;
                case 3:
                    list.displayList(); //Memanggil method displayList dari class LinkedList
                    break;
                case 4:
                    System.exit(0);
                    System.out.println(">> Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("!! Pilihan tidak tersedia");
                    break;
            }
        }
    }
}

class NodeData {
    public int newData; //Membuat variabel newData
    public NodeData next; //Membuat variabel next

    public NodeData(int newData) {
        this.newData = newData; //Menginisialisasi variabel newData
    }

    public void displayNode() {
        System.out.println("[ " + newData + " ]"); //Menampilkan data
    }
}

class LinkedList {
    public NodeData first;

    public void insertData(int newData) {
        NodeData newNode = new NodeData(newData); //Membuat objek newNode dari class NodeData
        if (first == null) { //Jika first kosong
            first = newNode; //Maka first akan diisi dengan newNode
        } else {
            NodeData currentNode = first; //Membuat objek currentNode dari class NodeData
            while (currentNode.next != null) { //Jika currentNode.next tidak kosong
                currentNode = currentNode.next; //Maka currentNode akan diisi dengan currentNode.next
            }
            currentNode.next = newNode; //Maka currentNode.next akan diisi dengan newNode
        }
    }

    public void insertBefore(NodeData targetNode, int newData) {
        NodeData newNode = new NodeData(newData); //Membuat objek newNode dari class NodeData
        NodeData prevNode = null; //Membuat objek prevNode dari class NodeData
        NodeData currentNode = first; //Membuat objek currentNode dari class NodeData
        
        while (currentNode != null && currentNode.newData != targetNode.newData) { //Jika currentNode tidak kosong dan currentNode.newData tidak sama dengan targetNode.newData
            prevNode = currentNode; //Maka prevNode akan diisi dengan currentNode
            currentNode = currentNode.next; //Maka currentNode akan diisi dengan currentNode.next
        }
        
        if (currentNode != null) { //Jika currentNode tidak kosong
            if (prevNode != null) { //Jika prevNode tidak kosong
                newNode.next = currentNode; //Maka newNode.next akan diisi dengan currentNode
                prevNode.next = newNode; //Maka prevNode.next akan diisi dengan newNode
            } else { //Jika prevNode kosong
                newNode.next = first; //Maka newNode.next akan diisi dengan first
                first = newNode; //Maka first akan diisi dengan newNode
            }
        } else { //Jika currentNode kosong
            System.out.println("!! Target node not found"); //Maka akan menampilkan pesan
        }
    }

    public void displayList() { //Method untuk menampilkan list
        System.out.println(">> List");
        NodeData currentNode = first; //Membuat objek currentNode dari class NodeData
        while (currentNode != null) { //Jika currentNode tidak kosong
            currentNode.displayNode(); //Memanggil method displayNode dari class NodeData
            currentNode = currentNode.next; //Maka currentNode akan diisi dengan currentNode.next
        }
    }
}