/*Nama File = main.java
 *Deskripsi = berisi main program
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Februari 2025
*/

public class main{
    public static void main (String[] args){
        //Keseluruhan
        Dosen dosen1 = new Dosen ("1001","Helmie","Informatika");
        MataKuliah matkul1 = new MataKuliah ("M001", "Dasar Pemograman", 3);
        MataKuliah matkul2 = new MataKuliah ("M002", "Dasar Sistem", 3);
        MataKuliah matkul3 = new MataKuliah ("M003", "Struktur Diskrit", 4);
        Kendaraan kendaraan1 = new Kendaraan ("BK 1003 AB", "Mobil");
        Mahasiswa mhs1 = new Mahasiswa ("24060123130098", "Felis Eren" , "Informatika");
        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);
        mhs1.addMatKul(matkul3);
        mhs1.printDetailMhs();

        //setNIP untuk Dosen
        System.out.println("Mengubah NIP Dosen"); 
        dosen1.setNIP("1002");
        dosen1.printDosen();
        System.out.println(" "); 

        //setNama untuk Dosen
        System.out.println("Mengubah Nama Dosen"); 
        dosen1.setNama("Putra");
        dosen1.printDosen();
        System.out.println(" "); 

        //setProdi untuk Dosen
        System.out.println("Mengubah Prodi Dosen"); 
        dosen1.setProdi("Kimia");
        dosen1.printDosen();
        System.out.println(" "); 
        
        //setnoPlat untuk Kendaraan
        System.out.println("Mengubah Nomor Plat Kendaraan"); 
        kendaraan1.setnoPlat("BK 1501 OB");
        kendaraan1.printKendaraan();
        System.out.println(" "); 

        //setJenis untuk Kendaraan
        System.out.println("Mengubah Jenis Kendaraan"); 
        kendaraan1.setJenis("Motor");
        kendaraan1.printKendaraan();
        System.out.println(" "); 

        //setidMatkul untuk MataKuliah
        System.out.println("Mengubah id Mata Kuliah");
        matkul1.setidMatkul("M010");
        matkul1.printMatKul();
        System.out.println(" "); 

        //setNama untuk MataKuliah
        System.out.println("Mengubah nama Mata Kuliah");
        matkul1.setNama("Basis Data");
        matkul1.printMatKul();
        System.out.println(" "); 

        //setSks untuk MataKuliah
        System.out.println("Mengubah SKS Mata Kuliah");
        matkul1.setSks(4);
        matkul1.printMatKul();
        System.out.println(" "); 

        //setDosenWali dan setKendaraan
        Dosen dosen2 = new Dosen ("1002","Putri","Informatika");
        Kendaraan kendaraan2 = new Kendaraan ("BK 1004 KB", "Mobil");
        mhs1.setDosenWali(dosen2);
        mhs1.setKendaraan(kendaraan2);
        mhs1.printDetailMhs();
    }
}