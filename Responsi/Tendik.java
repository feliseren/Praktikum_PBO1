/*Nama File = Tendik.java
 *Deskripsi = berisi atribut dan method dalam class Tendik
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

class Tendik extends Karyawan {
    //Atribut
    private static int countTendik = 0;

    //Method
    public Tendik(){

    }

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        countTendik ++ ;
    }

    public static int getCountTendik(){
        return countTendik;
    }
    
    public double hitungGaji() {
        return 4000000 + (masaKerja * 0.01 * 4000000);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji       : " + hitungGaji());
    }
}