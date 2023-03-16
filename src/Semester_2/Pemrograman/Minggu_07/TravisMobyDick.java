package Semester_2.Pemrograman.Minggu_07;

// Travis Zusa Zuve Saputra
// 22537141013

// File MobyDick.txt dapat diunduh dari https://gist.github.com/StevenClontz/4445774
// Hasil dari Output adalah nilai yang sebenarnya (tidak hanya mendekati) untuk file tersebut.

import java.util.*;
import java.io.*;

public class TravisMobyDick {
    public static void main(String[] args) {
        Map<String, Integer> kataMap = new HashMap<>();
        
        try {
            // Buat Scanner untuk membaca file
            Scanner scanner = new Scanner(new File("C:/temp/mobydick.txt"));
            scanner.useDelimiter("\\s+"); // Pisahkan input berdasarkan spasi atau newline
            
            // Baca kata dari file dan tambahkan ke dalam Map
            while (scanner.hasNext()) {
                String[] kata = scanner.next().split("\\W+");
                for (String k : kata) {
                    k = k.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!k.isEmpty()) {
                        kataMap.put(k, kataMap.getOrDefault(k, 0) + 1);
                    }
                }
            }
            scanner.close(); // Tutup scanner
            
            // Buat ArrayList dari Map.Entry
            List<Map.Entry<String, Integer>> kataList = new ArrayList<>(kataMap.entrySet());
            kataList.sort(Map.Entry.comparingByValue());
            
            // Urutkan ArrayList berdasarkan nilai frekuensi (dari yang terjarang hingga tersering)
            Collections.sort(kataList, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e1.getValue().compareTo(e2.getValue());
                }
            });
            
            // Cetak peringkat kata-kata
            System.out.println("Peringkat kata-kata:");
            int rank = 1;
            for (Map.Entry<String, Integer> entry : kataList) {
                if (entry.getValue() >= 1000) {
                    System.out.println(rank + ". " + entry.getKey() + ": " + entry.getValue());
                    rank++;
                }
            }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
Peringkat kata-kata:
1. he: 1037
2. it: 1196
3. i: 1315
4. his: 1332
5. that: 1559
6. in: 2145
7. to: 2416
8. a: 2575
9. and: 3214
10. of: 3532
11. the: 7032
*/