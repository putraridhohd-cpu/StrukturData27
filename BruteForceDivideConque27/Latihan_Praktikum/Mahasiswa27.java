package BruteForceDivideConque27.Latihan_Praktikum;

public class Mahasiswa27 {
    
    String nama;
    int nim, tahunMasuk;
    int nilaiUTS, nilaiUAS;

    // Konstruktor buat isi data mahasiswa
    public Mahasiswa27(String nama, int nim, int tahun, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    // Algoritma Divide and Conquer buat nyari UTS Tertinggi
    public int cariMaxUTS(Mahasiswa27[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        
        int mid = (l + r) / 2;
        int maxL = cariMaxUTS(arr, l, mid);
        int maxR = cariMaxUTS(arr, mid + 1, r);
        
        return (maxL > maxR) ? maxL : maxR;
    }

    // Algoritma Divide and Conquer buat nyari UTS Terendah
    public int cariMinUTS(Mahasiswa27[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        
        int mid = (l + r) / 2;
        int minL = cariMinUTS(arr, l, mid);
        int minR = cariMinUTS(arr, mid + 1, r);
        
        return (minL < minR) ? minL : minR;
    }

    // Algoritma Brute Force buat ngitung Rata-rata UAS
    public double rataRataUAS(Mahasiswa27[] arr) {
        double total = 0;
        for (Mahasiswa27 mhs : arr) {
            total += mhs.nilaiUAS;
        }
        return total / arr.length;
    }
}
