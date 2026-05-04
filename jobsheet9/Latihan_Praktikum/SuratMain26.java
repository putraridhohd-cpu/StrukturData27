package jobsheet9.Latihan_Praktikum;
import java.util.Scanner;

public class SuratMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat26 st = new StackSurat26(10);
        int pilih;

        do {
            System.out.println("\n=== Sistem Admin Prodi - Surat Izin ===");
            System.out.println("1. Terima Surat Izin (Push)");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat (Search by Name)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): "); char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    st.push(new Surat26(id, nama, kls, jenis, dur));
                    break;
                case 2:
                    Surat26 s = st.pop();
                    if (s != null) {
                        System.out.println("Surat " + s.idSurat + " milik " + s.namaMahasiswa + " telah divalidasi.");
                    }
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    st.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);
    }
}