package cinzodyagi;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        // Kullanıcıdan doğum yılını alınması
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı burcunun hesaplanması
        String zodyakBurcu;

        if (dogumYili % 12 == 0) {
            zodyakBurcu = "Maymun";
        } else if (dogumYili % 12 == 1) {
            zodyakBurcu = "Horoz";
        } else if (dogumYili % 12 == 2) {
            zodyakBurcu = "Köpek";
        } else if (dogumYili % 12 == 3) {
            zodyakBurcu = "Domuz";
        } else if (dogumYili % 12 == 4) {
            zodyakBurcu = "Fare";
        } else if (dogumYili % 12 == 5) {
            zodyakBurcu = "Öküz";
        } else if (dogumYili % 12 == 6) {
            zodyakBurcu = "Kaplan";
        } else if (dogumYili % 12 == 7) {
            zodyakBurcu = "Tavşan";
        } else if (dogumYili % 12 == 8) {
            zodyakBurcu = "Ejderha";
        } else if (dogumYili % 12 == 9) {
            zodyakBurcu = "Yılan";
        } else if (dogumYili % 12 == 10) {
            zodyakBurcu = "At";
        } else {
            zodyakBurcu = "Koyun";
        }

        // Sonucun ekrana yazdırılması
        System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
    }
}
