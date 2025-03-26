/*Nama File = MManusia.java
 *Deskripsi = berisi main MManusia
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 20 Maret 2025
*/

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "123456");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "987654");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Semarang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja() + " tahun");

        System.out.println("\nInfo PNS:");
        p1.cetakInfo();
        System.out.println("\nInfo Pengusaha:");
        pe1.cetakInfo();
        System.out.println("\nInfo Petani:");
        pt1.cetakInfo();
    }
}
