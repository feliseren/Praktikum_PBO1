/*Nama File = Karyawan.java
 *Deskripsi = berisi atribut dan method dalam class Karyawan
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

abstract class Karyawan extends CivitasAkademika {
    //Atribut
    protected String NIP;
    protected int masaKerja;

    //Method
    public Karyawan(){

    }

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNip(String NIP){
        this.NIP = NIP;
    }

    public int masaKerja(){
        return masaKerja;
    }

    public void setMasakerja(int masaKerja){
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP        : " + NIP);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
    }
}