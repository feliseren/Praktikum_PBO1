/*Nama File = TestPolimorfisme.java
 *Deskripsi = berisi main dari Pegawai
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 22 April 2025
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps){
            emp.tampilData();
        }
    }
}