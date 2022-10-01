package W_7_D_5_Inheritance;

public class Challange extends GameActivite{
    private int shootOption;
    private int pointOfShoot;
    private int shootSucces;// success başarı

    public Challange(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;

        pointOfShoot=1000/shootOption;

        point=pointOfShoot*shootSucces;
        //score=point; //extends(inhetitance kalıtsal) de olsa private
                       // deiğkene sadece get ve setle ulaşılır
        setScore(point);
    }
}
