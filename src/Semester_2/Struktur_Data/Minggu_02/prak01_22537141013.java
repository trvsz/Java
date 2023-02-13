package Semester_2.Struktur_Data.Minggu_02;

/*
 * Nama: Travis Zusa Zuve Saputra
 * NIM : 22537141013
 */

import java.util.Scanner;

public class prak01_22537141013 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] arr = new int[100]; // Array sejumlah 100 indeks
        int jumlahData = 0; // Parameter jumlah data semula 0
        int[] index = new int [100]; // Array penyimpanan alamat indeks
        int jumlahDitemukan = 0; // Parameter jumlah ditemukannya sebuah data

        // Perulangan Menu untuk digunakan kembali hingga program dinyatakan selesai
        while (true) {
            System.out.println("+------------MENU------------+");
            System.out.println("[ 1 ] - Memasukkan Data");
            System.out.println("[ 2 ] - Urutkan Data");
            System.out.println("[ 3 ] - Cetak Data");
            System.out.println("[ 4 ] - Cari dan Hapus Data");
            System.out.println("[ 5 ] - Keluar/Akhiri Program");
            System.out.println("+----------------------------+");
            System.out.print(">> Pilih Menu: ");
            int menu = ui.nextInt();

            switch (menu) { // Input menu dari user input digunakan untuk memilih case yang sesuai (telah diberi value sama dengan menu)
                
                // Menu untuk menginput data
                case 1:   
                    System.out.print(">> Jumlah Data: ");
                    int n = ui.nextInt(); // Menggunakan scanner sebagai penentu jumlah data yang akan diinputkan
                    
                    for (int i = 0; i < n; i++) { // Repetisi untuk penginputan data sejumlah input
                        System.out.print("[+] Data ke-" + jumlahData + ": "); 
                        arr[jumlahData] = ui.nextInt(); // Array menyimpan sejumlah input user
                        jumlahData++; 
                    }
                    
                    System.out.println(); // Enter sebagai mempercantik tampilan
                    break; // Break digunakan untuk mengakhiri sesi pada case ini dan kembali pada while
                
                // Menu untuk mengurutkan data
                case 2:
                    int temp; // Deklarasi untuk penyimpanan sementara
                    
                    for (int i = 0; i < jumlahData; i++) { // Loop sampai se-jumlahData
                        for (int j = i + 1; j < jumlahData; j++) { // Loop jika arr[i] > arr[j] maka akan ditukar menggunakan variabel temp
                            if (arr[i] > arr[j]) { 
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    
                    System.out.println(">> Data Telah Diurutkan <<"); // Setelah komputasi selesai, program akan mencetak kalimat tersebut
                    System.out.println();
                    break; // Break digunakan agar memisahkan antar case untuk tidak melanjutkan komputasi secara otomatis

                // Menu untuk mencetak array input user
                case 3:
                    System.out.println(">> Data yang telah diinputkan:");
                    
                    for (int i = 0; i < jumlahData; i++) { // Perulangan kode untuk mencetak indeks ke- sesuai indeks nya
                        System.out.println("Data ke-" + i + ": " + arr[i]); // Indeks dimulai dari 0 dan menampilkan indeks ke-0 di array tersebut
                    }
                    
                    System.out.println();
                    break;
                
                // Menu untuk mencari serta menghapus data dalam dua metode
                case 4:
                    System.out.print(">> Nilai data yang dihapus: ");
                    int hapus = ui.nextInt(); // Input dari user untuk digunakan; nilai berapa yang ingin dihapus
                    boolean found = false; // Boolean digunakan sebagai pengganti jumlahData dalam persyaratan if()
                    
                    for (int i = 0; i < jumlahData; i++) { // Perulangan sejumlah data yang ada
                        if (arr[i] == hapus) { // Pengecekan apakah elemen saat ini (arr[i]) sama dengan input user (hapus)
                            jumlahDitemukan++; // Variabel jumlahDitemukan bertambah 1
                            index[jumlahDitemukan] = i; // Menyimpan indeks jumlahDitemukan ke dalam array index[]
                            found = true; // Mengubah nilai boolean found menjadi true
                        }
                    }
                    
                    if (found) { // Jika boolean found true, program ini akan dijalankan
                        System.out.println();
                        System.out.println("+-----METODE PENGHAPUSAN-----+");
                        System.out.println("[ 1 ] - Index");
                        System.out.println("[ 2 ] - Nilai Data");
                        System.out.println("+----------------------------+");
                        System.out.print("Metode yang ingin digunakan: ");
                        int metode = ui.nextInt(); // Input muser untuk memilih program atau cara menghapus nilai dalam array
                        
                        switch (metode) {
                            
                            // Menu penghapusan dengan menghapus berdasar indeks atau alamat letak nilai tersebut berada di array
                            case 1:
                                for (int i = 1; i <= jumlahDitemukan; i++) { // Perulangan dengan awalan menghasilkan output hingga menyamai elemen jumlahDitemukan
                                    System.out.println("[+] Data telah ditemukan di indeks ke-" + index[i]); // Pencetakan letak alamat nilai pada array alamat (index[])
                                }

                                System.out.print("Indeks ke- yang ingin dihapus? ");
                                int hapus_index = ui.nextInt(); // Input user untuk memilih indeks ke- berapa yang akan dihapus
                                if (hapus_index >= 0 && hapus_index < jumlahData) { // Cek apakah input user adlaah lebih dari 0 dan kurang dari elemen jumlahData
                                    for (int i = hapus_index; i < jumlahData - 1; i++) { // Perulangan untuk menggeser elemen array ke posisi sebelumnya
                                        arr[i] = arr[i + 1]; // Elemen akan menempati posisi elemen atau nilai yang dihapus
                                    }
                                    jumlahData--; // Mengurangi jumlahData sebanyak 1 untuk menandakan bahwa penghapusan telah berhasil
                                    System.out.println(">> Data berhasil dihapus <<"); // Pencetakan tulisan berhasil jika kode berhasil dijalankan
                                } else { // Jika tidak sesuai dengan indeks yang ditempati oleh elemen, maka program akan mencetak tulisan berikut
                                    System.out.println("!!! Indeks Invalid !!!"); // Pencetakan tulisan gagal jika input user tidak sesuai
                                }
                                break;
                            
                            
                            case 2:
                                for (int i = 0; i < jumlahData; i++) { // Perulangan se-jumlahData dimulai dari i = 0
                                    if (arr[i] == hapus) { // Cek indeks ke-i sama dengan input user
                                        for (int j = i; j < jumlahData; j++) { // Perulangan memindahkan indeks ke-j menjadi j-1, indeks ke-i terhapus
                                            arr[j] = arr[j + 1];
                                        }
                                        jumlahData--; // // Jumlah data dalam array dikurangi sebanyak 1
                                        i--; // Variabel i dikurangi sebanyak 1
                                    }
                                }
                                System.out.println(">> Data berhasil dihapus <<"); // Hasil jika program berhasil menghapus array
                                break;
                            default: // Hasil jika pilihan dari input user tidak ada di menu atau case
                                System.out.println("!!! Pilihan Invalid !!!");
                        }
                    } else { // Hasil jika data yang ditemukan tidak terdapat di array
                        System.out.println("!!! Data tidak ditemukan !!!");
                    }
                    System.out.println();
                    break;

                // Menu untuk keluar dari program
                case 5:
                    System.out.println(">> Program Selesai. Terima Kasih. <<"); // Hasil dari pemilihan menu ke-5
                    System.exit(0); // Program akan selesai melakukan loop
                    break;
                
                // Kode untuk pilihan yang tidak terdapat di menu/case (lebih dari 6 atau kurang dari 1)
                default: 
                    System.out.println("!!! Pilihan Invalid Silakan Pilih Ulang !!!"); // Hasil jika user input tidak sesuai dengan angka menu
                    System.out.println();
            }
        }
    }
}