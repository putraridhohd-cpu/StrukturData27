package praktikum5;
import java.util.Scanner;

public class DosenMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen26 data = new DataDosen26();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN 26 ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting Usia ASC (Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting Usia DSC (Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (Pria=true / Wanita=false): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    
                    Dosen26 d = new Dosen26(kd, nama, jk, usia);
                    data.tambah(d);
                    break;
                case 2:
                    System.out.println("\n--- Daftar Seluruh Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("\nData berhasil diurutkan (ASC)!");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\nData berhasil diurutkan (DSC)!");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        
        sc.close();
    }
}