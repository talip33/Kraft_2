package W_6_D_4_VarArgs;

public class WrapperClass {
    public static void main(String[] args) {

Byte B=new Byte((byte) 127);
Byte B2=new Byte("127");

       // System.out.println("B = " + B);
        //System.out.println("B2 = " + B2);

        Short S=new Short((short) 1000);
        Short S2=new Short("1000");

        Integer I=new Integer(10000);
        Integer I2=new Integer("10000");

        Long L=new Long(1000000);
        Long L2=new Long("1000000");

        Float F=new Float(1.2);
        Float F2=new Float("1.2");

        Double D=new Double(3.14);
        Double D2=new Double("3.14");

        Character C=new Character('a');


        //Autoboxing ---unboxing


        int i=10;
        Integer x=i;//autoboxed

        Integer x1=new Integer(5);
        int i1=x1;//unboxed

        Double db=new Double(10.0);
        double bbb=db;//unboxed

        double mm=new Double(3.14);//unboxed
        System.out.println(i1);

int y=Integer.parseInt("100");
int y1=Integer.parseInt("-100");
int y2=Integer.parseInt("+100");
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

        int y3=Integer.parseInt("100h");// hata verir
int y4=Integer.parseInt("100-");// hata verir
int y5=Integer.parseInt("100+");// hata verir





    }
}
