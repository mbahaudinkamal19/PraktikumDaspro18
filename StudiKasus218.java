import java.util.Scanner;

public class StudiKasus218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        // Pemilihan tingkat 1: Memisahkan "LAINNYA" yang otomatis tidak dapat dana
        if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        } else {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();

            int juara = 0;
            int statusPKM = 0;

            // Pemilihan untuk input tambahan sesuai kegiatan
            if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                statusPKM = sc.nextInt();
            } else {
                System.out.print("Peringkat juara: ");
                juara = sc.nextInt();
            }

            // Pemilihan tingkat 2: Pengecekan kelengkapan dokumen
            if (dokumen < 4) {
                int kurang = 4 - dokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                // Pemilihan tingkat 3: Pengecekan syarat juara atau pendanaan
                if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                    if (statusPKM == 1) {
                        System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                    } else {
                        System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos).");
                    }
                } else {
                    // Cabang untuk BELMAWA, BAKORMA, MANDIRI
                    if (juara >= 1 && juara <= 3) {
                        System.out.println("Status: Berhak memperoleh dana penghargaan.");
                    } else {
                        System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                    }
                }
            }
        }

        sc.close();
    }
}
