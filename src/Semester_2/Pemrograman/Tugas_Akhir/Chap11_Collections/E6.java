package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class E6 {
    public static void main(String[] args) {
        Map <String, String> DATA = new TreeMap<String, String>();
        Scanner USER_INPUT = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan: ");
        int JUMLAH = USER_INPUT.nextInt();
        for (int i = 0; i < JUMLAH; i++) {
            System.out.print("Data ke-" + (i + 1) + " (key): ");
            String KEY = USER_INPUT.next();
            System.out.print("Data ke-" + (i + 1) + " (value): ");
            String VALUE = USER_INPUT.next();
            DATA.put(KEY, VALUE);
        }
        Set <String> RESULT = mystery(DATA);
        System.out.println("Data: " + DATA);
        System.out.println("Hasil: " + RESULT);
    }
    public static Set <String> mystery(Map <String, String> DATA) {
        Set <String> RESULT = new TreeSet<String>();
        for (String S : DATA.keySet()) {
            RESULT.add(DATA.get(S));
        }
        return RESULT;
    }
}

/*
Output:
Jumlah data yang ingin dimasukkan: 4
Data ke-1 (key): baz
Data ke-1 (value): c
Data ke-2 (key): mumble
Data ke-2 (value): d
Data ke-3 (key): foo
Data ke-3 (value): a
Data ke-4 (key): bar
Data ke-4 (value): b
Data: {bar=b, baz=c, foo=a, mumble=d}
Hasil: [a, b, c, d]

Jumlah data yang ingin dimasukkan: 6
Data ke-1 (key): f
Data ke-1 (value): z
Data ke-2 (key): d
Data ke-2 (value): x
Data ke-3 (key): e
Data ke-3 (value): y
Data ke-4 (key): b
Data ke-4 (value): y
Data ke-5 (key): c
Data ke-5 (value): z
Data ke-6 (key): a
Data ke-6 (value): x
Data: {a=x, b=y, c=z, d=x, e=y, f=z}
Hasil: [x, y, z]

Jumlah data yang ingin dimasukkan: 8
Data ke-1 (key): f
Data ke-1 (value): 2
Data ke-2 (key): g
Data ke-2 (value): 10
Data ke-3 (key): d
Data ke-3 (value): 20
Data ke-4 (key): e
Data ke-4 (value): 1
Data ke-5 (key): b
Data ke-5 (value): 10
Data ke-6 (key): c
Data ke-6 (value): 2
Data ke-7 (key): a
Data ke-7 (value): 1
Data ke-8 (key): h
Data ke-8 (value): 20
Data: {a=1, b=10, c=2, d=20, e=1, f=2, g=10, h=20}   
Hasil: [1, 10, 2, 20]
 */