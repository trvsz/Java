package Semester_1.Minggu_16;

public class nthDigit {
    public static void main(String[] args) {
        System.out.println(nthDig(21));
    }
    
    public static int nthDig(int n){
        if (n <= 9){
            return n;
        }
        int i = 1; 
        int fac = 1; 
        while (n > (long) i * 9 * fac) {
            n -= 9 * fac * i;
            fac *= 10;
            i++;
        }
        int target = fac + (n - 1) / i;
        String str = Integer.toString(target);
        return str.charAt((n - 1) % i) - '0';
    }
}
