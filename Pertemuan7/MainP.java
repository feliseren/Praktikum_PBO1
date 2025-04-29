/*Nama File = MainP.java
 *Deskripsi = berisi main dari Person
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 22 April 2025
*/

public class MainP{
    public static void main(String[] args) {
        Person P;
        P = new Student("Sally");
        P.status(1);
    }
}

// Outputnya adalah : 
// Now online : Sally

//bagaimana hasil tersebut didapatkan (hint: apakah “this” pada kelas person dalam
// method status dieksekusi ketika compile time atau runtime)
// Jawaban : 
// karena java menggunakan dynamic method dipatch maka this akan dipilih berdasarkan objek sebenarnya (Student) saat program berjalan(runtime) bukan saat compile