import java.util.Scanner;

public class RecursiveRakamIslemleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.print(n + " ");
        rakamIslemleri(n);
    }

    public static void rakamIslemleri(int n) {
        // (n - 5) değerini ekrana yazdır
        System.out.print((n - 5) + " ");

        // n değeri 0 veya negatif olduğunda dur
        if (n <= 0) {
            System.out.println();
            return;
        }

        // n değerinden (n - 5) değeriyle tekrar kendini çağır
        rakamIslemleri(n - 5);

        // (n - 5) değerini ekrana yazdır
        System.out.print((n - 5) + " ");
    }
}
