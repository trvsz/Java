package Semester_2.Pemrograman.Tugas_Akhir.Chap13_SearchingSorting;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] ARRAY_1 = {-1,  3,  5,  8, 15, 18, 22, 39, 40, 42, 50, 57, 71, 73, 74};
        int INDEX_1 = binarySearch(ARRAY_1, 42);
        System.out.println("Index 1: " + INDEX_1);
        
        int[] ARRAY_2 = {-2,  0,  1,  7,  9, 16, 19, 28, 31, 40, 52, 68, 85, 99};
        int INDEX_2 = binarySearch(ARRAY_2, 5);
        System.out.println("Index 2: " + INDEX_2);

        int[] ARRAY_3 = {-5, -1,  3,  5,  7, 10, 18, 29, 37, 42, 58, 63, 94};
        int INDEX_3 = binarySearch(ARRAY_3, 33);
        System.out.println("Index 3: " + INDEX_3);
    }
    public static int binarySearch(int[] ARRAY, int TARGET) {
        int MIN = 0; // Nilai minimum
        int MAX = ARRAY.length - 1; // Nilai maksimum
        while (MIN <= MAX) { // Selama nilai minimum kurang dari sama dengan nilai maksimum
            int MID = (MIN + MAX) / 2; // Nilai tengah
            if (ARRAY[MID] < TARGET) { // Jika nilai tengah kurang dari nilai target
                MIN = MID + 1; // Nilai minimum sama dengan nilai tengah ditambah 1
            } else if (ARRAY[MID] > TARGET) { // Jika nilai tengah lebih dari nilai target
                MAX = MID - 1; // Nilai maksimum sama dengan nilai tengah dikurang 1
            } else { // Jika nilai tengah sama dengan nilai target
                return MID; // Mengembalikan nilai tengah
            }
        }
        return -(MIN + 1); // Mengembalikan nilai minimum ditambah 1
    }
}

/*
Output:
Index 1: 9
Index 2: -4
Index 3: -9
 */