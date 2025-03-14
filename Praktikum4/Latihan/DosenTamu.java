/*Nama File = DosenTamu.java
 *Deskripsi = berisi atribut dan method dalam class DosenTamu
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 11 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class DosenTamu extends Dosen{
    private String NIDK;
    private int MasaKontrak;
    private LocalDate AkhirKontrak;

    public DosenTamu(){
    }

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String fakultas, int MasaKontrak, LocalDate AkhirKontrak){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.MasaKontrak = MasaKontrak;
        this.AkhirKontrak = AkhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak(){
        return AkhirKontrak;
    }

    public void setAkhirKontrak(LocalDate AkhirKontrak) {
        this.AkhirKontrak = AkhirKontrak;
    }

    public int hitungMasaKontrak() {
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(today, AkhirKontrak);
        return selisih.getMonths() + (selisih.getYears() * 12); // Konversi tahun ke bulan
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok(); // 2.5% dari gaji pokok
    }
    
    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " +
               date.getMonth().getDisplayName(TextStyle.FULL, new Locale("id", "ID")) + " " +
               date.getYear();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK                  : " + NIDK);
        System.out.println("Jabatan               : Dosen Tamu");
        System.out.println("Masa Kontrak Berakhir : " + getFormattedDate(AkhirKontrak));
        System.out.println("Sisa Masa Kontrak     : " + hitungMasaKontrak() + " bulan");
        System.out.printf("Tunjangan              : Rp "+ hitungTunjangan());
    }
}