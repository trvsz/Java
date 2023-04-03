package Semester_2.Struktur_Data.Minggu_06;
/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class prak04_225371410132 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in); // Scanner untuk input user
        LinkListMahasiswa theList = new LinkListMahasiswa(); // Membuat objek LinkList
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
                            theList.insertSortByNim(nimMhs, namaMhs, kotaMhs); // Memanggil method insertSortByNim
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

class NodeMahasiswa {
    public String nama;
    public String nim;
    public String kota;
    public long time;
    public NodeMahasiswa next;
    public NodeMahasiswa(String nimMhs, String namaMhs, String kotaMhs) {
        nim = nimMhs;
        nama = namaMhs;
        kota = kotaMhs;
        this.time = System.currentTimeMillis();
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
    public long getTime() {
        return time;
    }
}

class LinkListMahasiswa {
    private NodeMahasiswa first; // Referensi ke item pertama
    private NodeMahasiswa lastDeleted;
    public LinkListMahasiswa() { // Constructor
        first = null; // Tidak ada item
    }
    public boolean isEmpty() { // True jika list kosong
        return (first == null);
    }
    public void insertSortByNim (String nimMhs, String namaMhs, String kotaMhs) { // Menambah item berdasarkan NIM
        NodeMahasiswa newNode = new NodeMahasiswa(nimMhs, namaMhs, kotaMhs); // Membuat node baru
        NodeMahasiswa current = first; // Membuat referensi ke item pertama
        NodeMahasiswa previous = null; // Membuat referensi ke item sebelumnya
        NodeMahasiswa lastAdded = null; // Menambah variabel untuk menampung node terakhir yang ditambahkan
        while (current != null && nimMhs.compareTo(current.getNim()) > 0) { // Selama tidak di akhir list dan NIM baru lebih besar dari NIM yang ada
            previous = current; // previous --> current
            current = current.next; // current --> current.next
        }
        if (previous == null) { // Jika di awal list
            first = newNode; // first --> newNode
        } else { // Jika di tengah list
            previous.next = newNode; // previous.next --> newNode
        }
        newNode.next = current; // newNode --> current
        lastAdded = newNode; // Menyimpan referensi ke node terakhir yang ditambahkan
        System.out.println(">> Data Berhasil Ditambahkan");
    }
    public void deleteLastAdd() { // Menghapus item yang terakhir kali ditambahkan
        NodeMahasiswa current = first;
        NodeMahasiswa previous = null;
        NodeMahasiswa lastAdded = null;
        while (current != null) {
            if (lastAdded == null || current.getTime() > lastAdded.getTime()) {
                previous = lastAdded;
                lastAdded = current;
            }
            current = current.next;
        }
        if (lastAdded != null) {
            if (previous == null) {
                first = first.next;
            } else if (lastAdded.next == null) { // tambahan kondisi disini
                    previous.next = null;
            } else {
                previous.next = lastAdded.next;
            }
            lastDeleted = lastAdded; // Menyimpan referensi ke node terakhir yang dihapus
            System.out.println(">> Data Berhasil Dihapus");
        } else {
            System.out.println(">> Tidak ada data yang dihapus");
        }
    }
    
    public void displayList() { // Menampilkan list
        System.out.println("+------------------+");
        System.out.println("|  List Mahasiswa  |");
        System.out.println("+------------------+");
        NodeMahasiswa current = first; // Membuat referensi ke item pertama
        while (current != null) { // Selama tidak di akhir list
            if (current != lastDeleted) { // hanya tampilkan node jika tidak sama dengan node terakhir yang dihapus
                current.displayNode(); // Menampilkan data
            }
            current = current.next; // Menggeser ke item berikutnya
        }
    }
    public boolean checkNim(String nimMhs) { // Mengecek NIM
        NodeMahasiswa current = first; // Membuat referensi ke item pertama
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
        NodeMahasiswa current = first; // Membuat referensi ke item pertama
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
        NodeMahasiswa current = first; // Membuat referensi ke item pertama
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
        NodeMahasiswa current = first; // Membuat referensi ke item pertama
        boolean found = false; // Mengecek apakah data ditemukan
        while (current != null) { // Selama tidak di akhir list
            if (current.getKota().equalsIgnoreCase(kotaSearch)) { // Jika Kota sama
                if (!found) { // Jika data ditemukan
                    System.out.println(">> Data yang sesuai:");
                    found = true; // Maka data ditemukan
                }
                current.displayNode(); // Menampilkan data
            }
            current = current.next; // Menggeser ke item berikutnya
        }
        if (!found) { // Jika tidak ada data yang ditemukan
            System.out.println(">> Data TTIDAK ditemukan");
        }
    }
}