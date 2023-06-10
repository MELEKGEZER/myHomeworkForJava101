
package VKIHesaplama;

import java.util.Scanner;

public class VücutKitleİndeksi {

    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan boy bilgisi alınır
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        double height = input.nextDouble();
        
        //Kullanıcıdan kilo bilgisi alınır
        System.out.print("Lutfen kilonuzu giriniz: ");
        double weight = input.nextDouble();

        // Vücut Kitle İndeksini hesapla
        double bodyMassIndex = weight / (height * height);

        System.out.println("Vucut Kitle Indeksiniz: " + bodyMassIndex);
    
    }
    
}
