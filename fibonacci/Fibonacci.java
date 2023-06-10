package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisindeki eleman sayısını girin: ");
        int count = input.nextInt(); // Eleman sayısını oku
        
        int ilk = 0; // Fibonacci serisinin ilk elemanı
        int ikinci = 1; // Fibonacci serisinin ikinci elemanı
        
        System.out.print("Fibonacci Serisi: " + ilk + ", " + ikinci);
        
        for (int i = 2; i < count; i++) {
            int sonraki = ilk + ikinci; // Sonraki elemanı hesapla
            System.out.print(", " + sonraki);
            
            ilk = ikinci; // İlk elemanı güncelle
            ikinci = sonraki; // İkinci elemanı güncelle
        }
        
        System.out.println();
    }
}
