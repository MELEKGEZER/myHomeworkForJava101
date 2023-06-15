import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini iste
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        // Sayının asal olup olmadığını kontrol et
        boolean isPrime = isAsal(num);

        // Sonucu ekrana yazdır
        if (isPrime) {
            System.out.println(num + " bir asal sayıdır.");
        } else {
            System.out.println(num + " bir asal sayı değildir.");
        }
    }

    // Sayının asal olup olmadığını kontrol eden metot
    public static boolean isAsal(int num) {
        // Sayı 1 veya daha küçükse, asal sayı değildir
        if (num <= 1) {
            return false;
        }

        // Yardımcı metodu çağırarak sayının asal olup olmadığını kontrol et
        return isAsalHelper(num, num - 1);
    }

    // Sayının asal olup olmadığını kontrol eden yardımcı metot
    private static boolean isAsalHelper(int num, int divisor) {
        // Temel durum: Eğer bölen 1 ise, sayı asaldir
        if (divisor == 1) {
            return true;
        }

        // Eğer sayı bölünebiliyorsa, asal değildir
        if (num % divisor == 0) {
            return false;
        }

        // Bölünemezse, böleni bir azaltarak kendini tekrar çağır
        return isAsalHelper(num, divisor - 1);
    }
}
