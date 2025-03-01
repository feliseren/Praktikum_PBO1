/*Nama File = Kendaraan.java
 *Deskripsi = berisi atribut dan method dalam class Kendaraan
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Februari 2025
*/

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String Jenis;

    //Method
    public Kendaraan (){
        noPlat = " ";
        Jenis = " ";
    }
    //Konstruktor untuk membuat Kendaraan(x,y)
    public Kendaraan(String x, String y){
        this.noPlat = x ;
        this.Jenis = y;
    }

    //Mengembalikan nilai noPlat
    public String getnoPlat(){
        return noPlat;
    }

    //Mengembalikan Jenis Kendaraan
    public String getJenis(){
        return Jenis;
    }

    //Mengeset noPlat Kendaraan dengan nilai baru x
    public void setnoPlat(String x){
        this.noPlat = x;
    }

    //Mengeset Jenis Kendaraan dengan nilai baru y
    public void setJenis(String y){
        this.Jenis = y;
    }

    //Menampilkan informasi mengenai kendaraan
    public void printKendaraan() {
        System.out.println("Kendaraan: " + noPlat + " - " + Jenis);
    }
}