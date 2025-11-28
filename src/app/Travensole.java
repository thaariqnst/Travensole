package app;

import java.util.Scanner;
import manager.ReservationManager;  // Tambahkan import ini
import util.MainUtil;

public class Travensole {
     private static Scanner scanner = new Scanner(System.in);
    // ALUR - mulai aplikasi dengan klik "Run" di bawah
    public static void main(String[] args) throws Exception {
        showHomeScreen();
    }

    public static void search() {
        // PENJELASAN - Jika user pilih 1 - Cari Penerbangan/Hotel, Jalankan function/fitur search di sini
        System.out.println("search");
    };

    public static void openReservationList() {
    	 ReservationManager.seeAllReservation();
         
    	// PENJELASAN - Jika user pilih 2 - Lihat Pesanan Saya, Jalankan function/fitur openReservationList/showAll di sini
         System.out.println("Tekan Enter untuk kembali ke menu utama...");
         scanner.nextLine();
         showHomeScreen();  // Kembali ke menu utama
         
    };

    public static void cancelReservation() {
        // PENJELASAN - Jika user pilih 3 - Batalkan Reservasi, Jalankan function/fitur pembatalan reservasi di sini
        System.out.println("cancelReservation");
    }

    public static void exit() {
        // PENJELASAN - Jika user pilih 0 - Exit, Jalankan function/fitur exit di sini
        System.out.println("Thank you for using Travensole!");
        System.exit(0);
    };

    // PENJELASAN - showHomeScreen adalah contoh function untuk mengambil dan validasi input
    public static void showHomeScreen() {
        MainUtil util = new MainUtil();

        // ALUR - menampilkan judul dan tampilan
        util.showTitle("TRAVENSOLE");

        System.out.println("\n");
        System.out.println("                                        ╔══════════════════════════════════════╗");
        System.out.println("                                        ║              Main Menu               ║");
        System.out.println("                                        ╠══════════════════════════════════════╣");
        System.out.println("                                        ║        1. Cari Penerbangan/Hotel     ║");
        System.out.println("                                        ║        2. Lihat Pesanan Saya         ║");
        System.out.println("                                        ║        3. Batalkan Reservasi         ║");
        System.out.println("                                        ║        0. Keluar                     ║");
        System.out.println("                                        ╚══════════════════════════════════════╝");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        int choice = -1;

        while (!inputValid) {
            try {
                // ALUR - menampilkan arahan untuk user untuk input
                System.out.println("Selamat datang di Travensole! pilih menu di bawah untuk melanjutkan");
                System.out.print("Pilihan anda: ");
                choice = scanner.nextInt();

                if (choice >= 0 && choice <= 3) {
                    // ALUR - jika user memilih 1, 2, 3, atau 0, variable inputValid menjadi true agar code berjalan
                    inputValid = true;
                } else {
                    // ALUR - jika user memilih angka selain 1, 2, 3, atau 0, berikan warning 
                    System.out.println("Invalid option! silahkan pilih 1, 2, 3, atau 0");
                }
            } catch (Exception e) {
                // ALUR - jika user memilih selain angka, berikan warning
                System.err.println("Invalid input! gunakan angka untuk memilih");
                scanner.nextLine();
            }
        }

        // ALUR - input yang diberikan oleh user akan disalurkan ke function handleInput
        handleInput(choice);

        scanner.close();
    };

    // PENJELASAN - handle adalah contoh function untuk menyalurkan input ke fitur yang diinginkan
    private static void handleInput(int choice) {
        switch (choice) {
            case 1:
                // PENJELASAN - Jika user pilih 1 - Make a Reservation
                search();
                break;

            case 2:
                // PENJELASAN - Jika user pilih 2 - My Reservation
                openReservationList();
                break;

            case 3:
                // PENJELASAN - Jika user pilih 3 - Batalkan Reservasi
                // Cancel Reservation

                break;

            case 0:
                // PENJELASAN - Jika user pilih 0 - Exit
                // Exit
                exit();
                break;
        }
    };
}
