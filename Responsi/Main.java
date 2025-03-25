/*Nama File = Main.java
 *Deskripsi = program main class
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

public class Main {
    public static void main(String[] args) {
        //Fakultas
        Fakultas fakultas1 = new Fakultas("Teknik", 8500000, 7000000);
        Fakultas fakultas2 = new Fakultas("Pertanian", 7500000, 6000000);

        //Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Felis", "Felis@email.com", "24060123130098", 2, fakultas1);
        Mahasiswa mhs2 = new Mahasiswa("Eren", "Rene@email.com", "24060321130099", 2, fakultas2);

        //Dosen
        Dosen dosen1 = new Dosen("Cristi", "Cristi@email.com", "1234681234488", 10, fakultas1);
        Dosen dosen2 = new Dosen("Mila", "Mila@email.com", "34125671238890", 15, fakultas2);

        //tendik
        Tendik tendik1 = new Tendik("Eliza", "eliza@email.com", "1234567890123", 5);
        Tendik tendik2 = new Tendik("Cece", "cece@email.com", "9087654321235", 8);

        //info mahasiswa
        System.out.println(" ");
        System.out.println("-- DATA MAHASISWA --");
        mhs1.printInfo();
        mhs2.printInfo();
        

        // info dosen
        System.out.println(" ");
        System.out.println("-- DATA DOSEN --");
        dosen1.printInfo();
        dosen2.printInfo();

        // Menampilkan informasi tenaga kependidikan
        System.out.println(" ");
        System.out.println("-- DATA TENAGA KEPENDIDIKAN --");
        tendik1.printInfo();
        tendik2.printInfo();

        // Menampilkan total mahasiswa
        System.out.println(" ");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getCountMahasiswa());
        
        // Menampilkan total dosen
        System.out.println("Total Dosen: " + Dosen.getCountDosen());

        
        // Menampilkan total tendik
        System.out.println("Total Tendik: " + Tendik.getCountTendik());

    }
}
