/*Nama File = Mahasiswa.java
 *Deskripsi = berisi atribut dan method dalam class Mahasiswa
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 25 Maret 2025
*/

public class Mahasiswa extends CivitasAkademika{
    //Atribut
    private String NIM;
    private int Semester;
    private Fakultas fakultas;
    private static int countMahasiswa = 0;

    //Method
    public Mahasiswa(){

    }

    public Mahasiswa(String nama, String email, String NIM, int Semester, Fakultas fakultas){
        super(nama, email);
        this.NIM = NIM;
        this.Semester = Semester;
        this.fakultas = fakultas;
        countMahasiswa ++;
    }

    public static int getCountMahasiswa(){
        return countMahasiswa;
    }

    public String getNIM(){
        return NIM;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public int getSemester(){
        return Semester;
    }

    public void setSemester(int Semester){
        this.Semester = Semester;
    }

    public Fakultas getFakultas(){
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, Semester - 1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM       : " + NIM);
        System.out.println("Semester  : " + Semester);
        System.out.println("Fakultas  : " + fakultas.getNama());
        System.out.println("UKT       : " + hitungUKT());
    }
}