package app;

import java.util.Scanner;

import util.MainUtil;

public class Travensole {
    public static void main(String[] args) throws Exception {
        showHomeScreen();
    }

    public static void search() {
        // Jika user pilih 1 - Make a Reservation, Jalankan function/fitur search di sini
        System.out.println("search");
    };

    public static void openReservationList() {
        // Jika user pilih 2 - My Reservation, Jalankan function/fitur ppenReservationList/showAll di sini
        System.out.println("openReservationList");
    };

    public static void exit() {
        // Jika user pilih 3 - Exit, Jalankan function/fitur exit di sini
        System.out.println("Thank you for using Travensole!");
        System.exit(0);
    };

    public static void showHomeScreen() {
        MainUtil util = new MainUtil();

        util.showTitle("TRAVENSOLE");

        System.out.println("                                        ╔════════════════════════════════════╗");
        System.out.println("                                        ║           Main Menu                ║");
        System.out.println("                                        ╠════════════════════════════════════╣");
        System.out.println("                                        ║           1. Make a Reservation    ║");
        System.out.println("                                        ║           2. My Reservation        ║");
        System.out.println("                                        ║           0. Exit                  ║");
        System.out.println("                                        ╚════════════════════════════════════╝");

        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        int choice = -1;

        while (!inputValid) {
            try {
                System.out.println("Selamat datang di Travensole! pilih menu di bawah untuk melanjutkan");
                System.out.print("Pilihan anda: ");
                choice = scanner.nextInt();

                if (choice >= 0 && choice <= 2) {
                    inputValid = true;
                } else {
                    System.out.println("Invalid option! silahkan pilih 1, 2, atau 0");
                    System.out.println("");
                }
            } catch (Exception e) {
                System.err.println("Invalid input! gunakan angka untuk memilih");
                System.out.println("");
                scanner.nextLine();
            }
        }

        handleInput(choice);
        scanner.close();
    };

    private static void handleInput(int choice) {
        switch (choice) {
            case 1:
                // Search a Reservation
                search();
                break;

            case 2:
                // See all Reservation
                openReservationList();
                break;

            case 0:
                // Exit
                exit();
                break;
        }
    };
}
