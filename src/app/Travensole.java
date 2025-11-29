package app;

import java.util.Scanner;
<<<<<<< Updated upstream

import manager.SearchManager;
=======
>>>>>>> Stashed changes
import util.MainUtil;
import data.DataManager; // Import DataManager
import model.Flight;     // Import Model Flight
import model.Hotel;      // Import Model Hotel

public class Travensole {
    // ALUR - mulai aplikasi dengan klik "Run" di bawah
    public static void main(String[] args) throws Exception {
        showHomeScreen();
    }

    public static void search() {
        // PENJELASAN - Jika user pilih 1 - Cari Penerbangan/Hotel, Jalankan function/fitur search di sini
<<<<<<< Updated upstream
        // System.out.println("search");
        SearchManager.initSearch();
=======
        Scanner sc = new Scanner(System.in); // Scanner lokal untuk method search
        
        System.out.println("\n=== PENCARIAN TRAVENSOLE ===");
        System.out.println("1. Cari Penerbangan");
        System.out.println("2. Cari Hotel");
        System.out.print("Pilih kategori (1/2): ");
        
        int type = 0;
        try {
            type = sc.nextInt();
            sc.nextLine(); // membersihkan buffer newline
        } catch (Exception e) {
            System.out.println("Input tidak valid.");
            return;
        }

        if (type == 1) {
            // LOGIC PENCARIAN FLIGHT
            System.out.println("\n--- Cari Penerbangan ---");
            System.out.print("Kota Asal: ");
            String origin = sc.nextLine();
            System.out.print("Kota Tujuan: ");
            String destination = sc.nextLine();
            System.out.print("Tanggal (YYYY-MM-DD): ");
            String date = sc.nextLine();
            System.out.print("Jumlah Penumpang: ");
            int pax = sc.nextInt();

            System.out.println("\n[Hasil Pencarian]");
            boolean found = false;
            for (Flight f : DataManager.flights) {
                // Mencocokkan Asal dan Tujuan (Case insensitive)
                if (f.getOrigin().equalsIgnoreCase(origin) && 
                    f.getDestination().equalsIgnoreCase(destination)) {
                    System.out.println(f.toString());
                    found = true;
                }
            }
            if (!found) System.out.println("Penerbangan tidak ditemukan.");

        } else if (type == 2) {
            // LOGIC PENCARIAN HOTEL
            System.out.println("\n--- Cari Hotel ---");
            System.out.print("Lokasi Kota: ");
            String location = sc.nextLine();
            System.out.print("Tanggal Check-in (YYYY-MM-DD): ");
            String checkIn = sc.nextLine();
            System.out.print("Tanggal Check-out (YYYY-MM-DD): ");
            String checkOut = sc.nextLine();
            System.out.print("Jumlah Tamu: ");
            int guests = sc.nextInt();

            System.out.println("\n[Hasil Pencarian]");
            boolean found = false;
            for (Hotel h : DataManager.hotels) {
                // Mencocokkan Lokasi (Case insensitive)
                if (h.getLocation().equalsIgnoreCase(location)) {
                    System.out.println(h.toString());
                    found = true;
                }
            }
            if (!found) System.out.println("Hotel tidak ditemukan.");
            
        } else {
            System.out.println("Pilihan kategori salah.");
        }
        
        // Tidak menutup scanner (sc.close()) di sini agar System.in tidak tertutup untuk method lain
>>>>>>> Stashed changes
    };

    public static void openReservationList() {
        // PENJELASAN - Jika user pilih 2 - Lihat Pesanan Saya, Jalankan function/fitur openReservationList/showAll di sini
        System.out.println("Fitur lihat pesanan belum tersedia.");
    };

    public static void cancelReservation() {
        // PENJELASAN - Jika user pilih 3 - Batalkan Reservasi, Jalankan function/fitur pembatalan reservasi di sini
        System.out.println("Fitur pembatalan belum tersedia.");
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
                cancelReservation();
                break;

            case 0:
                // PENJELASAN - Jika user pilih 0 - Exit
                // Exit
                exit();
                break;
        }
    };
}