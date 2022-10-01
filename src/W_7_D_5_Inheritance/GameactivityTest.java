package W_7_D_5_Inheritance;

import java.util.Scanner;

public class GameactivityTest {
    public static void main(String[] args) {
        //kullanıcıdan kac hedfle karşılaştığını sorun verdiği
       // cevaba göre rank tespit edin

        Scanner sc=new Scanner(System.in);
        System.out.println("kaç hedefle karşılaştın");
        int düşman=sc.nextInt();
        System.out.println("kaç hedef vurdun");
        int isabet=sc.nextInt();
        Challange challange=new Challange(düşman,isabet);
        System.out.println(challange.getRank());


    }
}
