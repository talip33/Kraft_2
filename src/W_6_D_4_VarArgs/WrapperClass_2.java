package W_6_D_4_VarArgs;

public class WrapperClass_2 {
    public static void main(String[] args) {

        Integer I=10;
       int i= I.intValue();
       // System.out.println("i = " + i);

        Byte B=100;
        byte b=B.byteValue();
        //System.out.println("b = " + b);

        Boolean BL=true;
        boolean bl=BL.booleanValue();
        //System.out.println("bl = " + bl);

    String str22 = "22##£[##$££>>j[{£a[v[]]a";
    String empy="";
        for (int j = 0; j < str22.length(); j++) {
            if(Character.isAlphabetic(str22.charAt(j))){
                empy+=str22.charAt(j); }


        }
        //System.out.println("empy = " + empy);


        String str2 = "|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>\"+\n" +
                "\">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*l\"+\n" +
                "\"*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        String empy1="";
        for (int j = 0; j < str2.length(); j++) {
            if(Character.isAlphabetic(str2.charAt(j)) || str2.charAt(j)==' '){
                empy1+=str2.charAt(j); }


        }
       // System.out.println("empy1 = " + empy1);


        String str3="A number is a mathematical object used to count," +
                " measure, and label. The original examples are the natural " +
                "numbers 1, 2, 3, 4, and so forth";

        String empy2="";
        int sum=0;
        for (int j = 0; j < str3.length(); j++) {
            if(Character.isDigit(str3.charAt(j)))
            {
                sum+=Integer.parseInt(str3.charAt(j)+"");
                //empy2+=str3.charAt(j);
                }


        }
        System.out.println("sum = " + sum);
        //System.out.println("empy2 = " + empy2);

    }


}
