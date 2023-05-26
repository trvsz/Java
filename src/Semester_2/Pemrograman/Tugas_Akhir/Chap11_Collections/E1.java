package Semester_2.Pemrograman.Tugas_Akhir.Chap11_Collections;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<Integer>();
        Scanner ui = new Scanner(System.in);
        System.out.print("Jumlah angka: ");
        int jumlah = ui.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            nums.add(ui.nextInt());
        }
        System.out.println(nums);
        stutter(nums);
        System.out.println(nums);
    }
    public static void stutter (List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.add(i, nums.get(i));
            i++;
        }
    }
}

/*
Output:
Jumlah angka: 5
Masukkan angka ke-1: 1
Masukkan angka ke-2: 8
Masukkan angka ke-3: 19
Masukkan angka ke-4: 4
Masukkan angka ke-5: 17
[1, 8, 19, 4, 17]
[1, 1, 8, 8, 19, 19, 4, 4, 17, 17]  
 */