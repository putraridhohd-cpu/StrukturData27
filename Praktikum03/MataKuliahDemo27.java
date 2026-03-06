package Praktikum03;
import java.util.Scanner;

public class MataKuliahDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahElemen = Integer.parseInt(sc.nextLine());
        
    
        MataKuliah27[] arrayOfMataKuliah = new MataKuliah27[jumlahElemen];

       
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke = " + (i + 1));
            
           
            arrayOfMataKuliah[i] = new MataKuliah27(); 
            arrayOfMataKuliah[i].tambahData(sc);
            
            System.out.println("-------------------------------------");
        }


        System.out.println("\n===== DAFTAR MATAKULIAH =====");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------");
        }

        sc.close();
    }
}