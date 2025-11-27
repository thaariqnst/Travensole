package data;

import java.util.ArrayList;
import java.util.List;

import model.FlightItem;
import model.HotelItem;

public class DummyData {

    public static List<FlightItem> getFlightItems() {
        List<FlightItem> list = new ArrayList<>();

        list.add(new FlightItem(
                "F001",
                "Garuda Indonesia - GA123",
                "Jakarta",
                "Bali",
                "2025-12-20",
                180,
                1500000));

        list.add(new FlightItem(
                "F002",
                "AirAsia - QZ987",
                "Surabaya",
                "Kuala Lumpur",
                "2025-11-15",
                200,
                950000));

        list.add(new FlightItem(
                "F003",
                "Batik Air - ID550",
                "Yogyakarta",
                "Jakarta",
                "2025-10-02",
                150,
                1200000));

        return list;
    }

    public static List<HotelItem> getHotelItems() {
        List<HotelItem> list = new ArrayList<>();

        list.add(new HotelItem(
                "H001",
                "Continental",
                "Jakarta",
                "01-01-2025",
                "03-01-2025",
                2,
                5000000));

        list.add(new HotelItem(
                "H002",
                "Hilton",
                "Bandung",
                "02-02-2025",
                "04-02-2025",
                2,
                5000000));

        list.add(new HotelItem(
                "H003",
                "Raffles",
                "Jakarta",
                "03-03-2025",
                "05-03-2025",
                2,
                5000000));

        return list;
    }
}
