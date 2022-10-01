package W_7_D_2_Constructor_Summary;

public class Cat {


    public String eyeColor;
    public String breed;
    public boolean isFat;
    public boolean isPet;

    public Cat() {
    }

    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat(String eyeColor, String breed) {
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public Cat(String eyeColor, String breed, boolean isFat) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
    }

    public Cat(String eyeColor, String breed, boolean isFat, boolean isPet) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
        this.isPet = isPet;
    }

    //    Cat adında bir class oluşturun, eyeColor, breed,  ,
//    isPet adında fields tanımlayın,
//     constructors (5 adet), sleep, food,
//     run metodları oluşturarak main metodunda bu class dan
//     bir obje oluşturun


    public void sleep(){
        System.out.println("uyuyor");
    }
    public String food(){
        return "yemek yiyor";
    }
    public String run(){
        return "gidiyor";
    }

}
