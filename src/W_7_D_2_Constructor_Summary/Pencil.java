package W_7_D_2_Constructor_Summary;

public class Pencil {
//    Pencil adında bir class oluşturun, color, lenght,
//      haveEraser adında fields tanımlayın,
//    constructors (4 adet) , write ve delete metodları
//    oluşturarak main metodunda bu class dan
//bir obje oluşturun.(this() metodu kullanılacak)

    public String color;
    public int lenght;
    public boolean haveEraser;   //silgisi var mı

    public Pencil(){

    }
    public Pencil(String color){
        this.color=color;
    }
    public Pencil(String color,int lenght){
        this.color=color;
        this.lenght=lenght;
    }
    public Pencil(String color,int lenght,boolean haveEraser){
        this.color=color;
        this.lenght=lenght;
        this.haveEraser=haveEraser;
    }
    public void write(){
        System.out.println("kalem yazmaya başladı");
    }
    public void delete(){
        if (this.haveEraser){
            System.out.println("silme işlemi başarılı");
        }else System.out.println("silme bararısız");

    }
}
