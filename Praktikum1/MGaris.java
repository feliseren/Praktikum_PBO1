/*Nama File = MGaris.java
 *Deskripsi = berisi main program garis
 *Pembuat   = Felis Eren Cristi Milala/24060123130098
 *Tanggal   = 18 Februari 2025
*/

public class MGaris {
    public static void main (String[] args){
        //Membentuk garis
        Titik TA = new Titik(3, -6);
        Titik TB = new Titik(-1, -4);
        Garis A = new Garis(TA, TB);

        //printGaris
        System.out.println("Garis A : ");
        A.printGaris(); 
        System.out.println(" ");

        //getTawal
        System.out.println("Titik awal Garis A :");
        A.getTawal().printTitik();
        System.out.println(" ");

        //getTakhir
        System.out.println("Titik akhir Garis A :");
        A.getTakhir().printTitik();
        System.out.println(" ");

        //setTawal
        System.out.println("Mengubah Tawal menjadi (-3, 6)");
        Titik Tb1 = new Titik (-3, 6);
        A.setTawal(Tb1);
        A.printGaris();
        System.out.println(" "); 

        //setTakhir
        System.out.println("Mengubah Takhir menjadi (1, 4)");
        Titik Tb2 = new Titik (1, 4);
        A.setTakhir(Tb2);
        A.printGaris();
        System.out.println(" ");

        //getPanjang
        System.out.println("panjang garis A adalah :" + A.getPanjang());
        System.out.println(" ");

        //getGradien
        System.out.println("Gradien garis A adalah : " + A.getGradien());
        System.out.println(" ");

        //getTengah
        System.out.println("Titik tengah garis A adalah : ");
        A.getTengah().printTitik();
        System.out.println(" ");

        //Garis B
        Titik TC = new Titik (-6, 12);
        Titik TD = new Titik (2, 8);
        Garis B = new Garis (TC, TD);
        //Garis C
        Titik TE = new Titik (2, 2);
        Titik TF = new Titik (4, 6);
        Garis C = new Garis(TE, TF);

        //IsSejajar
        System.out.println("Apakah Garis A sejajar dengan Garis B : " + A.IsSejajar(B));
        System.out.println("Apakah Garis A sejajar dengan Garis C : " + A.IsSejajar(C));
        System.out.println(" ");

        //IsTegakLurus
        System.out.println("Apakah Garis A tegak lurus dengan Garis C : " + A.IsTegakLurus(C));
        System.out.println("Apakah Garis A tegak lurus dengan Garis B : " + A.IsTegakLurus(B));
        System.out.println(" ");

        //getPersamaan
        Titik TG = new Titik(-2, 0);
        Titik TH = new Titik(0, 4);
        Garis D = new Garis(TG, TH);
        System.out.println("Persamaan Garis D adalah " + D.getPersamaan());
        System.out.println(" ");
    }
}
