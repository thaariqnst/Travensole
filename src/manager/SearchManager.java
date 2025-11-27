package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.DummyData;
import model.FlightItem;
import model.HotelItem;
import util.MainUtil;

public class SearchManager {

    public static void startSearch() {
        MainUtil util = new MainUtil();
        
        util.clearTerminal();
        System.out.println("                                        ╔══════════════════════════════════════╗");
        System.out.println("                                        ║                 Search               ║");
        System.out.println("                                        ╠══════════════════════════════════════╣");
        System.out.println("                                        ║        1. Cari Penerbangan           ║");
        System.out.println("                                        ║        2. Cari Hotel                 ║");
        System.out.println("                                        ║        0. Keluar                     ║");
        System.out.println("                                        ╚══════════════════════════════════════╝");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        int choice = -1;

        while (!inputValid) {
            try {
                System.out.println("Ingin cari apa hari ini? pilih menu di bawah untuk melanjutkan");
                System.out.print("Pilihan anda: ");
                choice = scanner.nextInt();

                if (choice >= 0 && choice <= 2) {
                    inputValid = true;
                } else {
                    System.out.println("Invalid option! silahkan pilih 1, 2, atau 0");
                }
            } catch (Exception e) {
                System.err.println("Invalid input! gunakan angka untuk memilih");
                scanner.nextLine();
            }
        }

        handleInput(choice);
        scanner.close();
    };

    private static void handleInput(int choice) {
        switch (choice) {
            case 1:
                searchFlights();
                break;

            case 2:
                searchHotels();
                break;

            case 0:
                System.out.println("Thank you for using Travensole!");
                System.exit(0);
                break;
        }
    };

    private static void searchFlights() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Cari Penerbangan ===");
        System.out.print("Origin (mis: Jakarta (CGK)): ");
        String origin = scanner.nextLine();

        System.out.print("Destination (mis: Bali (DPS)): ");
        String destination = scanner.nextLine();

        // System.out.print("Tanggal (DD-MM-YYYY): ");
        // String date = scanner.nextLine();

        List<FlightItem> flights = DummyData.getFlightItems();
        List<FlightItem> results = new ArrayList<>();

        for (FlightItem f : flights) {
            if (f.getOrigin().equalsIgnoreCase(origin)
                    && f.getDestination().equalsIgnoreCase(destination)) {
                results.add(f);
            }
        }

        if (results.isEmpty()) {
            System.out.println("\n❌ Tidak ada penerbangan yang cocok.");
        } else {
            System.out.println("\n✈ Hasil Pencarian Penerbangan:");
            for (FlightItem f : results) {
                System.out.println("----------------------------------");
                System.out.println("ID: " + f.getId());
                System.out.println("Maskapai: " + f.getName());
                System.out.println("Dari: " + f.getOrigin());
                System.out.println("Ke: " + f.getDestination());
                System.out.println("Tanggal: " + f.getDate());
                System.out.println("Harga: Rp " + f.getPrice());
            }
        }
    }

    private static void searchHotels() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Cari Hotel ===");
        System.out.print("Lokasi (mis: Jakarta): ");
        String location = scanner.nextLine();

        System.out.print("Tanggal Check-in (DD-MM-YYYY): ");
        String date = scanner.nextLine();

        List<HotelItem> hotels = DummyData.getHotelItems();
        List<HotelItem> results = new ArrayList<>();

        for (HotelItem h : hotels) {
            if (h.getLocation().equalsIgnoreCase(location)
                    && h.getCheckInDate().equalsIgnoreCase(date)) {
                results.add(h);
            }
        }

        if (results.isEmpty()) {
            System.out.println("\n❌ Tidak ada hotel yang cocok.");
        } else {
            System.out.println("\n🏨 Hasil Pencarian Hotel:");
            for (HotelItem h : results) {
                System.out.println("----------------------------------");
                System.out.println("ID: " + h.getHotelId());
                System.out.println("Nama: " + h.getHotelName());
                System.out.println("Lokasi: " + h.getLocation());
                System.out.println("Check-in: " + h.getCheckInDate());
                System.out.println("Check-out: " + h.getCheckOutDate());
                System.out.println("Tamu: " + h.getGuestCount());
                System.out.println("Harga: Rp " + h.getPrice());
            }
        }
    }
}
