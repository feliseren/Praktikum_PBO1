/*Nama File = PNS.java
 *Deskripsi = berisi atribut dan method dalam class PNS
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 20 Maret 2025
*/

import java.time.Period;
import java.time.LocalDate;

class PNS extends Manusia implements Pajak{
    //Atribut
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public int hitungMasaKerja(){
        Period period = Period.between(tgl_mulai_kerja, LocalDate.now());
        return period.getYears() + 9;
    }

    public double hitungPajak(){
        return (0.1)*pendapatan;
    }
}