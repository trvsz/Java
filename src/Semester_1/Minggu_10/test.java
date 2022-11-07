package Semester_1.Minggu_10;

import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        test c = new test();
        int a[]=new int[100];
        int b[]=new int[100];
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of elements for array");
        int n=s.nextInt();
        System.out.println("enter first array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter second array elements");
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        c.callcopyarray(a,b,0,3,2,n);
    }

    private void callcopyarray(int[] a, int[] b, int i1, int i2, int l,int n) {
        for(int i=i1;i<l;i++) {
            b[i2]=a[i];
            i2++;
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
