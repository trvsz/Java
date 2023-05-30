package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E7 {
    public static void main(String[] args) {
        Map <String, String> map = new TreeMap<String, String>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan: ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Data ke-" + (i + 1) + " (key): ");
            String KEY = USER_INPUT.next();
            System.out.print("Data ke-" + (i + 1) + " (value): ");
            String VALUE = USER_INPUT.next();
            map.put(KEY, VALUE);
        }
        mapMystery2(map);
    }
    public static void mapMystery2(Map <String, String> map) {
        Set <String> SET = new TreeSet<String>(); // Membuat set baru
        for (String key : map.keySet()) { // Pengulangan untuk mengambil key dari map
            if (!map.get(key).equals(key)) { // Jika nilai key tidak sama dengan nilai value
                SET.add(map.get(key)); // Menambahkan nilai value ke dalam set
            } else { // Jika nilai key sama dengan nilai value
                SET.remove(map.get(key)); // Menghapus nilai value dari set
            }
        }
        System.out.println(SET); // Menampilkan nilai set
    }
}

/*
Output:
Jumlah data yang ingin dimasukkan: 4
Data ke-1 (key): sheep
Data ke-1 (value): wool
Data ke-2 (key): house
Data ke-2 (value): brick
Data ke-3 (key): cast
Data ke-3 (value): plaster
Data ke-4 (key): wool
Data ke-4 (value): wool
[brick, plaster]

Jumlah data yang ingin dimasukkan: 5
Data ke-1 (key): munchkin
Data ke-1 (value): blue
Data ke-2 (key): winkie
Data ke-2 (value): yellow
Data ke-3 (key): corn
Data ke-3 (value): yellow
Data ke-4 (key): grass
Data ke-4 (value): green
Data ke-5 (key): emerald
Data ke-5 (value): green
[blue, green, yellow]

 */