package BruteForceDivideConque27.Minggu5;
import java.util.Scanner;

public class MainSum27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elemen = input.nextInt();
        
        // Membuat objek Sum27
        Sum27 sm = new Sum27(elemen);
        
        // Input keuntungan per bulan
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }
        
        System.out.println("====================================================");
        System.out.println("Total keuntungan menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
        System.out.println("====================================================");
        
        input.close();
    }
}