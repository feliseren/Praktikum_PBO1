/*Nama File = MataKuliah.java
 *Deskripsi = berisi atribut dan method dalam class MataKuliah
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Februari 2025
*/

public class MataKuliah {
    // Atribut
    private String idMatkul ;
    private String Nama ;
    private int sks ;

    //Method
    public MataKuliah(){
        idMatkul = " ";
        Nama = " ";
        sks = 0 ;
    }
    //Konstruktor untuk membuat MataKuliah (xm,ym,zm)
    public MataKuliah(String xm, String ym, int zm){
        this.idMatkul = xm;
        this.Nama = ym;
        this.sks = zm;
    }

    //Mengembalikan nilai idMatkul
    public String getidMatkul(){
        return idMatkul;
    }

    //Mengembalikan nama Matkul
    public String getNama(){
        return Nama;
    }

    //Mengembalikan nilai SKS
    public int getSks(){
        return sks;
    }

    //Mengeset idMatkul dengan nilai baru x
    public void setidMatkul(String x){
        this.idMatkul = x;
    }

    //Mengeset Nama Matkul dengan nilai baru y
    public void setNama(String y){
        this.Nama = y;
    }

    //Mengeset sks Matkul dengan nilai baru z
    public void setSks(int z){
        this.sks = z;
    }

    //Menampilkan informasi mengenai Mata Kuliah
    public void printMatKul() {
        System.out.println("Mata Kuliah: " + idMatkul + " - " + Nama + " - " + sks);
    }
}
