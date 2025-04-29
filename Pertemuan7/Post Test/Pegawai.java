/*Nama File = Pegawai.java
 *Deskripsi = berisi atribut dan method dalam class Pegawai
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 22 April 2025
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
