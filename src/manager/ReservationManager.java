package manager;

import java.util.Scanner;

public abstract class ReservationManager {

    protected static void makeReservation() {
        // Buat logic "membuat reservasi" di sini
    };

    protected static void cancelReservation() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Cancel Reservation =====");
        System.out.print("Masukkan Nomor Konfirmasi Reservasi: ");
        String confirmationNumber = scanner.nextLine();

        // Dummy sementara - nanti dihubungkan dengan data asli
        boolean isFound = false;

        // TODO: Nanti tambahkan pengecekan data reservasi dari ArrayList atau file

        if (isFound) {
            System.out.println("\nReservasi dengan nomor " + confirmationNumber + " berhasil dibatalkan!");
        } else {
            System.out.println("\nReservasi tidak ditemukan! Pastikan nomor konfirmasi benar.");
        }

        System.out.println("================================\n");
    

    }

    protected static void seeAllReservation() {
        // Buat logic "lihat semua reservasi" di sini
    }
}
