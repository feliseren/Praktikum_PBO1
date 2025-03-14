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


// PETANYAAN : 
// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
// Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

// JAWABAN : 
// 1. 
// Baris 12 tidak akan dieksekusi jika angka adalah 13. Namun, jika angka bukan 13, maka baris ini akan dieksekusi.
// Karena, Kode ini ada di dalam metode cobaAngka(int angka), Jika angka = 13, maka akan terjadi eksepsi sebelum mencapai baris ini karena:
// if (angka == 13) {
//     throw new AngkaSialException();
// }

// Menyebabkan program akan langsung keluar dari metode dan masuk ke blok catch.
// Artinya, baris 12 tidak akan dieksekusi jika angka adalah 13 tapi dieksekusi jika angka bukan 13


// 2.
// Baris 21 tidak dieksekusi karena setelah eksepsi terjadi, program langsung masuk ke catch, melewatkan semua kode berikutnya dalam blok try. Baris 21 tidak dieksekusi karena setelah eksepsi terjadi, 
// karena baris 21 berada di dalam try setelah pemanggilan:

// as.cobaAngka(13);

// Ketika as.cobaAngka(13); dipanggil, Terjadi eksepsi (throw new AngkaSialException();).
// Program langsung lompat ke blok catch.
// Eksekusi tidak akan kembali ke dalam try setelah eksepsi terjadi.
