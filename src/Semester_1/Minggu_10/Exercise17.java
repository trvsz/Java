package Semester_1.Minggu_10;
/*
 * BJP5 Exercise 7.13: longestSortedSequence
 */

public class Exercise17 {
    public static int longestSortedSequence(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int count = 0;
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
            if (array[i + 1] < array[i]) {
                result = Math.max(result, count);
            }
        }
        count++;
        result = Math.max(result, count);
        return result;
    }
}
