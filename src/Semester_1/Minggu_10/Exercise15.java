package Semester_1.Minggu_10;

import java.util.*;

public class Exercise15 {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 6};
        int[] list2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(append(list1, list2)));
        System.out.println(Arrays.toString(append(list2, list1)));
    }
    public static int[] append(int[] list1, int[] list2) {
        int[] newList = new int[list1.length + list2.length];
        int index = 0;
        
        for (int i = 0; i < list1.length; i++) {
            newList[index] = list1[i];
            index++;
        }
        
        for (int i = 0; i < list2.length; i++) {
            newList[index] = list2[i];
            index++;
        }
        
        return newList;
    }
}
