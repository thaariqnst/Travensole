package manager;

import java.util.ArrayList;
import java.util.Scanner;

import model.Reservation;
import model.Flight;
import model.Hotel;
import data.DataManager;

public abstract class ReservationManager {
    protected static ArrayList<Reservation> reservations = new ArrayList<>();

    // Data dummy untuk testing
    static {
        // Ambil Flight pertama dari DataManager (GA101)
        Flight flight1 = DataManager.flights.get(0);
        reservations.add(new Reservation(100001, "John Doe", "Flight", flight1));

        // Ambil Hotel pertama dari DataManager (Hotel Mulia)
        Hotel hotel1 = DataManager.hotels.get(0);
        reservations.add(new Reservation(100002, "Jane Smith", "Hotel", hotel1));

        // Ambil Flight ke-8 dari DataManager (QZ801 - AirAsia)
        Flight flight2 = DataManager.flights.get(8);
        reservations.add(new Reservation(100003, "Ahmad Rizki", "Flight", flight2));

        // Ambil Hotel ke-5 dari DataManager (Hard Rock Hotel Bali)
        Hotel hotel2 = DataManager.hotels.get(5);
        reservations.add(new Reservation(100004, "Siti Nurhaliza", "Hotel", hotel2));
    }

    protected static void makeReservationn() {
        // Buat logic "membuat reservasi" di sini
    }

    protected static void cancelReservation() {
        // Buat logic "batalkan reservasi" di sini
    }

    public static void seeAllReservation() {
        System.out.println("\n");
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    DAFTAR SEMUA RESERVASI                          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        System.out.println();

        if (reservations.isEmpty()) {
            System.out.println("    ⚠ Belum ada reservasi yang tercatat.");
            System.out.println();
            return;
        }

        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);

            System.out.println("─────────────────────────────────────────────────────────────────────");
            System.out.println("  Reservasi #" + (i + 1));
            System.out.println("  No Konfirmasi   : " + (int) r.getConfirmationNumber());
            System.out.println("  Nama Pemesan    : " + r.getCustomerName());

            if (r.getType().equals("Flight")) {
                Flight f = (Flight) r.getItem();
                System.out.println("  Tipe            : Penerbangan");
                System.out.println("  No Penerbangan  : " + f.getId());
                System.out.println("  Maskapai        : " + f.getName());
                System.out.println("  Rute            : " + f.getOrigin() + " → " + f.getDestination());
                System.out.println("  Tanggal         : " + f.getDate());
                System.out.println("  Kursi           : " + f.getAvailableSeats());
                System.out.println("  Total Harga     : Rp " + String.format("%,d", (int) f.getPrice()));

            } else if (r.getType().equals("Hotel")) {
                Hotel h = (Hotel) r.getItem();
                System.out.println("  Tipe            : Hotel");
                System.out.println("  ID Hotel        : " + h.getId());
                System.out.println("  Nama Hotel      : " + h.getName());
                System.out.println("  Lokasi          : " + h.getLocation());
                System.out.println("  Check-in        : " + h.getCheckInDate());
                System.out.println("  Check-out       : " + h.getCheckOutDate());
                System.out.println("  Jumlah Tamu     : " + h.getMaxGuests());
                System.out.println("  Total Harga     : Rp " + String.format("%,d", (int) h.getPrice()));
            }
        }

        System.out.println("─────────────────────────────────────────────────────────────────────");
        System.out.println("\n Total Reservasi: " + reservations.size());
        System.out.println();
    }

}

    public static void makeReservation() {
        Scanner sc = new Scanner(System.in); // Scanner lokal untuk method makeReservation

        System.out.println("\n=== PEMESANAN ===");
        System.out.println("1. Pesan Penerbangan");
        System.out.println("2. Pesan Hotel");
        System.out.print("Pilih kategori (1/2): ");
        int type = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        if (type == 1) {
            // LOGIC PEMESANAN PENERBANGAN
            System.out.println("\n--- Pesan Penerbangan ---");
            System.out.print("Kota Asal: ");
            String origin = sc.nextLine();
            System.out.print("Kota Tujuan: ");
            String destination = sc.nextLine();
            System.out.print("Tanggal (YYYY-MM-DD): ");
            String date = sc.nextLine();
            System.out.print("Jumlah Penumpang: ");
            int pax = sc.nextInt();

            System.out.println("\n[Hasil Pencarian Penerbangan]");
            boolean flightFound = false;
            for (Flight f : DataManager.flights) {
                if (f.getOrigin().equalsIgnoreCase(origin) &&
                        f.getDestination().equalsIgnoreCase(destination)) {
                    // Asumsi reservation confirmation disini
                    System.out.println("Penerbangan ditemukan! Nomor Penerbangan: " + f.getFlightNumber());
                    System.out.println("Penerbangan berhasil dipesan!");
                    flightFound = true;
                    break;
                }
            }
            if (!flightFound)
                System.out.println("Penerbangan tidak ditemukan.");

        } else if (type == 2) {
            // LOGIC PEMESANAN HOTEL
            System.out.println("\n--- Pesan Hotel ---");
            System.out.print("Lokasi Kota: ");
            String location = sc.nextLine();
            System.out.print("Tanggal Check-in (YYYY-MM-DD): ");
            String checkIn = sc.nextLine();
            System.out.print("Tanggal Check-out (YYYY-MM-DD): ");
            String checkOut = sc.nextLine();
            System.out.print("Jumlah Tamu: ");
            int guests = sc.nextInt();

            System.out.println("\n[Hasil Pencarian Hotel]");
            boolean hotelFound = false;
            for (Hotel h : DataManager.hotels) {
                if (h.getLocation().equalsIgnoreCase(location)) {
                    // Asumsi reservation confirmation disini
                    System.out.println("Hotel ditemukan: " + h.getHotelName());
                    System.out.println("Hotel berhasil dipesan!");
                    hotelFound = true;
                    break;
                }
            }
            if (!hotelFound)
                System.out.println("Hotel tidak ditemukan.");

        } else {
            System.out.println("Pilihan kategori salah.");
        }
    }
}
