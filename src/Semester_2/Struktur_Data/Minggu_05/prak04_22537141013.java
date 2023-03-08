package Semester_2.Struktur_Data.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class prak04_22537141013 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in); // Scanner untuk input user
        LinkList theList = new LinkList(); // Membuat objek LinkList
        while (true) { // Looping menu
            System.out.println("+------------------+");
            System.out.println("|  Menu Mahasiswa  |");
            System.out.println("+------------------+");
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. Print List");
            System.out.println("3. Delete Last Add");
            System.out.println("4. Search Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choose = ui.nextInt(); // Input pilihan menu
            switch (choose) { // Switch case untuk pilihan menu
                case 1:
                    Scanner m = new Scanner(System.in); // Scanner untuk input user
                    System.out.println("+------------------+");
                    System.out.println("|  Add Mahasiswa   |");
                    System.out.println("+------------------+");
                    System.out.print("Berapa Mahasiswa yang ingin ditambahkan? ");
                    int banyak = m.nextInt();
                    for (int i = 0; i < banyak; i++) {
                        Scanner a = new Scanner(System.in); // Scanner untuk input user
                        System.out.print("[ "+ (i + 1) + " ] NIM: ");
                        String nimMhs = a.nextLine(); // Input NIM
                        System.out.print("[ " + (i + 1) + " ] Nama: ");
                        String namaMhs = a.nextLine(); // Input Nama
                        System.out.print("[ " + (i + 1) + " ] Kota: ");
                        String kotaMhs = a.nextLine(); // Input Kota
                        if(theList.checkNim(nimMhs)) { // Memanggil method checkNim
                            System.out.println(">> NIM sudah ada!");
                            i--; // Mengurangi i agar tidak terjadi looping
                        } else {
                            theList.insertFirst(nimMhs, namaMhs, kotaMhs); // Memanggil method insertFirst
                        }
                    }
                    break;
                case 2:
                    theList.displayList(); // Memanggil method displayList
                    break;
                case 3:
                    
                    theList.deleteLastAdd(); // Memanggil method deleteLastAdd
                    break;
                case 4:
                    Scanner n = new Scanner(System.in);
                    System.out.println("+------------------+");
                    System.out.println("| Search Mahasiswa |");
                    System.out.println("+------------------+");
                    System.out.println("1. Search by NIM");
                    System.out.println("2. Search by Nama");
                    System.out.println("3. Search by Kota");
                    System.out.print("Choose: ");
                    int pilih = n.nextInt();
                    switch (pilih) {
                        case 1:
                            Scanner o = new Scanner(System.in);
                            System.out.print("NIM: ");
                            String nimSearch = o.nextLine(); // Input NIM yang ingin dicari
                            theList.searchNim(nimSearch); // Memanggil method searchNim
                            break;
                        case 2:
                            Scanner p = new Scanner(System.in);
                            System.out.print("Nama: ");
                            String namaSearch = p.nextLine(); // Input Nama yang ingin dicari
                            theList.searchNama(namaSearch); // Memanggil method searchNama
                            break;
                        case 3:
                            Scanner q = new Scanner(System.in);
                            System.out.print("Kota: ");
                            String kotaSearch = q.nextLine(); // Input Kota yang ingin dicari
                            theList.searchKota(kotaSearch); // Memanggil method searchKota
                            break;
                        default:
                            System.out.println("!! Wrong Input !!");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Thank You!");
                    System.exit(0); // Keluar dari program
                    break;
                default: // Jika input tidak sesuai
                    System.out.println("!! Wrong Input !!");
                    break;
            }
        }
    }
}

class NodeMhs {
    public String nama;
    public String nim;
    public String kota;
    public NodeMhs next;
    public NodeMhs(String nimMhs, String namaMhs, String kotaMhs) {
        nim = nimMhs;
        nama = namaMhs;
        kota = kotaMhs;
    }
    public String getNim() { // Getter NIM
        return nim;
    }
    public String getNama() { // Getter Nama
        return nama;
    }
    public String getKota() { // Getter Kota
        return kota;
    }
    public void displayNode() {
        System.out.println("[ + ] NIM: " + nim + ", Nama: " + nama + ", Kota: " + kota);
    }
}

class LinkList {
    private NodeMhs first; // Referensi ke item pertama
    public LinkList() { // Constructor
        first = null; // Tidak ada item
    }
    public boolean isEmpty() { // True jika list kosong
        return (first == null);
    }
    public void insertFirst(String nimMhs, String namaMhs, String kotaMhs) { // Menambah item di awal list
        NodeMhs newNode = new NodeMhs(nimMhs, namaMhs, kotaMhs); // Membuat node baru
        newNode.next = first; 
        first = newNode; // first sekarang merujuk ke node baru
    }
    public void addMahasiswa (LinkList theList) { // Menambah mahasiswa
        Scanner n = new Scanner(System.in);
        System.out.print("NIM: ");
        String nimMhs = n.nextLine();
        System.out.print("Nama: ");
        String namaMhs = n.nextLine();
        System.out.print("Kota: ");
        String kotaMhs = n.nextLine();
        theList.insertFirst(nimMhs, namaMhs, kotaMhs); // Memanggil method insertFirst
    }
    public NodeMhs deleteLastAdd() { // Menghapus item terakhir
        NodeMhs temp = first; // Menyimpan referensi ke item pertama
        first = first.next; // Menghapus item pertama
        System.out.println(">> Data Terakhir Ditambahkan Berhasil Dihapus");
        return temp; // Mengembalikan referensi yang dihapus
    }
    public void displayList() { // Menampilkan list
        System.out.println("+------------------+");
        System.out.println("|  List Mahasiswa  |");
        System.out.println("+------------------+");
        NodeMhs current = first; // Membuat referensi ke item pertama
        while (current != null) { // Selama tidak di akhir list
            current.displayNode(); // Menampilkan data
            current = current.next; // Menggeser ke item berikutnya
        }
    }
    public boolean checkNim(String nimMhs) { // Mengecek NIM
        NodeMhs current = first; // Membuat referensi ke item pertama
        while (current != null) { // Selama tidak di akhir list
            if (current.getNim().equals(nimMhs)) { // Jika NIM sama
                return true; // Maka return true
            } else { // Jika tidak
                current = current.next; // Menggeser ke item berikutnya
            }
        }
        return false; // Jika tidak ada NIM yang sama, maka return false
    }
    public void searchNim(String nimSearch) { // Mencari NIM
        NodeMhs current = first; // Membuat referensi ke item pertama
        while (current != null) { // Selama tidak di akhir list
            if (current.getNim().equals(nimSearch)) { // Jika NIM sama
                System.out.println(">> Data Ditemukan");
                current.displayNode(); // Menampilkan data
                break;
            } else { // Jika tidak
                current = current.next; // Menggeser ke item berikutnya
            }
        }
        if (current == null) { // Jika tidak ada NIM yang sama
            System.out.println(">> Data TIDAK Ditemukan");
        }
    }
    public void searchNama(String namaSearch) { // Mencari Nama
        NodeMhs current = first; // Membuat referensi ke item pertama
        while (current != null) { // Selama tidak di akhir list
            if (current.getNama().equals(namaSearch)) { // Jika Nama sama
                System.out.println(">> Data ditemukan");
                current.displayNode(); // Menampilkan data
                break;
            } else {
                current = current.next; // Menggeser ke item berikutnya
            }
        }
        if (current == null) { // Jika tidak ada Nama yang sama
            System.out.println(">> Data TTIDAK ditemukan");
        }
    }
    public void searchKota(String kotaSearch) { // Mencari Kota
        NodeMhs current = first; // Membuat referensi ke item pertama
        boolean found = false; // Mengecek apakah data ditemukan
        while (current != null) { // Selama tidak di akhir list
            if (current.getKota().equalsIgnoreCase(kotaSearch)) { // Jika Kota sama
                if (!found) { // Jika data ditemukan
                    System.out.println("Data yang sesuai:");
                    found = true; // Maka data ditemukan
                }
                current.displayNode(); // Menampilkan data
            }
            current = current.next; // Menggeser ke item berikutnya
        }
        if (!found) { // Jika tidak ada data yang ditemukan
            System.out.println("Tidak ada data yang ditemukan.");
        }
    }
}