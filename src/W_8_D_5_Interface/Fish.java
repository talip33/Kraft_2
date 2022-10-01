package W_8_D_5_Interface;

public class Fish implements Animal, Food{  //multi inheritance
    //animala implment olmassa bile her iki metodu implement yapmak
    // zorunda hiyerarşık olarak

    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
class chicken implements Food{//iki interface de bağlı oldığu için
    // tüm abstract classrın implemetleri yapmak zorunda

    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}