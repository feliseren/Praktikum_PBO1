/*Nama File = ExceptionOnArray.java
 *Deskripsi = berisi atribut dan method dalam class ExceptionOnArray
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 4 Maret 2025
*/

public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}