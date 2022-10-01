package day_4review;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("i am read to bea java");
        System.out.println("\t1\n2\n\t3\n4\n\t5");
//        3- "hello world" yazdırın
        System.out.println("\"hello\"");
//        4- 21'' monitor yazdırın
        System.out.println("21\"monitor");
//        5- 'eve geç kalma' dedi yazdırın
        System.out.println("'eve gec kalma'dedi.");
        System.out.println("**************");
        System.out.println("            **");
        System.out.println("            **");
        System.out.println("            **");
        System.out.println("            **");
        System.out.println("            **");
        System.out.println("**         **");
        System.out.println("**        **");
        System.out.println("  **   ****");
        System.out.println("   ****");
//        - Ahmet
//        GÜL
//        30 yaşımdayım
//        İstanbul da yasıyorum
//        şeklindeki pankartı tek satır kodla konsola yazdırı

        System.out.println("Ahmet\nGUL\n30 yasindayim\nİstanbul da yasıyoru");
        System.out.println("");
//        3 degişken oluşturun(declare) int, String ve char tipinde olsun ve
//        farklı değerler atayarak(assign), konsolda aşağıda ki gibi yazdırın.
//        Example:"35,Ahmet,M"veya "30,Ayşe,W"
//        9- bro1 ve bro2 kardeşlerin yaşlarını tek satırda declare edin ve yaşlarını
//        assign edin.
        int i=35;
        String s="tt";
        char ch='m';
        System.out.println("\""+i+","+s+","+ch+"\"");

        String s1="Talip",s2="Tıraş",s3=s1+" "+s2;
        System.out.println(s3);
int bro1=12,bro2=bro1;
        System.out.println("Bro1 ve bor2 kardesler "+bro2+" yasindadir." );






//        LPG, motorin, gasoline yakıt tiplerini tek satırda string türünde
//        tanımlayın(declare)
        String LPG,motorin,benzin;

        double lpg=10.35,mot=25.55,gas=26.25;
        System.out.println("\nPompa fiyatlarina BUYUK indirim geldi\n lpg "+lpg+" motorin "+mot+" benzin "+gas+ " oldu");


        int i2=1453;
        int iy=1455;
        System.out.println("\n\nFatih Sultan Mehmet Istanbul'u " +i2+" yilinda fethetmistir.");
        int dCevap=1453;
        boolean correctAnswer =iy==dCevap;
        System.out.println(correctAnswer);


//        Yarıçapı (radius) x olan çemberin alanını
//        versin. Yarıçap(radius) ve alan(area) olmak üzere 2 değişken
//        oluşturun. Reminder: Pi=3.14

        double dpi=3.14,dr=8,da=(dpi*(dr*dr));
        System.out.println("\n"+"Alan "+da+" cm²");

//
//        *******
//        *     *
//        *     *
//        *******
//        Konsola yazdırın.
        System.out.println("********                *");
        System.out.println("*      *              *  *");
        System.out.println("*      *             *    *");
        System.out.println("********            ********");

        int myAge=8;double myDouble;
        myDouble=myAge;
        System.out.println(myDouble);
        System.out.println(myAge);



        System.out.println("  ___");
        System.out.println(" /   \\");
        System.out.println("{ ° ° }");
        System.out.println("   |  ");
        System.out.println("   ¬ ");
        System.out.println("  \\__/");




        int myAge1=8;
                double myDouble1=myAge;
        System.out.println(myDouble1);

        int version= 2;
        double ver=version;


        long uzun =3;
        ver=uzun;

        float kayan= uzun;
        System.out.println(ver);
        System.out.println(kayan);


        //Narrowing

        double d =9.78;
        int i5=(int)d;
        System.out.println(i5);


        //2.3 ,4.1 ,5 sayılarını uygun type
        double d11=2.3,d12=4.1;int i11=5;
        int i12 = (int)d11+(int)d12+i11;
        System.out.println(i12);
        //2.3 ,4.4, 5.3,5
        double no1=2.3,no2=4.4,no3=5.3,no4=5;
        int top =(int)no1+(int)no2+(int)no3+(int)no4;
        int top2 =(int)(no1+no2+no3+no4);

        System.out.println(top);
        System.out.println(top2);

        System.out.println("tt"+10+5);
        System.out.println(10+5+"tt");

        String tt1= 2.211+2.3111+"";
        System.out.println(tt1);

    }


}
