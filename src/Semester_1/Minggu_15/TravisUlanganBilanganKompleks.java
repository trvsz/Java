package Semester_1.Minggu_15;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

public class TravisUlanganBilanganKompleks {
    public static void main(String[] args) {
        BilKom bilkom0 = new BilKom();
        BilKom bilkom1 = new BilKom(5);
        BilKom bilkom2 = new BilKom(5.0, 4.5);
        BilKom bilkom3 = new BilKom(0, 7.0);
        BilKom bilkom4 = (BilKom)BilKom.tambah(bilkom2, bilkom3);

        System.out.println(bilkom0.toString(bilkom0));
        System.out.println(bilkom1.toString(bilkom1));
        System.out.println(bilkom2.toString(bilkom2));
        System.out.println(bilkom3.toString(bilkom3));
        System.out.println(bilkom4.toString(bilkom4));
    }
}

/*
 * 0.0 + j0.0
 * 5.0 + j0.0
 * 5.0 + j4.5
 * 0.0 + j7.0
 * 5.0 + j11.5
*/