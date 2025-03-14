/*Nama File = Tendik.java
 *Deskripsi = berisi atribut dan method dalam class Tendik
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 11 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;


public class Tendik extends Pegawai{
    private String bidang;
    private static final int BUP = 55;

    public Tendik(){
    }

    public Tendik (String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public int hitungMasaKerja() {
        return Period.between(getTMT(), LocalDate.now()).getYears();
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGajiPokok();
    }

    public LocalDate hitungBUP() {
        return getTanggal_lahir().plusYears(BUP).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("");
        System.out.println("Bidang                : " + bidang);
        System.out.println("Tunjangan             : Rp " + hitungTunjangan());
        System.out.println("BUP                   : " + getFormattedDate(hitungBUP()));
    }
}