package manager;

public abstract class ReservationManager {

    protected static void makeReservation() {
        // Buat logic "membuat reservasi" di sini
    };

    protected static void cancelReservation() {
        // Buat logic "batalkan reservasi" di sini
    };

    protected static void seeAllReservation() {
        // Buat logic "lihat semua reservasi" di sini
    };
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
        if (!flightFound) System.out.println("Penerbangan tidak ditemukan.");

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
        if (!hotelFound) System.out.println("Hotel tidak ditemukan.");

    } else {
        System.out.println("Pilihan kategori salah.");
    }
}


