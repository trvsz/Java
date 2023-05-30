package Semester_2.Pemrograman.Tugas_Akhir.Chap13_SearchingSorting;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] ARRAY_1 = {37, 29, 19, 48, 23, 55, 74, 12};
        selectionSort(ARRAY_1);
        int[] ARRAY_2 = {8, 5, -9, 14, 0, -1, -7, 3};
        selectionSort(ARRAY_2);
        int[] ARRAY_3 = {63,  9, 45, 72, 27, 18, 54, 36};
        selectionSort(ARRAY_3);
    }
    public static void selectionSort(int[] ARRAY) {
        for (int i = 0; i < ARRAY.length - 1; i++) { // iterasi sebanyak panjang array - 1
            int MIN = i; // inisialisasi nilai minimum
            for (int j = i + 1; j < ARRAY.length; j++) { // iterasi sebanyak panjang array
                if (ARRAY[j] < ARRAY[MIN]) { // jika nilai array ke-j lebih kecil dari nilai array ke-minimum
                    MIN = j; // nilai minimum menjadi nilai array ke-j
                }
            }
            if (i != MIN) { // jika nilai i tidak sama dengan nilai minimum
                int TEMP = ARRAY[i]; // inisialisasi nilai sementara
                ARRAY[i] = ARRAY[MIN]; // nilai array ke-i menjadi nilai array ke-minimum
                ARRAY[MIN] = TEMP; // nilai array ke-minimum menjadi nilai sementara
            }
        }
    }
}

