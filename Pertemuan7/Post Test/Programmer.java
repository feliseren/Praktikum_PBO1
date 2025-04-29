/*Nama File = Programmer.java
 *Deskripsi = berisi atribut dan method dalam class Programmer
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 22 April 2025
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}
