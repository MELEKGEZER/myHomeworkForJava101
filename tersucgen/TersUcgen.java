package tersucgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int stepCount = input.nextInt();

        for (int i = stepCount; i >= 1; i--) {
            for (int j = 1; j <= stepCount - i; j++) {
                System.out.print(" "); // Boşlukları ekrana yazdırır
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Yıldızları ekrana yazdırır
            }
            System.out.println(); // Bir satır aşağıya geçer
        }
    }
}
