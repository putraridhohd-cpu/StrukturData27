package Praktikum03;
import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen27[] arrayOfDosen = new Dosen27[jumlah];

        // 1. Looping FOR untuk Input Data
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W) : ");
            char jkChar = sc.nextLine().toUpperCase().charAt(0);
            boolean jk = (jkChar == 'P');
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------------------");

            arrayOfDosen[i] = new Dosen27(kode, nama, jk, usia);
        }

        // 2. Memanggil Method dari Utility Class DataDosen27
        // (Kita tidak perlu loop manual lagi di sini karena sudah dihandle oleh method ini)
        DataDosen27.dataSemuaDosen(arrayOfDosen);
        
        System.out.println("\n===== ANALISIS DATA DOSEN =====");
        DataDosen27.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen27.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen27.infoDosenPalingTua(arrayOfDosen);
        DataDosen27.infoDosenPalingMuda(arrayOfDosen);
        System.out.println("-------------------------------------");

        sc.close(); 
    }
}