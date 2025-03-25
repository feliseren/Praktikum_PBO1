/*Nama File = CivitasAkademika.java
 *Deskripsi = berisi atribut dan method dalam class CivitasAkademika
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

public class CivitasAkademika{
    //Atribut
    private String nama;
    private String email;

    //Method 
    public CivitasAkademika(){

    }

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Email : " + email);
    }
}