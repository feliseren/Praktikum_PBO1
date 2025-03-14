/*Nama File = Asersi1.java
 *Deskripsi = berisi atribut dan method dalam class Asersi2
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 4 Maret 2025
*/
public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x>0){
            System.out.println ("x bilangan positif");
        }
        else{
            assert(x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}