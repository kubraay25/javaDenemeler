package Scanner;

import java.util.Scanner;

public class InputExample {

    //sout kismini kendim yazip kullanicidan ne istiyorsam onu belirtiyorum
    //alacagim cevaba gore data typemi belirleyip veriable olusturuorum
    //konsolda soutun icerisine yazdigim her şeye olusturmus oldugum variableler ile cevap veriyorum
    //burda obje ismim ne ise onunla birlikte (nokta koyarak) istedigim methodu kullanabiliyorum
    //kisaca hatirlamak istersek

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("hangi batch'tesiniz");
        String batch = scan.next();


        System.out.println("hangi mentor grubundasınız");
        String mentor = scan.next();


        System.out.println("kaç kişisiniz");
        int kisiSayisi = scan.nextInt();


        System.out.println("boady grubunuz var mı");
        boolean varMi = scan.hasNext();


        System.out.println(batch + " " + "dayim" + " " + mentor + "mentor grubum" + kisiSayisi + " " + "kisiyiz" + " " + "boady grubumuz" + varMi);
        System.out.println();


        Scanner input = new Scanner(System.in);

        System.out.println("istediginiz sey nedir");
        String isBulmak = input.nextLine();

        System.out.println(isBulmak + " " + "nasip isidir");

    }


}
