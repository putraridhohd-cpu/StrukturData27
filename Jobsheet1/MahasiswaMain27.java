package Jobsheet1;

public class MahasiswaMain27 {
    public static void main(String[] args) {
    Mahasiswa27 mhs1 = new Mahasiswa27();
    mhs1.nama = "Valent ridho putra santoso";
    mhs1.NIM = "123456789";
    mhs1.kelas = "TI 1-H";
    mhs1.ipk = 3.5;

    mhs1.TampilkanInformasi();
    mhs1.ubahkelas("TI 1-H2");
    mhs1.updateIpk(3.0);
    mhs1.TampilkanInformasi();


    }
   
}
