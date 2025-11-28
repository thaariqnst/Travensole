package data;

import java.util.ArrayList;
import java.util.List;
import model.Flight;
import model.Hotel;

public class DataManager {
    public static List<Flight> flights = new ArrayList<>();
    public static List<Hotel> hotels = new ArrayList<>();
    static {
        // DATA PENERBANGAN (25 Item)
        // Format: No Penerbangan, Maskapai, Asal, Tujuan, Tanggal, Kursi, Harga
            
        // Garuda Indonesia
        flights.add(new Flight("GA101", "Garuda Indonesia", "Jakarta", "Bali", "2025-12-01", 150, 1900000));
        flights.add(new Flight("GA102", "Garuda Indonesia", "Jakarta", "Surabaya", "2025-12-01", 120, 1200000));
        flights.add(new Flight("GA103", "Garuda Indonesia", "Jakarta", "Tokyo", "2025-12-01", 300, 8500000));
        flights.add(new Flight("GA104", "Garuda Indonesia", "Bali", "Jakarta", "2025-12-01", 150, 1850000));
        flights.add(new Flight("GA105", "Garuda Indonesia", "Surabaya", "Jakarta", "2025-12-01", 120, 1150000));

        // Singapore Airlines
        flights.add(new Flight("SQ201", "Singapore Airlines", "Jakarta", "Singapore", "2025-12-01", 200, 2500000));
        flights.add(new Flight("SQ202", "Singapore Airlines", "Surabaya", "Singapore", "2025-12-01", 180, 2100000));
        flights.add(new Flight("SQ203", "Singapore Airlines", "Bali", "Singapore", "2025-12-01", 200, 3200000));
        
        // AirAsia
        flights.add(new Flight("QZ801", "AirAsia", "Jakarta", "Bali", "2025-12-01", 180, 800000));
        flights.add(new Flight("QZ802", "AirAsia", "Bandung", "Bali", "2025-12-01", 160, 750000));
        flights.add(new Flight("QZ803", "AirAsia", "Jakarta", "Kuala Lumpur", "2025-12-01", 180, 650000));
        flights.add(new Flight("QZ804", "AirAsia", "Medan", "Penang", "2025-12-01", 150, 500000));
        
        // Lion Air & Batik Air
        flights.add(new Flight("JT501", "Lion Air", "Jakarta", "Medan", "2025-12-01", 200, 950000));
        flights.add(new Flight("JT502", "Lion Air", "Jakarta", "Makassar", "2025-12-01", 190, 1100000));
        flights.add(new Flight("JT503", "Lion Air", "Balikpapan", "Surabaya", "2025-12-01", 150, 850000));
        flights.add(new Flight("ID601", "Batik Air", "Jakarta", "Singapore", "2025-12-01", 160, 1200000));
        flights.add(new Flight("ID602", "Batik Air", "Jakarta", "Padang", "2025-12-01", 150, 1050000));

        // Citilink
        flights.add(new Flight("QG701", "Citilink", "Jakarta", "Yogyakarta", "2025-12-01", 180, 700000));
        flights.add(new Flight("QG702", "Citilink", "Jakarta", "Bali", "2025-12-01", 180, 900000));

        // International Flights
        flights.add(new Flight("NH801", "ANA", "Jakarta", "Tokyo", "2025-12-01", 250, 9200000));
        flights.add(new Flight("EK301", "Emirates", "Jakarta", "Dubai", "2025-12-01", 350, 12500000));
        flights.add(new Flight("MH701", "Malaysia Airlines", "Jakarta", "Kuala Lumpur", "2025-12-01", 180, 1400000));
        flights.add(new Flight("JL720", "Japan Airlines", "Jakarta", "Tokyo", "2025-12-01", 200, 9800000));
        flights.add(new Flight("CX800", "Cathay Pacific", "Jakarta", "Hong Kong", "2025-12-01", 250, 4500000));
        flights.add(new Flight("TK500", "Turkish Airlines", "Jakarta", "Istanbul", "2025-12-01", 300, 11000000));


        // DATA HOTEL (25 Item)
        // Format: ID, Nama Hotel, Lokasi, CheckIn, CheckOut, Tamu, Harga
        // Note: Semua CheckIn 2025-12-01, CheckOut diset +1 atau +2 hari 

        // Jakarta
        hotels.add(new Hotel("HT01", "Hotel Mulia", "Jakarta", "2025-12-01", "2025-12-02", 2, 3000000));
        hotels.add(new Hotel("HT02", "Kempinski Indonesia", "Jakarta", "2025-12-01", "2025-12-02", 2, 3500000));
        hotels.add(new Hotel("HT03", "Fairmont Jakarta", "Jakarta", "2025-12-01", "2025-12-03", 2, 3200000));
        hotels.add(new Hotel("HT04", "Ritz-Carlton", "Jakarta", "2025-12-01", "2025-12-02", 2, 4500000));
        hotels.add(new Hotel("HT05", "Harris Suites", "Jakarta", "2025-12-01", "2025-12-02", 2, 800000));

        // Bali
        hotels.add(new Hotel("HT06", "Hard Rock Hotel", "Bali", "2025-12-01", "2025-12-03", 4, 2500000));
        hotels.add(new Hotel("HT07", "Ayana Resort", "Bali", "2025-12-01", "2025-12-03", 2, 4200000));
        hotels.add(new Hotel("HT08", "Padma Resort", "Bali", "2025-12-01", "2025-12-04", 2, 3100000));
        hotels.add(new Hotel("HT09", "St. Regis Bali", "Bali", "2025-12-01", "2025-12-03", 2, 9500000));
        hotels.add(new Hotel("HT10", "W Bali Seminyak", "Bali", "2025-12-01", "2025-12-02", 2, 5500000));

        // Bandung
        hotels.add(new Hotel("HT11", "The Trans Luxury", "Bandung", "2025-12-01", "2025-12-02", 3, 2200000));
        hotels.add(new Hotel("HT12", "Padma Hotel Bandung", "Bandung", "2025-12-01", "2025-12-02", 2, 2800000));
        hotels.add(new Hotel("HT13", "Hilton Bandung", "Bandung", "2025-12-01", "2025-12-02", 2, 1900000));
        hotels.add(new Hotel("HT14", "Aryaduta Bandung", "Bandung", "2025-12-01", "2025-12-02", 2, 950000));
        hotels.add(new Hotel("HT15", "GH Universal", "Bandung", "2025-12-01", "2025-12-02", 2, 1200000));

        // Surabaya
        hotels.add(new Hotel("HT16", "Hotel Majapahit", "Surabaya", "2025-12-01", "2025-12-02", 2, 1500000));
        hotels.add(new Hotel("HT17", "JW Marriott SBY", "Surabaya", "2025-12-01", "2025-12-02", 2, 1800000));
        hotels.add(new Hotel("HT18", "Sheraton Surabaya", "Surabaya", "2025-12-01", "2025-12-03", 2, 1750000));
        hotels.add(new Hotel("HT19", "Bumi Surabaya", "Surabaya", "2025-12-01", "2025-12-02", 2, 1100000));
        hotels.add(new Hotel("HT20", "Vasa Hotel", "Surabaya", "2025-12-01", "2025-12-02", 2, 2100000));

        // Singapore
        hotels.add(new Hotel("HT21", "Marina Bay Sands", "Singapore", "2025-12-01", "2025-12-03", 2, 8500000));
        hotels.add(new Hotel("HT22", "Raffles Hotel", "Singapore", "2025-12-01", "2025-12-02", 2, 12000000));
        hotels.add(new Hotel("HT23", "The Fullerton", "Singapore", "2025-12-01", "2025-12-02", 2, 4500000));
        hotels.add(new Hotel("HT24", "V Hotel Lavender", "Singapore", "2025-12-01", "2025-12-02", 2, 1800000));
        hotels.add(new Hotel("HT25", "Hotel Boss", "Singapore", "2025-12-01", "2025-12-02", 2, 1500000));
    }
}