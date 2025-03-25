/*Nama File = Dosen.java
 *Deskripsi = berisi atribut dan method dalam class Dosen
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

class Dosen extends Karyawan{
    //Atribut
    private Fakultas fakultas;
    private static int countDosen = 0;

    //Method
    public Dosen(){

    }

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        countDosen ++ ;
    }

    public static int getCountDosen(){
        return countDosen;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01f * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas   : " + fakultas.getNama());
        System.out.println("Gaji       : " + hitungGaji());
    }
}