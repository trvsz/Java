package Semester_2.Struktur_Data.Minggu_03;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.*;

public class prak02_22537141013 {
    public static void main(String[] args) {
        boolean loop = true; // Boolean untuk looping menu
        int jumlahArray = 100; // Jumlah array yang akan dibuat
        int i = 1; // Variabel untuk nomor data
        array data = new array(jumlahArray); // Membuat objek array
        Scanner ui = new Scanner(System.in); // Membuat objek scanner
        String nim, nama, cariData; // Variabel untuk input data
        double ipk; // Variabel untuk input data

        while (loop) {
            System.out.println("+------------MENU------------+");
            System.out.println("[ 1 ] Input Data");
            System.out.println("[ 2 ] Urutkan Data");
            System.out.println("[ 3 ] Cetak Data");
            System.out.println("[ 4 ] Cari Data");
            System.out.println("[ 5 ] Hapus Data");
            System.out.println("[ 6 ] Keluar");
            System.out.println("+----------------------------+");
            System.out.print("Pilih Menu: ");
            int pilih = ui.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Jumlah Data Mahasiswa: ");
                    int jumlahInput = ui.nextInt();
                    for (int j = 0; j < jumlahInput; j++) { // Looping untuk input data
                        System.out.println("Data ke-" + (i));
                        System.out.print("Masukkan NIM: ");
                        nim = ui.next();
                        System.out.print("Masukkan Nama: ");
                        nama = ui.next();
                        System.out.print("Masukkan IPK: ");
                        ipk = ui.nextDouble();
                        data.tambahData(nama, nim, ipk); // Memanggil method tambahData
                        i++;
                    }
                    break;
                case 2:
                    System.out.println("Urutkan Berdasarkan: ");
                    System.out.println("[ 1 ] NIM (Metode Selection Sort)");
                    System.out.println("[ 2 ] Nama (Metode Insertion Sort)");
                    System.out.println("[ 3 ] IPK (Metode Bubble Sort)");
                    System.out.print("Pilih Menu: ");
                    int pilihUrut = ui.nextInt(); // Pilihan untuk metode sorting
                    
                    switch (pilihUrut) { // Switch untuk memanggil method sorting
                        case 1:
                            data.selectionSort(); // Memanggil method selectionSort
                            System.out.println("Data Berhasil Diurutkan");
                            break;
                        case 2:
                            data.insertionSort(); // Memanggil method insertionSort
                            System.out.println("Data Berhasil Diurutkan");
                            break;
                        case 3:
                            data.bubbleSort(); // Memanggil method bubbleSort
                            System.out.println("Data Berhasil Diurutkan");
                            break;
                        default: // Jika pilihan tidak tersedia
                            System.out.println("Pilihan Tidak Tersedia");
                            break;
                    }
                    break;
                case 3:
                    data.tampilkanData(); // Memanggil method tampilkanData (Cetak Data)
                    break;
                case 4:
                    System.out.println("Cari Berdasarkan: ");
                    System.out.println("[ 1 ] NIM");
                    System.out.println("[ 2 ] Nama");
                    System.out.print("Pilih Menu: ");
                    int pilihCari = ui.nextInt(); // Pilihan untuk metode pencarian

                    switch (pilihCari) { // Switch untuk memanggil method pencarian
                        case 1:
                            System.out.print("Masukkan NIM: ");
                            cariData = ui.next(); // Input data yang akan dicari
                            boolean hasil = data.cariNim(cariData); // Memanggil method cariNim
                            if (hasil == true) { // Jika data ditemukan
                                System.out.println("Data Ditemukan");
                                System.out.println("Nama: " + data.nama());
                                System.out.println("NIM: " + data.nim());
                                System.out.println("IPK: " + data.ipk());
                            } else {
                                System.out.println("Data Tidak Ditemukan"); // Jika data tidak ditemukan
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan Nama: ");
                            cariData = ui.next(); // Input data yang akan dicari
                            hasil = data.cariNama(cariData); // Memanggil method cariNama
                            if (hasil) { // Jika data ditemukan
                                System.out.println("Data Ditemukan");
                                System.out.println("Nama: " + data.nama());
                                System.out.println("NIM: " + data.nim());
                                System.out.println("IPK: " + data.ipk());
                            } else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia"); // Jika pilihan tidak tersedia
                            break;
                    }
                    break;
                case 5:
                    System.out.println("NIM yang akan dihapus: ");
                    cariData = ui.next(); // Input data yang akan dihapus
                    boolean hasil = data.hapusData(cariData); // Memanggil method hapusData
                    if (hasil) { // Jika data ditemukan
                        System.out.println("Data Berhasil Dihapus");
                    } else {
                        System.out.println("Data Tidak Ditemukan");
                    }
                    break;
                case 6:
                    loop = false; // Looping berhenti
                    break;
                default:
                    break; // Jika pilihan tidak tersedia
            }
        }
    }
}

class mhsw {
    // Deklarasi variabel
    private String namaMhs;
    private String nimMhs;
    private double ipkMhs;

    public mhsw(String nama, String nim, double ipk) {
        // Inisialisasi variabel
        namaMhs = nama;
        nimMhs = nim;
        ipkMhs = ipk;
    }
    public void lihatData() { // Method untuk menampilkan data
        System.out.println(nimMhs + " + " + namaMhs + " + " + ipkMhs);
    }
    public String getNim() {
        return nimMhs; // Mengembalikan nilai nimMhs
    }
    public String getNama() {
        return namaMhs; // Mengembalikan nilai namaMhs
    }
    public double getIpk() {
        return ipkMhs; // Mengembalikan nilai ipkMhs
    }
}

class array {
    // Deklarasi variabel
    private mhsw[] data;
    private int jumlahData;
    private int i;

    public array(int max) {
        data = new mhsw[max]; // Inisialisasi array
        jumlahData = 0; // Inisialisasi jumlah data
    }
    public boolean cekNim(String nim) {
        boolean n = cariNim(nim); // Memanggil method cariNim sebagai acuan untuk mengecek data
        if (n == true) { // Jika data ditemukan
            return true; // Mengembalikan nilai true
        } else {
            return false; // Mengembalikan nilai false
        }
    }
    public boolean cariNim(String crnim) { // Method untuk mencari data berdasarkan nim
        for (i = 0; i < jumlahData; i++) { // Looping untuk mencari data
            if (data[i].getNim().equals(crnim)) { // Jika data ditemukan dan sama dengan data yang dicari
                break; // Looping berhenti
            }
        }
        if (i == jumlahData) { // Jika data tidak ditemukan
            return false; // Mengembalikan nilai false
        } else { // Jika data ditemukan
            return true; // Mengembalikan nilai true
        }
    }
    public boolean cariNama(String crnama) { // Method untuk mencari data berdasarkan nama
        for (i = 0; i < jumlahData; i++) { // Looping untuk mencari data
            if (data[i].getNama().equals(crnama)) { // Jika data ditemukan dan sama dengan data yang dicari
                break; // Looping berhenti
            }
        }
        if (i == jumlahData) { // Jika data tidak ditemukan
            return false; // Mengembalikan nilai false
        } else { // Jika data ditemukan
            return true; // Mengembalikan nilai true
        }
    }
    public void tambahData(String nama, String nim, double ipk) { // Method untuk menambah data
        boolean cek = cekNim(nim); // Memanggil method cekNim
        if (cek) { // Jika data sudah ada
            System.out.println("NIM sudah ada"); // Menampilkan pesan
        } else { // Jika data belum ada
            data[jumlahData] = new mhsw(nama, nim, ipk); // Menambah data
            jumlahData++; // Menambah jumlah data
        }
    }
    public void tampilkanData() {
        System.out.println("+----Data Mahasiswa----+");
        System.out.println("Nama\tNIM\tIPK");
        for (i = 0; i < jumlahData; i++) { // Looping untuk menampilkan data
            data[i].lihatData(); // Memanggil method lihatData
        }
        System.out.println("+----------------------+");
    }
    public String nim() { // Method untuk mengembalikan nilai nim
        return data[i].getNim(); // Mengembalikan nilai nim
    }
    public String nama() { // Method untuk mengembalikan nilai nama
        return data[i].getNama(); // Mengembalikan nilai nama
    }
    public double ipk() { // Method untuk mengembalikan nilai ipk
        return data[i].getIpk(); // Mengembalikan nilai ipk
    }
    public boolean hapusData(String hps) { // Method untuk menghapus data
        boolean cr = cariNim(hps); // Memanggil method cariNim sebagai acuan untuk menghapus data
        if (cr) { // Jika data ditemukan
            for (int j = i; j < jumlahData - 1; j++) { // Looping untuk menghapus data
                data[j] = data[j + 1]; // Menggeser data
            }
            jumlahData--; // Mengurangi jumlah data
            return true; // Mengembalikan nilai true
        } else { // Jika data tidak ditemukan
            return false; // Mengembalikan nilai false
        }
    }
    public void selectionSort() { // Method untuk mengurutkan data berdasarkan nim
        int posisi; // Deklarasi variabel
        mhsw temp; // Deklarasi variabel
        for (i = 0; i < jumlahData - 1; i++) { // Looping untuk mengurutkan data
            posisi = i; // Inisialisasi variabel
            for (int j = i + 1; j < jumlahData; j++) { // Looping untuk mencari data terkecil
                if (data[j].getNim().compareTo(data[posisi].getNim()) < 0) { // Jika data lebih kecil dari data terkecil
                    posisi = j; // Inisialisasi variabel
                }
            }
            if (posisi != i) { // Jika data terkecil tidak sama dengan data awal
                // Menukar data
                temp = data[i];
                data[i] = data[posisi];
                data[posisi] = temp;
            }
        }
        System.out.println("Data Mahasiswa telah diurutkan berdasarkan NIM");
    }
    public void insertionSort() { // Method untuk mengurutkan data berdasarkan nama
        mhsw temp; // Deklarasi variabel
        for (i = 1; i < jumlahData; i++) { // Looping untuk mengurutkan data
            // Memindahkan data
            temp = data[i];
            int j = i;
            while ((j > 0) && (data[j - 1].getNama().compareTo(temp.getNama()) > 0)) { // Looping untuk mencari posisi data
                data[j] = data[j - 1]; // Memindahkan data
                j--; // Mengurangi nilai j
            }
            data[j] = temp; // Memindahkan data
        }
        System.out.println("Data Mahasiswa telah diurutkan berdasarkan Nama");
    }
    public void bubbleSort() { // Method untuk mengurutkan data berdasarkan ipk
        mhsw temp; // Deklarasi variabel
        for (i = 0; i < jumlahData - 1; i++) { // Looping untuk mengurutkan data
            for (int j = 0; j < jumlahData - 1; j++) { // Looping untuk membandingkan data
                if (data[j].getIpk() > data[j + 1].getIpk()) { // Jika data lebih besar dari data berikutnya
                    // Menukar data
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Mahasiswa telah diurutkan berdasarkan IPK");
    }
}