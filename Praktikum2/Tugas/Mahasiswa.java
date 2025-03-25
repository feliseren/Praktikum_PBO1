/*Nama File = Mahasiswa.java
 *Deskripsi = berisi atribut dan method dalam class Mahasiswa
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Februari 2025
*/

import java.util.ArrayList;

class Mahasiswa {
    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul; 
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    //Method
    public Mahasiswa() {
        this.nim = " ";
        this.nama = " ";
        this.prodi = " ";
        this.listMatkul = new ArrayList<>(); 
    }
    //Konstruktor untuk membuat Mahasiswa(nim,nama,prodi)
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(); 
    }
    
    //Mengembalikan nim
    public String getNIM(){
        return nim ;
    }

    //Mengembalikan nama
    public String getnama(){
        return nama ;
    }

    //Mengembalikan prodi
    public String getprodi(){
        return prodi ;
    }

    //Mengeset DosenWali dengan nilai baru dosenWali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    //Mengeset Kendaraan dengan nilai baru kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //Menambahkan Matkul
    public void addMatKul(MataKuliah newMatKul) {
        listMatkul.add(newMatKul);
    }

    //Mengembalikan banyak SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    //Mengembalikan nilai Jumlah Matkul
    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    //Menampilkan informasi mahasiswa
    public void printMhs() {
        System.out.println("Mahasiswa: " + nim + " - " + nama + " (" + prodi + ")");
    }

    //Menampilkan informasi detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
        if (dosenWali != null) {
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
        System.out.println("------------------------------------------------");
    }
}
