/*Nama File = Dosen.java
 *Deskripsi = berisi atribut dan method dalam class Dosen
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Februari 2025
*/

public class Dosen {
    //Atribut
    private String NIP ;
    private String Nama ;
    private String Prodi ;

    //Method 
    public Dosen (){
        NIP = " " ;
        Nama = " " ;
        Prodi = " " ;
    }

    //Konstruktor untuk membuat Dosen (x,y,z)
    public Dosen (String x, String y, String z){
        this.NIP = x ;
        this.Nama = y ;
        this.Prodi = z ;
    }

    //Mengembalikan NIP
    public String getNIP(){
        return NIP ;
    }

    //Mengembalikan Nama
    public String getNama(){
        return Nama ;
    }

    //Mengembalikan Prodi 
    public String getProdi(){
        return Prodi ;
    }

    //Mengeset NIP Dosen dengan nilai baru x
    public void setNIP(String x){
        this.NIP = x ;
    }

    //Mengeset Nama Dosen dengan nilai baru y
    public void setNama(String y){
        this.Nama = y ;
    }

    //Mengeset Prodi Dosen dengan nilai baru z
    public void setProdi(String z){
        this.Prodi = z ;
    }

    //Menampilkan informasi mengenai Dosen
    public void printDosen() {
        System.out.println("Dosen: " + NIP + " - " + Nama + " - " + Prodi + " ");
    }
}
