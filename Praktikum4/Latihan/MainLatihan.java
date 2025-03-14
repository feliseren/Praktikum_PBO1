import java.time.LocalDate;

public class MainLatihan {
    public static void main(String[] args) {
        //Dosen Tetap
        System.out.println("Dosen Tetap");
        DosenTetap dosen1 = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika");
        dosen1.printInfo();

        //Dosen Tamu
        System.out.println(" ");
        System.out.println("Dosen Tamu");
        DosenTamu dosenTamu1 = new DosenTamu("051227", "87654321", "Felis", LocalDate.of(2005, 12, 27), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Kedokteran", 24, LocalDate.of(2026, 12, 1));
        dosenTamu1.printInfo();

        System.out.println(" ");
        System.out.println(" ");

        //Tendik
        System.out.println("Tendik");
        Tendik tendik1 = new Tendik("221272", "Eren", LocalDate.of(2004, 3, 20), LocalDate.of(1995, 9, 1), 5000000, "Akademik");
        tendik1.printInfo();
    }
}