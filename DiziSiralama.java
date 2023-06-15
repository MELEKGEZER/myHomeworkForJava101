import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu girin: ");
        int uzunluk = scanner.nextInt();

        int[] dizi = new int[uzunluk];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe doğru sıralayalım
        Arrays.sort(dizi);

        // Sıralanmış diziyi ekrana yazdıralım
        System.out.println("Dizi elemanları (küçükten büyüğe sıralı):");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}
