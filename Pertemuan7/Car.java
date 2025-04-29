/*Nama File = Car.java
 *Deskripsi = berisi atribut dan method dalam class Car
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 22 April 2025
*/
public class Car extends Vehicle{
    void calRent (int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = "+ fare);
    }
}