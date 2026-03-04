package Praktikum03;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        mahasiswa27[] arrayOfMahasiswa = new mahasiswa27[3];
        arrayOfMahasiswa[0] = new mahasiswa27();
        arrayOfMahasiswa[0].nim = "2410092938";
        arrayOfMahasiswa[0].nama = "Agnes Titania Kinanti";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new mahasiswa27();
        arrayOfMahasiswa[1].nim = "241082384";
        arrayOfMahasiswa[1].nama = "Achmad Maulana hamzah";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new mahasiswa27();
        arrayOfMahasiswa[2].nim = "2446364006";
        arrayOfMahasiswa[2].nama = "Dirhamawan putranto";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM     : "+ arrayOfMahasiswa[0].nim);
        System.out.println("NAMA    : "+ arrayOfMahasiswa[0].nama);
        System.out.println("KELAS   : "+ arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[0].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa[1].nim);
        System.out.println("NAMA    : "+ arrayOfMahasiswa[1].nama);
        System.out.println("KELAS   : "+ arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[1].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa[2].nim);
        System.out.println("NAMA    : "+ arrayOfMahasiswa[2].nama);
        System.out.println("KELAS   : "+ arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[2].ipk);
        System.out.println("-------------------------------------");

    }
    
}
