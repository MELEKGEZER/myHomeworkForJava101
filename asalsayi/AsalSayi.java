package asalsayi;

public class AsalSayi {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true; // Sayının asal olup olmadığını belirten flag

            // Sayının 2'den başlayarak kareköküne kadar olan değerlerini kontrol ediyoruz
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Sayı tam bölünüyorsa asal değil
                    break; // İçteki döngüden çık
                }
            }

            // Eğer sayı asalsa ekrana yazdır
            if (isPrime) {
                System.out.println(number + " is a prime number");
            }
        }
    }
}

