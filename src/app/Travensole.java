package app;

import java.util.Scanner;
import manager.ReservationManager;  
import util.MainUtil;
import data.DataManager; 
import model.Flight;     
import model.Hotel;      

public class Travensole {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showHomeScreen();
    }

    public static void showHomeScreen() {
        MainUtil util = new MainUtil();
        util.showTitle("TRAVENSOLE");

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Cari & Pesan (Flight/Hotel)");
            System.out.println("2. Lihat Pesanan Saya");
            System.out.println("3. Batalkan Reservasi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                
                switch (choice) {
                    case 1:
                        ReservationManager.handleBooking(); 
                        break;
                    case 2:
                        ReservationManager.seeAllReservation(); 
                        break;
                    case 3:
                        ReservationManager.cancelReservation(); 
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan Travensole!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
            }
        }
    }
}
