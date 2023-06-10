package ucakbiletihesaplama;

import java.util.Scanner;

public class AirlineTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi kilometre cinsinden girin: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı girin: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int travelType = scanner.nextInt();

        scanner.close();

        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            double basePrice = distance * 0.10;

            double discountRate = 0;
            if (age < 12) {
                discountRate = 0.50;
            } else if (age >= 12 && age <= 24) {
                discountRate = 0.10;
            } else if (age >= 65) {
                discountRate = 0.30;
            }

            double discountedPrice = basePrice - (basePrice * discountRate);

            if (travelType == 2) {
                discountedPrice *= 0.80;
            }

            double totalPrice = travelType == 2 ? discountedPrice * 2 : discountedPrice;

            System.out.println("Toplam Tutar = " + totalPrice + " TL");
        }
    }
}

