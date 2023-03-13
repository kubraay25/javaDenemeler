package Scanner;

import java.util.Scanner;

public class Scanner02 {
    //dikdörtgen alanı
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("dikdörtgenin bir kenar uzunlugu");

        int ilkKenar = scan.nextInt();

        System.out.println("dikdortgenin diger kenar uzunlugu");
        int ikinciKenar = scan.nextInt();

        System.out.println(ikinciKenar * ikinciKenar);
    }
}