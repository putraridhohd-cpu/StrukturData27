package Praktikum03;

public class DataDosen27 {

    // a. Menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen27[] arrayOfDosen) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen27 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("-------------------------------------");
        }
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen27[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen27 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // c. Menampilkan rata-rata usia per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen27[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen27 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            }
        }

        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

    // d. Menampilkan dosen paling tua
    public static void infoDosenPalingTua(Dosen27[] arrayOfDosen) {
        Dosen27 palingTua = arrayOfDosen[0];
        for (Dosen27 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) palingTua = d;
        }
        System.out.println("Dosen Paling Tua: " + palingTua.nama + " (" + palingTua.usia + " tahun)");
    }

    // e. Menampilkan dosen paling muda
    public static void infoDosenPalingMuda(Dosen27[] arrayOfDosen) {
        Dosen27 palingMuda = arrayOfDosen[0];
        for (Dosen27 d : arrayOfDosen) {
            if (d.usia < palingMuda.usia) palingMuda = d;
        }
        System.out.println("Dosen Paling Muda: " + palingMuda.nama + " (" + palingMuda.usia + " tahun)");
    }
}