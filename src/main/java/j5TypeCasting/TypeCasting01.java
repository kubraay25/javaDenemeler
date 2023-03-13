package j5TypeCasting;

public class TypeCasting01 {

    /* --> numeric primitive data type'larin birbirine donusturulmesine denir
       --> numeric data type'lar :byte,short,int,log,float,double
       --> kucuk data type'ini buyuk data type'ina cevirmeye "Autowidening(otovaydining)" denir
       --> buyuk data type'ini kucuk data type'ina cevirmeye "ExplicitNarrowing(eksplisitiynerroving) denir

     */

    public static void main(String[] args) {
        //example: int data type'ini float data type'ina ceviriniz
        int population= 700000;
        float populationFloat=population;
        System.out.println(populationFloat);



        //Example: long data type'ini short data type'ina cevirelim
        long weight=13;
        short weightInt=(short)weight;
        System.out.println(weightInt);
    }


}
