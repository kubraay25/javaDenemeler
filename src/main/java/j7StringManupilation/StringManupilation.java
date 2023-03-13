package j7StringManupilation;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManupilation {
    public static void main(String[] args) {

        //bir methodu ogrenirken uc seyi bilmemiz gerekir
        //1. bu method ne is yapar
        //2.methodun farkli kullanimlari nasildir
        //3.bu method size ne return eder

        String k = "azim guzeldir hirs kotudur";

        //1.) k stringindeki tum harfleri buyuk harfe ceviriniz

        String a = k.toUpperCase();
        System.out.println(a);

        //2.) k stringindeki tum harfleri kucuk harfe ceviriniz

        String b = k.toLowerCase();
        System.out.println(b);

        //3.) k stringindeki ilk karakteri aliniz

        char c = k.charAt(0);
        System.out.println(c);

        //4.) k stringindeki 2. ve sondan 2. karakteri aliniz ve ekrana yan yana yazdiriniz
        //not:eger soutta d ve e nin arasına hiclik koymassam ascii degerlerini verir

        char d = k.charAt(1);
        char e = k.charAt(24);
        System.out.println(d + "" + e);

        System.out.print(d);
        System.out.println(e);

        //5.)k stringindeki karakter sayisi nedir

        k.length();
        int g = k.length();
        System.out.println(g);

        //6.)k stringindeki ilk dort karakteri aliniz

        String h = k.substring(0, 4);
        System.out.println(h);

        //7.) k Stringindeki "hirs" kelimesini aliniz

        String l=k.substring(14,18);
        System.out.println(l);

        //not: bir karakterden baslayip stringin sonuna kadar almak istersek ikinci indexi yazmayiz
        String m=k.substring(5);
        System.out.println(m);

        //8.) k stringindeki azim kelimesinin olup olmadıgına bakalım

        boolean n=k.contains("azim");  //ders anlatırken hata yap bolean yerine String giremessin
        System.out.println(n);


        //9.) k stringinin belli bir harfle baslayip baslamadıgını kontrol edelim
        // azim kelimesinde true izim keimesinde false verdi

        boolean t=k.startsWith("izim");
        System.out.println(t);

        //10.) k Stringinin 6.karakterden sonra belli bir harfle baslayıp baslamadıgını kontrol ediniz
        boolean y=k.startsWith("i",5);
        System.out.println(y);


        //11.) k Stringinin "kotu" kelimesiyle bitip bitmedigini kontrol ediniz

        boolean z=k.endsWith("kotu");
        System.out.println(z);

        //12.) k Stringindeki "azim" kelimesini "duzenli" kelimesine ceviriniz

        String s=k.replace("azim","duzenli");
        System.out.println(s);

        //13.) k Stringindeki "i" harflerini siliniz
        String x= k.replace("i","");
        System.out.println(x);

        //14.) k Stringindeki tum harfleri "*"a ceviriniz
        String v=k.replaceAll("[a-zA-Z]","*");
        System.out.println(v);


        /* tum rakamlar [1-9]
           tum kucuk harfler [a-z]
           tum buyuk harfler [A-Z]
           tum kucuk ve buyuk harfler [a-zA-Z]
           tum harfler ve rakamlar [a-zA-Z0-9]
           tum noktalama isaretleri \\p{Punct}
           tum sesli harfler [a-e-i-o-u-A-E-I-O-U]
           haricinde demek icin [^]
         */

        //15.) k Stringindeki tum karakterleri "!"e ceviriniz

        String aa=k.replaceAll("[a-z]","!");
        System.out.println(aa);

        // 16.) tum sesli harfleri "?"e cevirin
        String bb=k.replaceAll("[aeiou]","?");
        System.out.println(bb);

        // 17.) kucuk harfler dısındaki tum karakterleri "<>" cevirin

        String cc=k.replaceAll("[^a-z]","<>");
        System.out.println(cc);

        //18.) tum harfler disindaki tum karakterleri "s"ye cevirin

        String dd = k.replaceAll("[^a-zA-Z]","s");
        System.out.println(dd);

        //19.) spaceler disindaki tum karakterleri "k"ye ceviriniz
        String ee= k.replaceAll("[^ ]","k");
        System.out.println(ee);

        //20.) sesli harfler disindaki tum karakterleri "&" cevir

        String ff = k.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(ff);

        /* 21.)asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz

             - en az sekiz karakter olsun
             - space karakteri passwordde olmasin
             - en az bir tane buyuk harf olsun
             - en az bir tane kucuk hafr olsun
             - en az bir tane sembol olsun
             - en az bir tane rakam olsun

         HOCANIN CEVAPLARINA BAK

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen passwordu giriniz");

        //en az sekiz karakter olsun
        String password = scan.nextLine();
        boolean hh = password.length()>7;
        System.out.println(hh);

        //space olmasin
        String kk=password.replace(" ","");
        System.out.println(kk);

        //en az bir tane buyuk harf olsun
        boolean tt =password.replaceAll("[^A-Z]","").length()>0;
        System.out.println(tt);

        //en az bir tane kucuk harf olsun
        boolean uu=password.replaceAll("[^a-z]","").length()>0;
        System.out.println(uu);

        //en az bir tane sembol olsun
        boolean ll=password.replaceAll("[a-zA-Z0-1]","").length()>0;
        System.out.println(ll);

        //en az bir tane rakam olsun
        boolean gg=password.replaceAll("[^0-9]","").length()>0;
        System.out.println(gg);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




    }


}
