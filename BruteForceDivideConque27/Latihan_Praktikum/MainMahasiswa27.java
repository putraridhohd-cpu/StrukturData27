package BruteForceDivideConque27.Latihan_Praktikum;

public class MainMahasiswa27 {
    public static void main(String[] args) {
        Mahasiswa27[] daftarMhs = new Mahasiswa27[8];
        daftarMhs[0] = new Mahasiswa27("Ahmad", 220101001, 2022, 78, 82);
        daftarMhs[1] = new Mahasiswa27("Budi", 220101002, 2022, 85, 88);
        daftarMhs[2] = new Mahasiswa27("Cindy", 220101003, 2021, 90, 87);
        daftarMhs[3] = new Mahasiswa27("Dian", 220101004, 2021, 76, 79);
        daftarMhs[4] = new Mahasiswa27("Eko", 220101005, 2023, 92, 95);
        daftarMhs[5] = new Mahasiswa27("Fajar", 220101006, 2020, 88, 85);
        daftarMhs[6] = new Mahasiswa27("Gina", 220101007, 2023, 80, 83);
        daftarMhs[7] = new Mahasiswa27("Hadi", 220101008, 2020, 82, 84);

        // Objek bantuan untuk panggil method
        Mahasiswa27 kontrol = daftarMhs[0];

        System.out.println("=== HASIL LATIHAN PRAKTIKUM ===");
        
        // a) UTS Tertinggi (DC)
        int max = kontrol.cariMaxUTS(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Tertinggi (Divide Conquer) : " + max);

        // b) UTS Terendah (DC)
        int min = kontrol.cariMinUTS(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Terendah (Divide Conquer)  : " + min);

        // c) Rata-rata UAS (BF)
        double rata = kontrol.rataRataUAS(daftarMhs);
        System.out.printf("Rata-rata Nilai UAS (Brute Force)    : %.2f\n", rata);
        
        System.out.println("===============================");
    }
}
