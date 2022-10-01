package W_4_D_2_Class_Object;

public class Summary {
    public static void main(String[] args) {
        System.out.println("ebob(60,50) = " + ebob(60, 50));
        minimum(60,50);
        //kullanıcıdan iki sayı al bunların en büyük ortak bölenini
        // yazdırın


    }
         public static int ebob(int a,int b){

            int sonuc=1;
            //for(int i=1;i<=Math.max(a,b);i++){
for(int i=1;i<=minimum(a,b);i++){
    if(a%i==0 && b%i==0){
        sonuc=i;
}

            //}


                }return sonuc;

            }
            public static int minimum(int a,int b){
            int min=(a>=b) ? b:a;
            return min;
            }


}
