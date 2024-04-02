import java.util.Scanner;

class JumlahHari2 {
    public int hitungHari(int tahun, int bulan) {
        switch (bulan) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0)
                    return 29;
                else
                    return 28;
            default:
                return -1; // Untuk menunjukkan kesalahan jika bulan tidak valid
        }
    }
}

class JumlahHari2Beraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JumlahHari2 jumlahHari2 = new JumlahHari2();

        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        System.out.print("Masukkan bulan: ");
        int bulan = scanner.nextInt();

        // Memastikan bulan dan tahun dalam rentang yang valid
        if (bulan >= 1 && bulan <= 12 && tahun >= 0) {
            int jumlahHari = jumlahHari2.hitungHari(tahun, bulan);
            if (jumlahHari != -1) {
                System.out.println("\033[0;32mJumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + jumlahHari + " hari\033[0m");
            } else {
                System.out.println("\033[0;31mBulan tidak valid.\033[0m");
            }
        } else {
            System.out.println("\033[0;31mMasukan tidak valid.\033[0m");
        }
        scanner.close();
    }
}
