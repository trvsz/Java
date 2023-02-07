package Semester_2.Pemrograman.Minggu_01;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 * 
 * Output telah dituliskan pada bagian bawah kode.
 */

public class TravisSeason {
    public static void main(String[] args) {
        // Penyimpanan data int bulan dan tanggal
        int a = 3;
        int b = 6;
        int c = 9;
        int d = 15;
        int e = 16;
        // Pemanggilan kode dan menghasilkan output komputasi
        System.out.printf("Tanggal %d bulan %d memiliki musim %s.", d, a, season(d, a));
        System.out.printf("\nTanggal %d bulan %d memiliki musim %s.", d, b, season(b, d));
        System.out.printf("\nTanggal %d bulan %d memiliki musim %s.", d, c, season(c, d));
        System.out.printf("\nTanggal %d bulan %d memiliki musim %s.", e, c, season(c, e));

    }
    public static String season(int month, int day) {
        // Komputasi menggunakan if, else if
        if (month >= 3 && day >= 16 && month < 6 || month <= 6 && day <= 15 && month > 3) {
            return "Spring";
        } else if (month >= 6 && day >= 16 && month < 9 || month <= 9 && day <= 15 && month > 6) {
            return "Summer";
        } else if (month >= 9 && day >= 16 && month < 12 || month <= 12 && day <= 15 && month > 9) {
            return "Fall";
        }
        return "Winter"; // Mempercepat pemanggilan return (tidak perlu memggunakan else)
    }
}

/*
Tanggal 15 bulan 3 memiliki musim Winter.
Tanggal 15 bulan 6 memiliki musim Spring.
Tanggal 15 bulan 9 memiliki musim Summer.
Tanggal 16 bulan 9 memiliki musim Fall.
*/