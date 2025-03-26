/*Nama File = Pengusaha.java
 *Deskripsi = berisi atribut dan method dalam class Pengusaha
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 20 Maret 2025
*/

import java.time.Period;
import java.time.LocalDate;

class Pengusaha extends Manusia implements Pajak {
    //Atribut
    private String npwp;
    private static int counterPengusaha = 0;

    //Method
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }
    
    @Override
    public int hitungMasaKerja() {
        Period period = Period.between(tgl_mulai_kerja, LocalDate.now());
        return period.getYears() + 8;
    }   

    @Override
    public double hitungPajak() {
        return (0.15) * pendapatan;
    }
}