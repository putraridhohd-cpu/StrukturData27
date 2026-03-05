package Praktikum03;
import java.util.Scanner;
public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa27[] arrayOfMahasiswa = new mahasiswa27[3];
        String dummy;
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa27();
            System.out.println("Masukkan Data Mahasiswa ke = " + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("NAMA : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("KELAS : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------");
        }
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].CetakInfo();
            System.out.println("-------------------------------------");
        }
        
        sc.close();
    }
    
}
