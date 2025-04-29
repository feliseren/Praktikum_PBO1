/*Nama File = MAnabul.java
 *Deskripsi = berisi main dari anabul
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 28 April 2025
*/

public class MAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        kucing.Gerak();
        kucing.Bersuara();

        anjing.Gerak();
        anjing.Bersuara();

        burung.Gerak();
        burung.Bersuara();
    }
}