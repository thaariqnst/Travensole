package manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import model.*; 
import data.DataManager;

public class ReservationManager {

    // List polymorphism menyimpan FlightReservation dan HotelReservation
    private static ArrayList<Reservation> reservations = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // Initial dummy data
    static {
        reservations.add(new FlightReservation(100001, "John Doe", DataManager.flights.get(0)));
        reservations.add(new HotelReservation(100002, "Jane Smith", DataManager.hotels.get(0)));
    }

    // --- FITUR: PENCARIAN & BOOKING ---
    public static void handleBooking() {
        System.out.println("\n=== BUAT RESERVASI ===");
        System.out.println("1. Pesan Penerbangan");
        System.out.println("2. Pesan Hotel");
        System.out.print("Pilih (1/2): ");

        int type = sc.nextInt();
        sc.nextLine();

        if (type == 1) {
            System.out.print("Kota Tujuan: ");
            String dest = sc.nextLine();

            System.out.println("\n[Hasil Pencarian]");
            DataManager.flights.stream()
                    .filter(f -> f.getDestination().equalsIgnoreCase(dest))
                    .forEach(System.out::println);

            System.out.print("\nMasukkan No Penerbangan (misal: GA101): ");
            String flightId = sc.nextLine();

            Flight selectedFlight = DataManager.flights.stream()
                    .filter(f -> f.getId().equalsIgnoreCase(flightId))
                    .findFirst()
                    .orElse(null);

            if (selectedFlight != null) {
                System.out.print("Nama Penumpang: ");
                String name = sc.nextLine();

                double confirmNo = new Random().nextInt(900000) + 100000;

                reservations.add(new FlightReservation(confirmNo, name, selectedFlight));
                System.out.println("Sukses! Nomor Konfirmasi Anda: " + (int) confirmNo);
            } else {
                System.out.println("Penerbangan tidak ditemukan.");
            }

        } else if (type == 2) {
            System.out.print("Lokasi Kota: ");
            String loc = sc.nextLine();

            DataManager.hotels.stream()
                    .filter(h -> h.getLocation().equalsIgnoreCase(loc))
                    .forEach(System.out::println);

            System.out.print("\nMasukkan ID Hotel (HTxx): ");
            String hotelId = sc.nextLine();

            Hotel selectedHotel = DataManager.hotels.stream()
                    .filter(h -> h.getId().equalsIgnoreCase(hotelId))
                    .findFirst()
                    .orElse(null);

            if (selectedHotel != null) {
                System.out.print("Nama Tamu: ");
                String name = sc.nextLine();

                double confirmNo = new Random().nextInt(900000) + 100000;

                reservations.add(new HotelReservation(confirmNo, name, selectedHotel));
                System.out.println("Sukses! Nomor Konfirmasi Anda: " + (int) confirmNo);
            } else {
                System.out.println("Hotel tidak ditemukan.");
            }
        }
    }

    // --- FITUR: BATALKAN RESERVASI ---
    public static void cancelReservation() {
        System.out.print("\nMasukkan Nomor Konfirmasi: ");
        double inputNo = sc.nextDouble();
        sc.nextLine();

        boolean found = false;
        Iterator<Reservation> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.getConfirmationNumber() == inputNo) {

                if (r instanceof FlightReservation fr) {
                    System.out.println("Membatalkan Penerbangan: " + fr.getFlight().getName());
                } else if (r instanceof HotelReservation hr) {
                    System.out.println("Membatalkan Hotel: " + hr.getHotel().getName());
                }

                iterator.remove();
                System.out.println("Reservasi berhasil dihapus.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nomor konfirmasi tidak ditemukan.");
        }
    }

    // --- FITUR: LIHAT SEMUA RESERVASI ---
    public static void seeAllReservation() {
        System.out.println("\n=== DAFTAR RESERVASI ===");

        if (reservations.isEmpty()) {
            System.out.println("Belum ada reservasi.");
            return;
        }

        for (Reservation r : reservations) {
            System.out.print("Ref: " + (int) r.getConfirmationNumber() + " | ");
            System.out.print(r.getCustomerName() + " | ");
            System.out.println(r.getDetail());
        }
    }
}
