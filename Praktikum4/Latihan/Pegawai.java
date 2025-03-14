/*Nama File = Pegawai.java
 *Deskripsi = berisi atribut dan method dalam class Pegawai
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 11 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(){
    }

    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggal_lahir(){
        return tanggal_lahir;
    } 

    public void setTanggal_lahir(LocalDate tanggal_lahir){
        this.tanggal_lahir = tanggal_lahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    public void printInfo() {
        System.out.println("NIP                   : " + NIP);
        System.out.println("Nama                  : " + nama);
        System.out.println("Tanggal Lahir         : " + getFormattedDate(tanggal_lahir));
        System.out.println("TMT                   : " + getFormattedDate(TMT));
        System.out.printf("Gaji Pokok            : Rp " + getGajiPokok());
    }
}
