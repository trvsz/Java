package Semester_2.Pemrograman.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11RemoveInRange {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + i +" ] Data: ");
            String data = ui.next();
            list.add(data);
        }
        System.out.print("Data yang ingin dihapus? ");
        int hapus = ui.nextInt();
        System.out.print("Dari indeks ke-berapa? ");
        int awal = ui.nextInt();
        System.out.print("Sampai indeks ke-berapa? ");
        int akhir = ui.nextInt();
        System.out.println("Data sebelum dihapus: " + list);
        removeInRange(list, hapus, awal, akhir);
    }
    public static void removeInRange(List<String> list, int hapus, int awal, int akhir){
        for (int i = awal; i < akhir; i++) {
            if (list.get(i).equals(Integer.toString(hapus))) {
                list.remove(i);
                i--;
                akhir--;
            }
        }
        System.out.println("Data setelah dihapus: " + list);
    }
}

/*
Jumlah data yang ingin dimasukkan: 17
[ 0 ] Data: 0
[ 1 ] Data: 0
[ 2 ] Data: 2
[ 3 ] Data: 0
[ 4 ] Data: 4
[ 5 ] Data: 0
[ 6 ] Data: 6
[ 7 ] Data: 0
[ 8 ] Data: 8
[ 9 ] Data: 0
[ 10 ] Data: 10
[ 11 ] Data: 0
[ 12 ] Data: 12
[ 13 ] Data: 0
[ 14 ] Data: 14
[ 15 ] Data: 0
[ 16 ] Data: 16
Data yang ingin dihapus? 0
Dari indeks ke-berapa? 5
Sampai indeks ke-berapa? 13
Data sebelum dihapus: [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16]
Data setelah dihapus: [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16]
*/