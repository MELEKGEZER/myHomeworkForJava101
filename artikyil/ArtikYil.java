package artikyil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        // Kullanıcıdan yılın alınması
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        // Artık yıl hesaplama
        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }

        // Sonucun ekrana yazdırılması
        if (artikYil) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}
