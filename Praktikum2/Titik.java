/*Nama File = Titik.java
 *Deskripsi = berisi atribut dan method dalam class Titik
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 18 Februari 2025
*/

public class Titik {
    //Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    //Method
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //Mengeset absis titik dengan nilai baru x
    public void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mengembalikan nilai kuadran
    public int getKuadran(){
        if (absis > 0 && ordinat >0){
            return 1;
        }
        if (absis < 0 && ordinat > 0){
            return 2;
        }
        if (absis < 0 && ordinat < 0){
            return 3;
        }
        if (absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    //Menghitung jarak titik ke pusat
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //Menghitung jarak 2 titik
    public double getJarak(Titik t){
        double dx = this.absis - t.ordinat;
        double dy = this.ordinat - t.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    //refleksi terhadap sumbu x
    public void refleksiX(){
        ordinat = -1 * ordinat;
    }

    //refleksi terhadap sumbu y
    public void refleksiY(){
        absis = -1 * absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
} //end class titik