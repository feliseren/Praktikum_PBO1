/*Nama File = Garis.java
 *Deskripsi = berisi atribut dan method dalam class Garis
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 18 Februari 2025
*/

public class Garis {
    //Atribut
    private Titik Tawal; 
    private Titik Takhir;
    private static int counterGaris = 0;

    //Method
    public Garis(){
        Tawal = new Titik(0,0);
        Takhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor untuk membuat garis
    public Garis(Titik Tawal, Titik Takhir){
        this.Tawal = Tawal;
        this.Takhir = Takhir;
    } 
    
    //Mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    //Mengembalikan nilai titik awal garis
    public Titik getTawal(){
        return Tawal;
    }

    //Mengembalikan nilai titik akhir garis
    public Titik getTakhir(){
        return Takhir;
    }

    //Mengeset nilai titik awal dengan nilai titik baru
    public void setTawal(Titik Tawalb){
        this.Tawal = Tawalb;
    }

    //Mengeset nilai titik akhir dengan nilai titik baru
    public void setTakhir(Titik Takhirb){
        this.Takhir = Takhirb;
    }

    //Menghitung panjang sebuah garis
    public double getPanjang(){
        double xx = Takhir.getAbsis() - Tawal.getAbsis();
        double yy = Takhir.getOrdinat() - Tawal.getOrdinat();
        return Math.sqrt(xx*xx + yy*yy); //rumus panjang garis = ((x2-x2)**2 + (y2-y1)**2)**0.5
    }

    //Menghitung gradien garis
    public double getGradien(){
        double xm = Takhir.getAbsis() - Tawal.getAbsis();
        double ym = Takhir.getOrdinat() - Tawal.getOrdinat();
        return ym/xm; //rumus gradien = (y2-y1)/(x2-x1)
    }
    
    //Mengembalikan nilai titik tengah
    public Titik getTengah(){
        double xb = (Tawal.getAbsis() + Takhir.getAbsis())/2; //nilai tengah sumbu x
        double yb = (Tawal.getOrdinat() + Tawal.getOrdinat())/2; //nilai tengah sumbu y
        return new Titik(xb, yb);
    }

    //Mengecek apakah garis sejajar dengan garis lainnya
    public boolean IsSejajar(Garis G){
        return this.getGradien() == G.getGradien(); //sejajar saat m1 = m2
    }

    //Mengecek apakah garis tegak lurus dengan garis lainnya
    public boolean IsTegakLurus(Garis G){
        return this.getGradien()*G.getGradien() == -1; //tegak lurus saat m1*m2 = -1
    }

    //Menampilkan ke layar titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Garis dari (" + Tawal.getAbsis() + ", " + Tawal.getOrdinat() + ") ke (" + Takhir.getAbsis() + ", " + Takhir.getOrdinat() + ")");
    }

    //Menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaan(){
        double m = getGradien(); //gradien
        double c = Takhir.getOrdinat() - (m*Takhir.getAbsis()); //konstanta

        String persamaan = "y = " + m + " x";

        if (c>0){ //Jika nilai konstanta positif
            persamaan += " + " + c;
        }
        if (c<0){ //Jika nilai konstanta negatif
            persamaan += " - " + Math.abs(c);
        }
        //Jika nilai konstanta 0 maka tidak perlu dimasukkan ke persamaan
        return persamaan;
    }
}