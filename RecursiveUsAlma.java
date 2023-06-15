import java.util.Scanner;

public class RecursiveUsAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban değerini girmesini iste
        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();

        // Kullanıcıdan üs değerini girmesini iste
        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        // Recursive metodu kullanarak üs alma işlemini hesapla
        int result = exponentiation(base, exponent);

        // Sonucu ekrana yazdır
        System.out.println("Sonuç: " + result);
    }

    // Recursive metot ile üs alma işlemini hesaplayan fonksiyon
    public static int exponentiation(int base, int exponent) {
        // Temel durum: Eğer üs değeri 0 ise, 1'i döndür
        if (exponent == 0) {
            return 1;
        } 
        // Recursive durum: Üs alma işlemini tabanı, üs değerinden 1 eksilterek kendisiyle tekrarla
        else {
            return base * exponentiation(base, exponent - 1);
        }
    }
}
