import java.util.Scanner;

public class StudiKasus207 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, juara, peringkat, statusPendanaan; // Java secara otomatis mengonversi tipe data dari byte
                                                              // menjadi integer
        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine().trim();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine().trim();
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println(
                        "Status : Peringkat tidak memenuhi syarat (bukan juara 1, 2, atau 3). Dana penghargaan tidak diberikan.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (angka 1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = sc.nextInt();
            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println(
                            "Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen)
                                    + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status : Kegiatan tersebut tidak memperoleh dana penghargaan.");
        }
    }
}