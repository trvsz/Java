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
                    for (int j = 0; j < jumlahInput; j++) {
                        System.out.println("Data ke-" + (i));
                        System.out.print("Masukkan NIM: ");
                        nim = ui.next();
                        System.out.print("Masukkan Nama: ");
                        nama = ui.next();
                        System.out.print("Masukkan IPK: ");
                        ipk = ui.nextDouble();
                        data.tambahData(nama, nim, ipk);
                        i++;
                    }
                    break;
                case 2:
                    System.out.println("Urutkan Berdasarkan: ");
                    System.out.println("[ 1 ] NIM (Metode Selection Sort)");
                    System.out.println("[ 2 ] Nama (Metode Insertion Sort)");
                    System.out.println("[ 3 ] IPK (Metode Bubble Sort)");
                    System.out.print("Pilih Menu: ");
                    int pilihUrut = ui.nextInt();
                    
                    switch (pilihUrut) {
                        case 1:
                            data.selectionSort();
                            System.out.println("Data Berhasil Diurutkan");
                            break;
                        case 2:
                            data.insertionSort();
                            System.out.println("Data Berhasil Diurutkan");
                            break;
                        case 3:
                            data.bubbleSort();
                            System.out.println("Data Berhasil Diurutkan");
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                            break;
                    }
                    break;
                case 3:
                    data.tampilkanData();
                    break;
                case 4:
                    System.out.println("Cari Berdasarkan: ");
                    System.out.println("[ 1 ] NIM");
                    System.out.println("[ 2 ] Nama");
                    System.out.print("Pilih Menu: ");
                    int pilihCari = ui.nextInt();

                    switch (pilihCari) {
                        case 1:
                            System.out.print("Masukkan NIM: ");
                            cariData = ui.next();
                            boolean hasil = data.cariNim(cariData);
                            if (hasil == true) {
                                System.out.println("Data Ditemukan");
                                System.out.println("Nama: " + data.nama());
                                System.out.println("NIM: " + data.nim());
                                System.out.println("IPK: " + data.ipk());
                            } else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan Nama: ");
                            cariData = ui.next();
                            hasil = data.cariNama(cariData);
                            if (hasil) {
                                System.out.println("Data Ditemukan");
                                System.out.println("Nama: " + data.nama());
                                System.out.println("NIM: " + data.nim());
                                System.out.println("IPK: " + data.ipk());
                            } else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("NIM yang akan dihapus: ");
                    cariData = ui.next();
                    boolean hasil = data.hapusData(cariData);
                    if (hasil) {
                        System.out.println("Data Berhasil Dihapus");
                    } else {
                        System.out.println("Data Tidak Ditemukan");
                    }
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}

class mhsw {
    private String namaMhs;
    private String nimMhs;
    private double ipkMhs;

    public mhsw(String nama, String nim, double ipk) {
        namaMhs = nama;
        nimMhs = nim;
        ipkMhs = ipk;
    }
    public void lihatData() {
        System.out.println(nimMhs + " + " + namaMhs + " + " + ipkMhs);
    }
    public String getNim() {
        return nimMhs;
    }
    public String getNama() {
        return namaMhs;
    }
    public double getIpk() {
        return ipkMhs;
    }
}

class array {
    private mhsw[] data;
    private int jumlahData;
    private int i;

    public array(int max) {
        data = new mhsw[max];
        jumlahData = 0;
    }
    public boolean cekNim(String nim) {
        boolean n = cariNim(nim);
        if (n == true) {
            return true;
        } else {
            return false;
        }
    }
    public boolean cariNim(String crnim) {
        for (i = 0; i < jumlahData; i++) {
            if (data[i].getNim().equals(crnim)) {
                break;
            }
        }
        if (i == jumlahData) {
            return false;
        } else {
            return true;
        }
    }
    public boolean cariNama(String crnama) {
        for (i = 0; i < jumlahData; i++) {
            if (data[i].getNama().equals(crnama)) {
                break;
            }
        }
        if (i == jumlahData) {
            return false;
        } else {
            return true;
        }
    }
    public void tambahData(String nama, String nim, double ipk) {
        boolean cek = cekNim(nim);
        if (cek) {
            System.out.println("NIM sudah ada");
        } else {
            data[jumlahData] = new mhsw(nama, nim, ipk);
            jumlahData++;
        }
    }
    public void tampilkanData() {
        System.out.println("+----Data Mahasiswa----+");
        System.out.println("Nama\tNIM\tIPK");
        for (i = 0; i < jumlahData; i++) {
            data[i].lihatData();
        }
        System.out.println("+----------------------+");
    }
    public String nim() {
        return data[i].getNim();
    }
    public String nama() {
        return data[i].getNama();
    }
    public double ipk() {
        return data[i].getIpk();
    }
    public boolean hapusData(String hps) {
        boolean cr = cariNim(hps);
        if (cr) {
            for (int j = i; j < jumlahData - 1; j++) {
                data[j] = data[j + 1];
            }
            jumlahData--;
            return true;
        } else {
            return false;
        }
    }
    public void selectionSort() {
        int posisi;
        mhsw temp;
        for (i = 0; i < jumlahData - 1; i++) {
            posisi = i;
            for (int j = i + 1; j < jumlahData; j++) {
                if (data[j].getNim().compareTo(data[posisi].getNim()) < 0) {
                    posisi = j;
                }
            }
            if (posisi != i) {
                temp = data[i];
                data[i] = data[posisi];
                data[posisi] = temp;
            }
        }
        System.out.println("Data Mahasiswa telah diurutkan berdasarkan NIM");
    }
    public void insertionSort() {
        mhsw temp;
        for (i = 1; i < jumlahData; i++) {
            temp = data[i];
            int j = i;
            while ((j > 0) && (data[j - 1].getNama().compareTo(temp.getNama()) > 0)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
        System.out.println("Data Mahasiswa telah diurutkan berdasarkan Nama");
    }
    public void bubbleSort() {
        mhsw temp;
        for (i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - 1; j++) {
                if (data[j].getIpk() > data[j + 1].getIpk()) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Mahasiswa telah diurutkan berdasarkan IPK");
    }
}