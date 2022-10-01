package W_5_D_4_Arrays_2;

public class Arrays_ {
    public static void main(String[] args) {
        int[] a={88,6,8,7,12,66};
        int[] b={88,10,33,77,75};
        //System.out.println(kontrol(a));
        //System.out.println(sayiKontrol(a,88));
       // System.out.println(esit(a,b));
        //System.out.println(Arrays.toString(yeni(a, b)));
        //System.out.println(top(b));
        //System.out.println(enBuyuk(a));
        //System.out.println(Arrays.toString(birls(a, b)));
        //System.out.println(Arrays.toString(ilkSon(a)));
        //System.out.println(Arrays.toString(tersSirala(a)));
       // System.out.println(tekSayi(a));
        int[] iArry=new int[5];
        iArry[0]=10;
        iArry[1]=20;
        iArry[2]=102;
        iArry[3]=150;
        iArry[4]=160;
        for(int i: iArry){
            //System.out.println(i);
        }
        for (int i = 0; i < iArry.length; i++) {
           // System.out.println(iArry[i]);

        }
String [] sArryy=new String[3];
        sArryy[0]="mami";
        sArryy[1]="alp";
        sArryy[2]="beyt";
        //System.out.println(sArryy[0].length());
        //System.out.println(Arrays.toString(sArryy));

    }
    public static boolean kontrol(int[] a){
        return a.length>5;


    }
    public static boolean sayiKontrol(int[] a,int param){
       //int param=5;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==param){
            return true;
            }
        }

    return false;
    }
//2 array kabul eden bir method yazınve arraylerin llk elemanlarıile yeni bir array döndürsün.
//    Int array in elemanlarınıntoplamınıveren bir method yazın
        public static boolean esit(int[] a,int[] b){
//        if (a[0]==b[0]){
////            return true;
////
////            }
    return (a[0]==b[0]);
        }
//        2 array kabul eden bir method yazınve arraylerin
//    llk elemanlarıile yeni bir array döndürsün

    public static int[] yeni(int[]a,int[]b){
        int[] c=new int[2];
       c[0]= a[0];
       c[1]=b[0];
        return c;
    }
//    int array in elemanlarınıntoplamınıveren bir method yazın

    public static int top(int[]a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
//    Verilen 2 arrayi birleştirip array döndüren
//    bir method yazın.
public static int[] birls(int[]a,int[]b){

        int[]c=new int[a.length+b.length];
    for (int i = 0; i < c.length; i++) {
        if(i<a.length){
            c[i]=a[i];
        }else{
            c[i]=b[i-a.length];
        }

    }

return c;
}
//    İnt arry in en büyük elemanının döndüren bir method yazın

    public static int enBuyuk (int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

//    Bir array oluşturun ve ilk ve
//    son element leri swap(yer değiştirme) yapın

    public static int[] ilkSon(int[] a){
        int temp = a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        return a;
    }
//    Bir method yazın ve verilen arry in
//    elemanlarını tersden sıralayıp yeni bir array döndürsün


    public static int[] tersSirala(int[] a){

        int[] temp =new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i]=a[(a.length-1)-i];

        }

        return temp;



    }

//    Bir methodla verilen array ın
//    teksayı indexinde bulunan elemanların toplamını alın.

    public static int tekSayi(int[] a){
        int sum=0;
        for (int i = 1; i < a.length; i+=2) {
            sum+=a[i];

        }

        return sum;
    }





}




