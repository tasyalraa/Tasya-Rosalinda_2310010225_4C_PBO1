
package manajemenolahraga;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ManajerKegiatanOlahraga {
    private static ArrayList<Anggota> anggotaList = new ArrayList<>();
    private static ArrayList<Latihan> latihanList = new ArrayList<>();
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            do {
                System.out.println("=== Aplikasi Manajemen Kegiatan Olahraga ===");
                System.out.println("1. Pendaftaran Anggota");
                System.out.println("2. Penjadwalan Latihan");
                System.out.println("3. Melihat Anggota");
                System.out.println("4. Melihat Jadwal Latihan");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = getValidInteger(scanner);
                
                switch (pilihan) {
                    case 1:
                        daftarAnggota(scanner);
                        break;
                    case 2:
                        jadwalkanLatihan(scanner);
                        break;
                    case 3:
                        lihatAnggota();
                        break;
                    case 4:
                        lihatJadwalLatihan();
                        break;
                    case 0:
                        System.out.println("Keluar dari aplikasi.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (pilihan != 0);
        }
    }
       
    private static void daftarAnggota(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Usia: ");
        int usia = getValidInteger(scanner);
        System.out.print("Masukkan Jenis Olahraga: ");
        String olahraga = scanner.nextLine();
        anggotaList.add(new Anggota(nama, usia, olahraga));
        System.out.println("Anggota berhasil didaftarkan!");
    }
    
    private static void jadwalkanLatihan(Scanner scanner) {
        System.out.print("Masukkan Tanggal Latihan: ");
        String tanggal = scanner.nextLine();
        System.out.print("Masukkan Jenis Latihan: ");
        String jenisLatihan = scanner.nextLine();
        latihanList.add(new Latihan(tanggal, jenisLatihan));
        System.out.println("Latihan berhasil dijadwalkan!");
    }
    
    private static void lihatAnggota() {
        System.out.println("Daftar Anggota:");
        for (Anggota anggota : anggotaList) {
            System.out.println(anggota);
        }
    }
    
    private static void lihatJadwalLatihan() {
        System.out.println("Jadwal Latihan:");
        for (Latihan latihan : latihanList) {
            System.out.println(latihan);
        }
    }
    
       // Metode untuk mendapatkan input integer yang valid
    private static int getValidInteger(Scanner scanner) {
        int input = -1;
        while (true) {
            try {
                input = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer
                break; // keluar dari loop jika input valid
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // membersihkan buffer
            }
        }
        return input;
    }
}
