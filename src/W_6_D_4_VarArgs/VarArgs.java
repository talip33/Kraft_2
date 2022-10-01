package W_6_D_4_VarArgs;

public class VarArgs {
    public static void main(String[] args) {


sum(4,2,3,6,58,9,8);
sum(1,77,55);
sum(10,20,30,40);

concat("ja","va"," ","insanları");
concat("ja","va");
        System.out.println(concat1("jav", "va", "pyhton"));

    }
    public static void sum(int... sayilar){    //variable argments
        //System.out.println(sayilar[0]);
        int sum=0;
        for (int i:sayilar ) {
            sum+=i;

        }
        System.out.println(sum);
    }

    public static void concat(String... strs){

       String empty="";
        for (String s:strs ) {
            empty+=s;

        }
        System.out.println(empty);

    }
    public static String concat1(String... strs){
        String empty="";
        for (int i = 0; i < strs.length; i++) {
            empty+=strs[i].charAt(0);
        }
        return empty;
    }



}
