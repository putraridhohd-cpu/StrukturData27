package praktikum5;

public class MahasiswaBerprestasi26 {
    Mahasiswa26 [] listMhs = new Mahasiswa26[5];
    int idx;

    void tambah(Mahasiswa26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa26 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                // Mengurutkan berdasarkan IPK secara Descending (terbesar ke terkecil)
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}
