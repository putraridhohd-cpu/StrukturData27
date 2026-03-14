package BruteForceDivideConque27.Minggu5;

public class Pangkat27 {
    public int nilai, pangkat;

    // Constructor untuk mengisi nilai dan pangkat
    public Pangkat27(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    // Method Brute Force (Iteratif)
    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    // Method Divide and Conquer (Rekursif)
    public int pangkatDC(int a, int n) {
        if (n == 0) { 
            return 1;
        } else if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) { // Jika pangkat ganjil
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else { // Jika pangkat genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}