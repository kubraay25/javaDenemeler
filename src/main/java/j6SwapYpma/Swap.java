package j6SwapYpma;

public class Swap {

    /*  swap: bir dizi içindeki elemanların yerini değiştirmek
        temp:Java programlama dilinde "temp" genellikle geçici bir değişkeni veya geçici bir değeri ifade eder.
             Programcılar, bir değişkenin değerini geçici olarak saklamak veya
             geçici bir değer hesaplamak için "temp" adını sıklıkla kullanırlar.
    */
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;
        System.out.println(a);

        //2.yoll*************** interwiev *****************

        a = a + b;
        b = a - b;
        a = a - b;
    }
}
