/*Nama File = Petani.java
 *Deskripsi = berisi atribut dan method dalam class Petani
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 20 Maret 2025
*/

import java.time.Period;
import java.time.LocalDate;

class Petani extends Manusia implements Pajak {
    //Atribut
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public String getAsalKota(){
        return asalKota;
    }

    public void setAsalKota(String asalKota){
        this.asalKota = asalKota;
    }

    public int hitungMasaKerja() {
        Period period = Period.between(tgl_mulai_kerja, LocalDate.now());
        return period.getYears() + 0;
    }

    public double hitungPajak() {
        return 0.0;
    }
}