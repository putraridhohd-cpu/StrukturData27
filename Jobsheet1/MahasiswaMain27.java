package Jobsheet1;

public class MahasiswaMain27 {
    public static void main(String[] args) {

        // Object pertama (menggunakan konstruktor default)
        Mahasiswa27 mhs1 = new Mahasiswa27();
        mhs1.nama = "Valent Ridho Putra Santoso";
        mhs1.NIM = "254107020050";
        mhs1.kelas = "TI 1-H";
        mhs1.ipk = 3.5;

        mhs1.TampilkanInformasi();
        mhs1.ubahkelas("TI 1-H2");
        mhs1.updateIpk(3.0);
        mhs1.TampilkanInformasi();

        System.out.println("======================");

        // Object kedua (menggunakan konstruktor berparameter)
        Mahasiswa27 mhs2 = new Mahasiswa27(
                "Rifki Maulana",
                "234526162",
                "TI 1-H",
                3.5
        );

        mhs2.updateIpk(2.90);
        mhs2.TampilkanInformasi();

        System.out.println("======================");

        // Object ketiga (mhsRIDHO menggunakan konstruktor berparameter)
        Mahasiswa27 mhsRIDHO = new Mahasiswa27(
                "Ridho Putra Santoso",
                "254107020050",
                "TI 1-H",
                3.6
        );

        mhsRIDHO.TampilkanInformasi();
    }
}