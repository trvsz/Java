package Semester_2.Pemrograman.Minggu_03;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisAcronymFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner ui = new Scanner(System.in);

        System.out.print("Jumlah kata yang ingin diakronimkan: ");
        int n = ui.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.printf("[+] Masukkan kata ke-%d: ", i);
            list.add(ui.next());
        }
        String acronym = acronymFor(list);
        System.out.println(">> Akronimnya adalah " + acronym);
    }
    public static String acronymFor(ArrayList<String> list) {
        StringBuilder temp = new StringBuilder();
        for (String li : list) {
            temp.append(li.toUpperCase().charAt(0));
        }
        return temp.toString();
    }
}

/*
Jumlah kata yang ingin diakronimkan: 4
[+] Masukkan kata ke-0: tes
[+] Masukkan kata ke-1: satu
[+] Masukkan kata ke-2: dua
[+] Masukkan kata ke-3: tiga
>> Akronimnya adalah TSDT
*/