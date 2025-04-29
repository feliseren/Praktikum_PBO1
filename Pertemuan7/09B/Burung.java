/*Nama File = Burung.java
 *Deskripsi = berisi atribut dan method dalam class Burung
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 28 April 2025
*/

public class Burung extends Anabul{
    public Burung(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + " Bergerak dengan terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println(nama + " Berbunyi cuit");
    }
}