/*Nama File = Kucing.java
 *Deskripsi = berisi atribut dan method dalam class Kucing
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 28 April 2025
*/

public class Kucing extends Anabul{
    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + " Bergerak dengan melata");
    } 

    @Override
    public void Bersuara(){
        System.out.println(nama + " Berbunyi meong");
    }
}