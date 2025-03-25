/*Nama File = Asersi2.java
 *Deskripsi = berisi atribut dan method dalam class Asersi2
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 4 Maret 2025
*/

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        assert (keliling > 0) : "Keliling tidak boleh nol!";
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -5;
        assert (jariJari > 0) : "jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double keliling = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + keliling);
    }
}

// PERTANYAAN : 
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas, jelaskan!

// JAWABAN : 
// Asersi Sebaiknya Ditempatkan di Konstruktor
// Asersi (assert) berfungsi untuk memastikan bahwa nilai tertentu tidak melanggar aturan dalam program. Dalam kode yang diberikan, asersi hanya digunakan di dalam main() sebelum objek dibuat. Namun, jika objek lingkaran dibuat di bagian lain dari program, asersi tersebut tidak akan berlaku.
