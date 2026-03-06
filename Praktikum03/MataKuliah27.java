package Praktikum03;
import java.util.Scanner;

public class MataKuliah27 {
    public String kode;
    public String nama;
    public int sks;
    public int JumlahJam;

    public MataKuliah27() { } 

    public void tambahData(Scanner sc) {
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("SKS         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.JumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("SKS         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.JumlahJam);
    }
}