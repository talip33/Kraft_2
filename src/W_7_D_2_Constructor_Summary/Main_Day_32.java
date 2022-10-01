package W_7_D_2_Constructor_Summary;

public class Main_Day_32 {
    public static void main(String[] args) {

       /* Square square_1=new Square();
        square_1.sideLenght=5;
        System.out.println(square_1.calculateArea());
        System.out.println(square_1.calculatePerimeter());

        Square square_2=new Square(8);
        System.out.println(square_2.calculatePerimeter());
        System.out.println(square_2.calculateArea());

        System.out.println(Square.calculateArea(8));

        Pencil benimkalem=new Pencil();
        Pencil benimkalem_2=new Pencil("sarı",12,false);
        Pencil benimkalem_3=new Pencil();
        System.out.println(benimkalem_2.haveEraser);
        System.out.println(benimkalem_2.lenght);
        System.out.println(benimkalem_2.color);
        benimkalem_2.write();
        benimkalem_2.delete();


        Cat pekmez=new Cat("yeşil","tekir",true,true);
        System.out.println(pekmez.eyeColor);
        System.out.println(pekmez.food());  */


        KraftBank enes=new KraftBank(123125254,"Enes Tor",true);

        System.out.println(enes.customerToken);
        enes.addMoney(500);
        System.out.println(enes.customerAccount);
        enes.addMoney(100);
        System.out.println(enes.customerFullName);
        System.out.println(enes.customerId);
        enes.addMoney(1000);
        System.out.println(enes.customerAccount);


    }
    public static String changeFullname(KraftBank kraftBankcustomer,String fullName){
        kraftBankcustomer.customerFullName=fullName;
        return fullName;
    }
    public static String changetoken(KraftBank kraftBankcustomer,String token){
        kraftBankcustomer.customerToken=token;
        return token;
    }


}
