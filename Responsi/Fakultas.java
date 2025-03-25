/*Nama File = Fakultas.java
 *Deskripsi = berisi atribut dan method dalam class Fakultas
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

public class Fakultas{
    //Atribut
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    //Method
    public Fakultas(){

    }

    public Fakultas (String nama, double tarifUKT, double gajiPokok){
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public double getTarifUKT(){
        return tarifUKT;
    }

    public void setTarifUKT(double tarifUKT){
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
  
    public void printInfo() {
        System.out.println("Fakultas   : " + nama);
        System.out.println("Tarif UKT  : " + tarifUKT);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
