package W_3_D_1_ForLoops;

public class odev_3W_Day_1 {
    public static void main(String[] args){

     /* for(int i=0;i<100;i++){
          System.out.println(i);
      }
      for(int i=15;i<100;i++){
System.out.println(i);
      }

        for(int i=99;i>=0;i--){
            System.out.print(" "+i);
        }

        for(int i=0;i<100;i+=2){
            System.out.println(i);
                }
        for(int i=0;i<100;i++){
            if(i%2==0){  //veya (i%2!=1)
                System.out.println(" "+i);
            }
        }
        for(int i=10;i<1000;i+=10){ //i++ için if(i%10==0)
            System.out.print(i+" ");

        }

        int sonuc=1;
        for(int i=6;i>=1;i--){
           sonuc*=i;//sonuc=sonuc*i;
           //1.loop sonuc=sonuc*i;sonuc=1*6
           //2.loop sonuc=sonuc*i;sonuc=6*5
           //3.loop sonuc=sonuc*i;sonuc=30*4
           //4.loop sonuc=sonuc*i;sonuc=120*3
           //5.loop sonuc=sonuc*i;sonuc=360*2
           //6.loop sonuc=sonuc*i;sonuc=720*1


        }System.out.println(" 6!  "+sonuc);

       Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir faktoriyelini alalım");

        int faktoriyel= scan.nextInt();
        int sonuc=1;
        for(int i=faktoriyel;i>=1;i--){  // veya for(int i=1;i<=faktoriyel;i++)
            sonuc*=i;


        }System.out.println(sonuc);*/

        int k=1;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }













    }


}
