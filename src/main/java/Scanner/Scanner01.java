package Scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("kullanicidan ilk ismini aliniz");
        String ilkİism = scan.nextLine();


        System.out.println("kullanicidan soyismini alalim");
        String soyisim = scan.nextLine();

        System.out.println(ilkİism+" "+soyisim);

        System.out.println("kullanicidan adresini aliniz ve ekrana yazdiriniz");
        String adres = scan.nextLine();

        System.out.println("adres:"+" "+adres);


    }


}
