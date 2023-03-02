package Semester_2.Pemrograman.Minggu_05;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.*;

public class TravisCh11Counts {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Set <Integer> set = new HashSet<>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah data list yang ingin dimasukkan: ");
        int n = ui.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + i +" ] Data: ");
            int data = ui.nextInt();
            list.add(data);
        }
        System.out.print("Jumlah data set yang ingin dicari: ");
        int o = ui.nextInt();
        for (int i = 0; i < o; i++) {
            System.out.print("[ " + i +" ] Data: ");
            int data = ui.nextInt();
            set.add(data);
        }
        Map <Integer, Integer> resultMap = counts(list, set);
        System.out.println("Data list: " + list);
        System.out.println("Data set: " + set);
        System.out.println("Data resultMap: " + resultMap);
    }
    public static Map<Integer, Integer> counts(List<Integer> list, Set<Integer> set) {
        Map <Integer, Integer> resultMap = new HashMap<>();
        for (Integer num : set) {
            int count = 0;
            for (Integer element : list) {
                if (element.equals(num)) {
                    count++;
                }
            }
            resultMap.put(num, count);
        }
        return resultMap;
    }
}

/*
Jumlah data list yang ingin dimasukkan: 13
[ 0 ] Data: 4
[ 1 ] Data: -2
[ 2 ] Data: 3
[ 3 ] Data: 9
[ 4 ] Data: 4
[ 5 ] Data: 17
[ 6 ] Data: 5
[ 7 ] Data: 29
[ 8 ] Data: 14
[ 9 ] Data: 87
[ 10 ] Data: 4
[ 11 ] Data: -2
[ 12 ] Data: 100
Jumlah data set yang ingin dicari: 3
[ 0 ] Data: -2
[ 1 ] Data: 4
[ 2 ] Data: 29
Data list: [4, -2, 3, 9, 4, 17, 5, 29, 14, 87, 4, -2, 100]
Data set: [-2, 4, 29]
Data resultMap: {-2=2, 4=3, 29=1}
*/