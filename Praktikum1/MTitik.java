/*Nama File = MTitik.java
 *Deskripsi = berisi berisi main program Titik
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 18 Februari 2025
*/
public class MTitik {
    public static void main (String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println(" ");

        //getAbsis
        System.out.println("Absis dari T4 adalah : " + T4.getAbsis());
        System.out.println(" ");
        
        //getOrdinat
        System.out.println("Ordinat dari T4 adalah : " + T4.getOrdinat());
        System.out.println(" ");

        //setAbsis
        System.out.println("Mengubah nilai absis T4 menjadi -3");
        T4.setAbsis(-3);
        T4.printTitik();
        System.out.println(" ");
        
        //setOrdinat
        System.out.println("Mengubah nilai ordinat T4 menjadi -5");
        T4.setOrdinat(-5);
        T4.printTitik();
        System.out.println(" ");

        //geser
        System.out.println("Mengeser titik T4 sebanyak absis = 3 dan ordinat = 6");
        T4.geser(3, 5);
        T4.printTitik();
        System.out.println(" ");

        //refleksiX
        System.out.println("Refleksi Sumbu X");
        T1.refleksiX();
        T1.printTitik();
        System.out.println(" ");

        //refleksiY
        System.out.println("Refleksi Sumbu Y");
        T1.refleksiY();
        T1.printTitik();
        System.out.println(" ");

        //getRefleksiX
        Titik T5 = new Titik (-3, -5);
        System.out.println("Titik T5 setelah refleksi terhadap sumbu X");
        Titik T5new = T5.getRefleksiX();
        T5new.printTitik();
        System.out.println(" ");

        //getRefleksiY
        System.out.println("Titik T5 setelah refleksi terhadap sumbu Y");
        Titik T5baru = T5.getRefleksiY();
        T5baru.printTitik();
        System.out.println(" ");

        //getKuadran
        System.out.println("Kuadran titik T4 adalah " + T4.getKuadran());
        System.out.println(" ");

        //getJarakPusat
        System.out.println("Jarak titik T4 ke titik pusat adalah " + T4.getJarakPusat());
        System.out.println(" ");

        //getJarak
        System.out.println("Jarak titik T5 dan T4 adalah " + T4.getJarak(T5));
        System.out.println(" ");
    }
}