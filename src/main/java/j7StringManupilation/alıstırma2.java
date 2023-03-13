package j7StringManupilation;

public class alıstırma2 {

    public static void main(String[] args) {

        String yyy = "        guzel olur guzel bakarsan      ";

        //1.)bu stringin bas ve sonundaki bosluklari siliniz

        String zzz = yyy.trim();
        System.out.println(zzz);

        // burda ise butun bosluklari sileriz
        String bbb = yyy.replace(" ", "");
        System.out.println(bbb);


        //2.)asagida ki urunlerin toplam fiyatini bulunuz
        String tv = "$50";
        String radio = "$50";

        String hhh = tv.replace("$", "");
        System.out.println(hhh);

        String ttt = radio.replace("$", "");
        System.out.println(ttt);

        int aaa = Integer.valueOf("50");
        int lll = Integer.valueOf("50");
        System.out.println(aaa + lll);

        //3.)cumlenin ilk harfini ve cumlenin son harfini yazalim
        //   "    ali cAN  "
        String y = "    ali cAN  ";
        char h = y.charAt(4);
        System.out.println(h);
        char n = y.charAt(10);
        System.out.println(n);

        //2.yol
        //en kestirme yol

        System.out.println(y.toUpperCase().trim().charAt(0));

        System.out.println(y.toUpperCase().trim().charAt(4));


        //4.) bir stringin hic karakter icermedigini kontrol eden kodu yaziniz


        String kubra = "ebru";
        boolean z = kubra.length() == 0;
        System.out.println(z);

        boolean klj = y.isEmpty();
        System.out.println(klj);//false

        String olp = y.replaceAll("[a-zA-Z ]", "");
        System.out.println(olp);

        boolean bhy = olp.isEmpty();
        System.out.println(bhy);


        //5.) bir stringin space haric hic bir karakter icermedigini kontrol eden kodu yaziniz
        //cozum yanlis olabilir
        String t = "         ";
        boolean g = t.replace(" ", "").isEmpty();
        System.out.println(g);


        //6.)bir stringte a,e,i characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String go = "Java is easy to learn";

        System.out.println(go.indexOf("a"));
        System.out.println(go.indexOf("e"));
        System.out.println(go.indexOf("i"));
        System.out.println(go.indexOf("a")+go.indexOf("e")+go.indexOf("i"));

        //7.) "Java" kelimesinin ilk olarak kacıncı indexlerde kullanildigi kodu yaziniz

        String bvg="Ah Java vah Java sensiz olmuyor Java";

        int a= bvg.indexOf("Java");
        System.out.println(a);

        go.indexOf("j");
        System.out.println(bvg.indexOf('j'));
        //"j" harfi olmadigi icin -1 verdi cunku olmayan karakterlerde -1 verir

        //8.) a,i,e karakterlerinin son gorunumlerinin indexleri toplamını ekrana yazın

        String v="Java is easy to learn";


        System.out.println( v.lastIndexOf("a"));
        System.out.println(v.lastIndexOf("e"));
        System.out.println(v.lastIndexOf("i"));
        System.out.println(v.lastIndexOf("a")+v.lastIndexOf("e")+v.lastIndexOf("i"));




    }


}
