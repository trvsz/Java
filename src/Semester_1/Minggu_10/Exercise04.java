package Semester_1.Minggu_10;

public class Exercise04 {
    public static void main(String[] args) {
        int[] list = {2, 18, 6, -4, 5, 1};
        
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
            System.out.println(list[i]);
        }
    }
}
// 3; 24; 8; -5; 6; 1