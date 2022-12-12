package Semester_1.Minggu_15;

/*
 * Travis Zusa Zuve Saputra
 * 22537141013
 */

class BilKom {
    private double real;
    private double imajiner;
    public BilKom(double real, double imajiner) {
        this.real = real;
        this.imajiner = imajiner;
    }
    public BilKom(double real) {
        this(real, 0);
    }  
    public BilKom() {
        this(0, 0);
    }
    public static Object tambah(BilKom BilKomA, BilKom BilKomB) {
        double real = BilKomA.real + BilKomB.real;
        double imajiner = BilKomA.imajiner + BilKomB.imajiner;
        BilKom obj = new BilKom(real, imajiner);
        return obj;
    }
    public String toString(BilKom BilKomK) {
        return this.real + " + j" + this.imajiner;
    }
}
