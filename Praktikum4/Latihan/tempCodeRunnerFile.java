System.out.println("Dosen Tetap");
        DosenTetap dosen1 = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika");

        dosen1.printInfo();

        System.out.println(" ");
        System.out.println("Dosen Tamu");
        DosenTamu dosenTamu1 = new DosenTamu("123456789", "87654321", "Budi", LocalDate.of(1985, 8, 10), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Teknik", 24, LocalDate.of(2026, 12, 1));

        dosenTamu1.printInfo();