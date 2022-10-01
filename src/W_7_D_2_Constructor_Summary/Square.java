package W_7_D_2_Constructor_Summary;

public class Square {
//    Square adında bir class oluşturun, sideLenght adında field tanımlayın,
//     constructors,calculateArea ve calculatePerimeter metodları oluşturarak
//     main metodunda bu class dan bir obje oluşturun

public int sideLenght;

    public Square(){

}
    public Square(int sideLenght){
        this.sideLenght=sideLenght;
    }
    public int calculateArea(){   //alan hesaplama metodu
        return (int)Math.pow(this.sideLenght,2);
    }
    public static double calculateArea(int sideLenght){  //alan hesaplama metodu
        return Math.pow(sideLenght,2);
    }
    public int calculatePerimeter(){  //çevre hesaplama metodu
        return 4*this.sideLenght;
    }
    public double calculatePerimeter(int sideLenght){   //çevre hesaplama metodu
        return 4*sideLenght;
    }


}
