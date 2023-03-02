package Semester_2.Pemrograman.Minggu_04;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.*;

public class TravisIntersect {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Jumlah data list 1: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[+] Data ke-" + (i+1) + ": ");
            list1.add(ui.nextInt());
        }
        System.out.print("Jumlah data list 2: ");
        int m = ui.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print("[+] Data ke-" + (i+1) + ": ");
            list2.add(ui.nextInt());
        }
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println(">> Intersect: " + intersect(list1, list2));
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).equals(list2.get(j))) {
                result.add(list1.get(i));
                i++;
                j++;
            } else if (list1.get(i) < list2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}

/*
Jumlah data list 1: 10
[+] Data ke-1: 1
[+] Data ke-2: 4
[+] Data ke-3: 8
[+] Data ke-4: 9
[+] Data ke-5: 11
[+] Data ke-6: 15
[+] Data ke-7: 17
[+] Data ke-8: 28
[+] Data ke-9: 41
[+] Data ke-10: 59
Jumlah data list 2: 11
[+] Data ke-1: 4
[+] Data ke-2: 7
[+] Data ke-3: 11
[+] Data ke-4: 17
[+] Data ke-5: 19
[+] Data ke-6: 20
[+] Data ke-7: 23
[+] Data ke-8: 28
[+] Data ke-9: 37
[+] Data ke-10: 59
[+] Data ke-11: 81
List 1: [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
List 2: [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
>> Intersect: [4, 11, 17, 28, 59]
*/