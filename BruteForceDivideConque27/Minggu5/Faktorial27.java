package BruteForceDivideConque27.Minggu5;
public class Faktorial27 {

    // Method ini pakai Brute Force (Iteratif)
    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    // kalo method ini pakai Divide and Conquer (Rekursif)
    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}