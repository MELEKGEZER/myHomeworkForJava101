import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrekansBulucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin uzunluğunu girin: ");
        int uzunluk = scanner.nextInt();

        int[] dizi = new int[uzunluk];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        // Elemanların frekanslarını hesaplamak için bir HashMap kullanalım
        Map<Integer, Integer> frekanslar = new HashMap<>();

        // Diziyi dolaşarak frekansları hesaplayalım
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eğer eleman zaten frekanslar map'inde varsa, frekansı 1 arttıralım
                int frekans = frekanslar.get(eleman);
                frekanslar.put(eleman, frekans + 1);
            } else {
                // Eğer eleman frekanslar map'inde yoksa, frekansı 1 olarak başlatalım
                frekanslar.put(eleman, 1);
            }
        }

        // Frekansları ekrana yazdıralım
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            int eleman = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
