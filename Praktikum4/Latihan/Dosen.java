/*Nama File = Dosen.java
 *Deskripsi = berisi atribut dan method dalam class Dosen
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 11 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class Dosen extends Pegawai{
    private String fakultas;
    public Dosen (){
    }

    public Dosen(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("");
        System.out.println("Fakultas              : " + fakultas);
    }
}