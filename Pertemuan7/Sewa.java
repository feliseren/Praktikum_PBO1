/*Nama File = Sewa.java
 *Deskripsi = berisi atribut dan method dalam class Sewa
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 22 April 2025
*/

public class Sewa{
    public static void main (String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50,1000);
        mobil.calRent(50,1000);
        bis.calRent(50,1000);
    }
}