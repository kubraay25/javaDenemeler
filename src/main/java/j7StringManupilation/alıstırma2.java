package j7StringManupilation;

public class alıstırma2 {

    public static void main(String[] args) {

        String yyy = "        guzel olur guzel bakarsan      ";

        //1.)bu stringin bas ve sonundaki bosluklari siliniz

        String zzz=yyy.trim();
        System.out.println(zzz);

        // burda ise butun bosluklari sileriz
        String bbb= yyy.replace(" ","");
        System.out.println(bbb);


        //2.)asagida ki urunlerin toplam fiyatini bulunuz
        String tv="$50";
        String radio="$50";

        String hhh=tv.replace("$","");
        System.out.println(hhh);

        String ttt=radio.replace("$","");
        System.out.println(ttt);

        int aaa=Integer.valueOf("50");
        int lll=Integer.valueOf("50");
        System.out.println(aaa+lll);

        //3.)cumlenin ilk harfini ve cumlenin son harfini yazalim
        //   "    ali cAN  "
        String y="    ali cAN  ";
        char h=y.charAt(4);
        System.out.println(h);
        char n=y.charAt(10);
        System.out.println(n);

        //2.yol
        //en kestirme yol

        System.out.println(y.toUpperCase().trim().charAt(0));

        System.out.println(y.toUpperCase().trim().charAt(4));


        //4.) bir stringin hiç karakter içermedi





    }






}
