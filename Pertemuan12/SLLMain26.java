package Pertemuan12;
import java.util.Scanner; // Import Scanner untuk input keyboard

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList26 sll = new SingleLinkedList26();
        Scanner sc = new Scanner(System.in);

        // Contoh: Meminta input untuk menambahkan data ke awal (addFirst)
        System.out.println("Masukkan data mahasiswa untuk ditambahkan ke awal:");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // Membersihkan buffer setelah nextDouble()

        // Membuat objek dari input keyboard
        Mahasiswa26 mhsInput = new Mahasiswa26(nim, nama, kelas, ipk);
        
        // Menambahkan ke list
        sll.addFirst(mhsInput);
        
        // Cetak hasil
        sll.print();

        sc.close(); 
    }
}