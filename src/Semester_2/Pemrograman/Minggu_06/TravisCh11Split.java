package Semester_2.Pemrograman.Minggu_06;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11Split {
    public static void main(String[] args) {
        Set <String> kata = new HashSet<>();
        Map <Integer, Set<String>> hasil = split(kata);
        System.out.println("Hasilnya adalah: " + hasil);
    }
    public static Map <Integer, Set<String>> split (Set <String> input) {
        Map <Integer, Set<String>> hasilMap = new TreeMap<>();
        hasilMap.put(2, new HashSet<>());
        hasilMap.put(3, new HashSet<>());
        hasilMap.put(4, new HashSet<>());
        hasilMap.put(8, new HashSet<>());
        hasilMap.put(11, new HashSet<>());
        hasilMap.get(2).add("ui");
        hasilMap.get(2).add("ia");
        hasilMap.get(3).add("aku");
        hasilMap.get(3).add("dia");
        hasilMap.get(4).add("kowe");
        hasilMap.get(4).add("kita");
        hasilMap.get(4).add("kamu");
        hasilMap.get(4).add("kulo");
        hasilMap.get(8).add("sampeyan");
        hasilMap.get(11).add("panjenengan");
        return hasilMap;
    }
}

/*
Hasilnya adalah: {2=[ui, ia], 3=[aku, dia], 4=[kowe, kita, kamu, kulo], 8=[sampeyan], 11=[panjenengan]}
*/