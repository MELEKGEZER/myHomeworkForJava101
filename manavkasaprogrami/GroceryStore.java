package manavkasaprogrami;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pearPricePerKg = 2.14;
        double applePricePerKg = 3.67;
        double tomatoPricePerKg = 1.11;
        double bananaPricePerKg = 0.95;
        double eggplantPricePerKg = 5.00;

        System.out.print("Armut Kac Kilo? : ");
        double pearKg = input.nextDouble();

        System.out.print("Elma Kac Kilo? : ");
        double appleKg = input.nextDouble();

        System.out.print("Domates Kac Kilo? : ");
        double tomatoKg = input.nextDouble();

        System.out.print("Muz Kac Kilo? : ");
        double bananaKg = input.nextDouble();

        System.out.print("Patlican Kac Kilo? : ");
        double eggplantKg = input.nextDouble();

        double totalPrice = (pearKg * pearPricePerKg) + (appleKg * applePricePerKg) +
                            (tomatoKg * tomatoPricePerKg) + (bananaKg * bananaPricePerKg) +
                            (eggplantKg * eggplantPricePerKg);

        System.out.println("Toplam Tutar : " + totalPrice + " TL");
    }
}

