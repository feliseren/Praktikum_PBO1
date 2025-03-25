/*Nama File = Manusia.java
 *Deskripsi = berisi atribut dan method dalam class Manusia
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 20 Maret 2025
*/

import java.time.Period;
import java.time.LocalDate;

abstract class Manusia {
    //Atribut
    protected String nama, alamat;
    protected LocalDate tgl_mulai_kerja;
    protected double pendapatan;
    protected static int counterMns = 0;

    //Method
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns ++ ;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
    
    public abstract int hitungMasaKerja();
}
