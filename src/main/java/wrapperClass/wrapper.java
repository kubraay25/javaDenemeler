package wrapperClass;

public class wrapper {

    //butun primitive'ler icin wrapper class vardır
    //primitive wrapper yapmaya: AUTOBOXING(otobaksing) denir
    //wrapperi primitive yapmaya: UNBOXİNG(anbaksing) denir
    //Primitive wrapper sınıfları, Java gibi bazı programlama dillerinde temel veri türlerinin (int, double, boolean vb.) nesne olarak kullanılabilmesini sağlar. Bu sınıflar, bir nesne gibi davranarak,
    // temel veri türlerinin özelliklerini ve işlevlerini kullanmamıza olanak tanır.

    /* char --> Character
       boolean --> Boolean
       byte --> Byte
       shoort --> Short
       int --> Integer
       long --> Long
       float --> Float
       double --> Double


     */


    // Example 1:short data type nın minimum ve maximum degerini kod yazarak bulunuz
    // int data type nın minimum degeri ile byte data typenın max degerinin toplamını bukunuz


    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        System.out.println(min+max);


        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);
        int toplamfiyat =Integer.valueOf(shoes)+Integer.valueOf(shirt);
        System.out.println(toplamfiyat);
        System.out.println();
        System.out.println();
        System.out.println();

        char c3= 'a';
        System.out.println(c3);


        char c1='k';
        char c2='K';
        System.out.println(c1 +""+ c2);























    }

}
