/*Nama File = AngkaSial.java
 *Deskripsi = berisi atribut dan method dalam class AngkaSial
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 4 Maret 2025
*/

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}


// pertanyaan : 
// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
// Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

// Jawaban:
// 1.  
// Baris 12 tidak akan dijalankan jika nilai `angka` adalah 13. Namun, jika `angka` bukan 13, maka baris ini akan dieksekusi.  
// Hal ini terjadi karena kode berada dalam metode `cobaAngka(int angka)`. Jika `angka` bernilai 13, maka sebelum mencapai baris 12, program akan memicu eksepsi akibat perintah berikut:  
// if (angka == 13) {  
//     throw new AngkaSialException();  
// }

// Akibatnya, program akan langsung keluar dari metode dan masuk ke blok `catch`.  
// Dengan kata lain, baris 12 hanya akan dijalankan jika `angka` tidak bernilai 13.
