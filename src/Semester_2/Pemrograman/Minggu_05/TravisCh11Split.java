package Semester_2.Pemrograman.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11Split {
    public static void main(String[] args) {
        Set <String> kata = new HashSet<>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah kata yang ingin dimasukkan: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + i + " ] Kata: ");
            String data = ui.next();
            kata.add(data);
        }
        Map <Integer, Set<String>> hasil = split(kata);
        System.out.println("Hasilnya adalah: " + hasil);
    }
    public static Map <Integer, Set<String>> split (Set <String> input) {
        Map <Integer, Set<String>> hasilMap = new TreeMap<>();
        for (String str : input) {
            int panjang = str.length();
            if (!hasilMap.containsKey(panjang)) {
                hasilMap.put(panjang, new HashSet<>());
            }
            hasilMap.get(panjang).add(str);
        }
        return hasilMap;
    }
}

/*
Jumlah kata yang ingin dimasukkan: 10
[ 0 ] Kata: aku
[ 1 ] Kata: kita 
[ 2 ] Kata: kamu
[ 3 ] Kata: dia
[ 4 ] Kata: ia
[ 5 ] Kata: ui
[ 6 ] Kata: kowe
[ 7 ] Kata: panjenengan
[ 8 ] Kata: sampeyan
[ 9 ] Kata: kulo
Hasilnya adalah: {2=[ui, ia], 3=[aku, dia], 4=[kowe, kita, kamu, kulo], 8=[sampeyan], 11=[panjenengan]}
*/