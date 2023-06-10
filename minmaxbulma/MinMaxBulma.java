package minmaxbulma;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE; // En büyük sayıyı saklamak için başlangıçta en küçük değeri atarız
        int min = Integer.MAX_VALUE; // En küçük sayıyı saklamak için başlangıçta en büyük değeri atarız

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = input.nextInt();

            if (num > max) {
                max = num; // Eğer girilen sayı mevcut max değerden büyükse, max değerini güncelleriz
            }

            if (num < min) {
                min = num; // Eğer girilen sayı mevcut min değerden küçükse, min değerini güncelleriz
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}

